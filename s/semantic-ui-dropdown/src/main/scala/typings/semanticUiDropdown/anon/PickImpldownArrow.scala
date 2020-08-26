package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'downArrow'> */
@js.native
trait PickImpldownArrow extends js.Object {
  var downArrow: Double = js.native
}

object PickImpldownArrow {
  @scala.inline
  def apply(downArrow: Double): PickImpldownArrow = {
    val __obj = js.Dynamic.literal(downArrow = downArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldownArrow]
  }
  @scala.inline
  implicit class PickImpldownArrowOps[Self <: PickImpldownArrow] (val x: Self) extends AnyVal {
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
    def setDownArrow(value: Double): Self = this.set("downArrow", value.asInstanceOf[js.Any])
  }
  
}

