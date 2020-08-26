package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'is'> */
@js.native
trait PickImplis extends js.Object {
  var is: String = js.native
}

object PickImplis {
  @scala.inline
  def apply(is: String): PickImplis = {
    val __obj = js.Dynamic.literal(is = is.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplis]
  }
  @scala.inline
  implicit class PickImplisOps[Self <: PickImplis] (val x: Self) extends AnyVal {
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
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
  }
  
}

