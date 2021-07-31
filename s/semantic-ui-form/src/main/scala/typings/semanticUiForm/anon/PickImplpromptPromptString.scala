package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl, 'prompt'> */
trait PickImplpromptPromptString extends StObject {
  
  var prompt: String
}
object PickImplpromptPromptString {
  
  @scala.inline
  def apply(prompt: String): PickImplpromptPromptString = {
    val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpromptPromptString]
  }
  
  @scala.inline
  implicit class PickImplpromptPromptStringMutableBuilder[Self <: PickImplpromptPromptString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
  }
}
