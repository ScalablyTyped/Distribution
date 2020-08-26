package typings.reactMdMenu.menuItemMod

import typings.reactMdList.listItemMod.ListItemProps
import typings.reactMdMenu.defaultMenuItemRendererMod._ValidMenuItem
import typings.reactMdMenu.reactMdMenuStrings.button
import typings.reactMdMenu.reactMdMenuStrings.menuitem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemProps
  extends ListItemProps
     with _ValidMenuItem {
  /**
    * The current role for the menu item. This will eventually be updated for
    * some of the other `menuitem*` widgets.
    */
  @JSName("role")
  var role_MenuItemProps: js.UndefOr[menuitem | button] = js.native
}

object MenuItemProps {
  @scala.inline
  def apply(): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemProps]
  }
  @scala.inline
  implicit class MenuItemPropsOps[Self <: MenuItemProps] (val x: Self) extends AnyVal {
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
    def setRole(value: menuitem | button): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

