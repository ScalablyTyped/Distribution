package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps extends js.Object {
  /**
    * If the type is `Check`, then set whether it is checked or not.
    */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The text to display for the menu item.
    */
  var children: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Called when the menu item is clicked. If the type is `Check`, then it passes whether it is checked as an argument.
    */
  var onClick: js.UndefOr[js.Function1[/* checked */ scala.Boolean, scala.Unit]] = js.undefined
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
    protonDashNativeLib.protonDashNativeLibStrings.Check | protonDashNativeLib.protonDashNativeLibStrings.Quit | protonDashNativeLib.protonDashNativeLibStrings.About | protonDashNativeLib.protonDashNativeLibStrings.Preferences | protonDashNativeLib.protonDashNativeLibStrings.Separator | protonDashNativeLib.protonDashNativeLibStrings.Item
  ] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    children: java.lang.String = null,
    onClick: js.Function1[/* checked */ scala.Boolean, scala.Unit] = null,
    `type`: protonDashNativeLib.protonDashNativeLibStrings.Check | protonDashNativeLib.protonDashNativeLibStrings.Quit | protonDashNativeLib.protonDashNativeLibStrings.About | protonDashNativeLib.protonDashNativeLibStrings.Preferences | protonDashNativeLib.protonDashNativeLibStrings.Separator | protonDashNativeLib.protonDashNativeLibStrings.Item = null
  ): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (children != null) __obj.updateDynamic("children")(children)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemProps]
  }
}

