package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.ClassNameSettings._Impl, 'visible'> */
@js.native
trait PickImplvisible extends js.Object {
  var visible: String = js.native
}

object PickImplvisible {
  @scala.inline
  def apply(visible: String): PickImplvisible = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvisible]
  }
  @scala.inline
  implicit class PickImplvisibleOps[Self <: PickImplvisible] (val x: Self) extends AnyVal {
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
    def setVisible(value: String): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

