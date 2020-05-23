package typings.protonNative.mod

import typings.protonNative.protonNativeStrings.About
import typings.protonNative.protonNativeStrings.Check
import typings.protonNative.protonNativeStrings.Item
import typings.protonNative.protonNativeStrings.Preferences
import typings.protonNative.protonNativeStrings.Quit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps extends js.Object {
  /**
    * If the type is `Check`, then set whether it is checked or not.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * The text to display for the menu item.
    */
  var children: js.UndefOr[String] = js.undefined
  /**
    * Called when the menu item is clicked. If the type is `Check`, then it passes whether it is checked as an argument.
    */
  var onClick: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  /**
    * How the menu item is displayed.
    *
    * - `Check` - a checkable option in the menu.
    * - `Quit` - a Quit button. This accepts no text.
    * - `About` - an About button. This accepts no text.
    * - `Preferences` - a Preferences button. This accepts no text.
    * - `Separator` - a Separator between menu items. This accepts no text.
    * - `Item` - a normal menu button. This is the default.
    */
  var `type`: js.UndefOr[
    Check | Quit | About | Preferences | typings.protonNative.protonNativeStrings.Separator | Item
  ] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    children: String = null,
    onClick: /* checked */ Boolean => Unit = null,
    `type`: Check | Quit | About | Preferences | typings.protonNative.protonNativeStrings.Separator | Item = null
  ): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemProps]
  }
}

