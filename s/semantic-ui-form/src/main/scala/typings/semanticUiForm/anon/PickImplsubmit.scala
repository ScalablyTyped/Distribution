package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl, 'submit'> */
@js.native
trait PickImplsubmit extends js.Object {
  var submit: String = js.native
}

object PickImplsubmit {
  @scala.inline
  def apply(submit: String): PickImplsubmit = {
    val __obj = js.Dynamic.literal(submit = submit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsubmit]
  }
  @scala.inline
  implicit class PickImplsubmitOps[Self <: PickImplsubmit] (val x: Self) extends AnyVal {
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
    def setSubmit(value: String): Self = this.set("submit", value.asInstanceOf[js.Any])
  }
  
}

