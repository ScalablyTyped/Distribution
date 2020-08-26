package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'not'> */
@js.native
trait PickImplnot extends js.Object {
  var not: String = js.native
}

object PickImplnot {
  @scala.inline
  def apply(not: String): PickImplnot = {
    val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnot]
  }
  @scala.inline
  implicit class PickImplnotOps[Self <: PickImplnot] (val x: Self) extends AnyVal {
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
    def setNot(value: String): Self = this.set("not", value.asInstanceOf[js.Any])
  }
  
}

