package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.SelectorSettings._Impl, 'menuIcon'> */
@js.native
trait PickImplmenuIcon extends js.Object {
  var menuIcon: String = js.native
}

object PickImplmenuIcon {
  @scala.inline
  def apply(menuIcon: String): PickImplmenuIcon = {
    val __obj = js.Dynamic.literal(menuIcon = menuIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmenuIcon]
  }
  @scala.inline
  implicit class PickImplmenuIconOps[Self <: PickImplmenuIcon] (val x: Self) extends AnyVal {
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
    def setMenuIcon(value: String): Self = this.set("menuIcon", value.asInstanceOf[js.Any])
  }
  
}

