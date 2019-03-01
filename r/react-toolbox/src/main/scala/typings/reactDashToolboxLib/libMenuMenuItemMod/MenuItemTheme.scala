package typings
package reactDashToolboxLib.libMenuMenuItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemTheme extends js.Object {
  /**
    * Used for the caption inside the item.
    */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root element if it's disabled.
    */
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the icon element if exists.
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used as the root class for the component.
    */
  var menuItem: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root element in case it's selected.
    */
  var selected: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the shortcut element if exists.
    */
  var shortcut: js.UndefOr[java.lang.String] = js.undefined
}

object MenuItemTheme {
  @scala.inline
  def apply(
    caption: java.lang.String = null,
    disabled: java.lang.String = null,
    icon: java.lang.String = null,
    menuItem: java.lang.String = null,
    selected: java.lang.String = null,
    shortcut: java.lang.String = null
  ): MenuItemTheme = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (menuItem != null) __obj.updateDynamic("menuItem")(menuItem)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut)
    __obj.asInstanceOf[MenuItemTheme]
  }
}

