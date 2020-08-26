package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'email'> */
@js.native
trait PickImplemail extends js.Object {
  var email: String = js.native
}

object PickImplemail {
  @scala.inline
  def apply(email: String): PickImplemail = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplemail]
  }
  @scala.inline
  implicit class PickImplemailOps[Self <: PickImplemail] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
  }
  
}

