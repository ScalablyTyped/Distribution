package typings.semanticUiForm.anon

import typings.semanticUiForm.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.TemplatesSettings._Impl, 'prompt'> */
trait PickImplpromptPrompt extends StObject {
  
  def prompt(errors: js.Array[String]): JQuery
  @JSName("prompt")
  var prompt_Original: js.Function1[/* errors */ js.Array[String], JQuery]
}
object PickImplpromptPrompt {
  
  @scala.inline
  def apply(prompt: /* errors */ js.Array[String] => JQuery): PickImplpromptPrompt = {
    val __obj = js.Dynamic.literal(prompt = js.Any.fromFunction1(prompt))
    __obj.asInstanceOf[PickImplpromptPrompt]
  }
  
  @scala.inline
  implicit class PickImplpromptPromptMutableBuilder[Self <: PickImplpromptPrompt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrompt(value: /* errors */ js.Array[String] => JQuery): Self = StObject.set(x, "prompt", js.Any.fromFunction1(value))
  }
}
