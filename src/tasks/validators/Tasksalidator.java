package tasks.validators;

import java.util.ArrayList;
import java.util.List;

import tasks.Tasks;



public class Tasksalidator {

	 public static List<String> validate(Tasks m) {
	        List<String> errors = new ArrayList<String>();

	        String title_error = _validateTitle(m.getTitle());
	        if(!title_error.equals("")) {
	            errors.add(title_error);
	        }

	        String content_error = _validateContent(m.getContent());
	        if(!content_error.equals("")) {
	            errors.add(content_error);
	        }

	        return errors;
	    }

	    private static String _validateTitle(String title) {
	        if(title == null || title.equals("")) {
	            return "タイトルを入力してください。";
	        }

	        return "";
	    }

	    private static String _validateContent(String content) {
	        if(content == null || content.equals("")) {
	            return "メッセージを入力してください。";
	        }

	        return "";
	    }


}
