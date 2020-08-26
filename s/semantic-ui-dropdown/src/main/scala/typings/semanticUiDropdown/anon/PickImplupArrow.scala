package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'upArrow'> */
@js.native
trait PickImplupArrow extends js.Object {
  var upArrow: Double = js.native
}

object PickImplupArrow {
  @scala.inline
  def apply(upArrow: Double): PickImplupArrow = {
    val __obj = js.Dynamic.literal(upArrow = upArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplupArrow]
  }
  @scala.inline
  implicit class PickImplupArrowOps[Self <: PickImplupArrow] (val x: Self) extends AnyVal {
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
    def setUpArrow(value: Double): Self = this.set("upArrow", value.asInstanceOf[js.Any])
  }
  
}

