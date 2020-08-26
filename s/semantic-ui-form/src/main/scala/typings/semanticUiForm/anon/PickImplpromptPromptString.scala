package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl, 'prompt'> */
@js.native
trait PickImplpromptPromptString extends js.Object {
  var prompt: String = js.native
}

object PickImplpromptPromptString {
  @scala.inline
  def apply(prompt: String): PickImplpromptPromptString = {
    val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpromptPromptString]
  }
  @scala.inline
  implicit class PickImplpromptPromptStringOps[Self <: PickImplpromptPromptString] (val x: Self) extends AnyVal {
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
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
  }
  
}

