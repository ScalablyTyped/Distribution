package typings.reactDashToolbox.libMenuMenuItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemTheme extends js.Object {
  /**
    * Used for the caption inside the item.
    */
  var caption: js.UndefOr[String] = js.undefined
  /**
    * Added to the root element if it's disabled.
    */
  var disabled: js.UndefOr[String] = js.undefined
  /**
    * Used for the icon element if exists.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * Used as the root class for the component.
    */
  var menuItem: js.UndefOr[String] = js.undefined
  /**
    * Added to the root element in case it's selected.
    */
  var selected: js.UndefOr[String] = js.undefined
  /**
    * Used for the shortcut element if exists.
    */
  var shortcut: js.UndefOr[String] = js.undefined
}

object MenuItemTheme {
  @scala.inline
  def apply(
    caption: String = null,
    disabled: String = null,
    icon: String = null,
    menuItem: String = null,
    selected: String = null,
    shortcut: String = null
  ): MenuItemTheme = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (menuItem != null) __obj.updateDynamic("menuItem")(menuItem.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemTheme]
  }
}

