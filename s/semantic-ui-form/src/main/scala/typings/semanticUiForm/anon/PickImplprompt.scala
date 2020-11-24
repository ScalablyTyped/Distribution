package typings.semanticUiForm.anon

import typings.semanticUiForm.SemanticUI.Form.PromptSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'prompt'> */
@js.native
trait PickImplprompt extends js.Object {
  
  var prompt: PromptSettings = js.native
}
object PickImplprompt {
  
  @scala.inline
  def apply(prompt: PromptSettings): PickImplprompt = {
    val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplprompt]
  }
  
  @scala.inline
  implicit class PickImplpromptOps[Self <: PickImplprompt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPrompt(value: PromptSettings): Self = this.set("prompt", value.asInstanceOf[js.Any])
  }
}
