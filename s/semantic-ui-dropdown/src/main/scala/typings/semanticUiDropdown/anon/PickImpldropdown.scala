package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'dropdown'> */
@js.native
trait PickImpldropdown extends js.Object {
  var dropdown: String = js.native
}

object PickImpldropdown {
  @scala.inline
  def apply(dropdown: String): PickImpldropdown = {
    val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldropdown]
  }
  @scala.inline
  implicit class PickImpldropdownOps[Self <: PickImpldropdown] (val x: Self) extends AnyVal {
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
    def setDropdown(value: String): Self = this.set("dropdown", value.asInstanceOf[js.Any])
  }
  
}

