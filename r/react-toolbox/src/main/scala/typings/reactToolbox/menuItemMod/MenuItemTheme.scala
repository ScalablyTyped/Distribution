package typings.reactToolbox.menuItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemTheme extends js.Object {
  /**
    * Used for the caption inside the item.
    */
  var caption: js.UndefOr[String] = js.native
  /**
    * Added to the root element if it's disabled.
    */
  var disabled: js.UndefOr[String] = js.native
  /**
    * Used for the icon element if exists.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * Used as the root class for the component.
    */
  var menuItem: js.UndefOr[String] = js.native
  /**
    * Added to the root element in case it's selected.
    */
  var selected: js.UndefOr[String] = js.native
  /**
    * Used for the shortcut element if exists.
    */
  var shortcut: js.UndefOr[String] = js.native
}

object MenuItemTheme {
  @scala.inline
  def apply(): MenuItemTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemTheme]
  }
  @scala.inline
  implicit class MenuItemThemeOps[Self <: MenuItemTheme] (val x: Self) extends AnyVal {
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setMenuItem(value: String): Self = this.set("menuItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItem: Self = this.set("menuItem", js.undefined)
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setShortcut(value: String): Self = this.set("shortcut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortcut: Self = this.set("shortcut", js.undefined)
  }
  
}

