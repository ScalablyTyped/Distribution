package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerViewConfig extends js.Object {
  var contentComponent: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[DrawerItemsProps]] = js.undefined
  var contentOptions: js.UndefOr[js.Any] = js.undefined
  var drawerBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var drawerPosition: js.UndefOr[
    reactDashNavigationLib.reactDashNavigationLibStrings.left | reactDashNavigationLib.reactDashNavigationLibStrings.right
  ] = js.undefined
  var drawerWidth: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object DrawerViewConfig {
  @scala.inline
  def apply(
    contentComponent: reactLib.reactMod.ReactNs.ComponentType[DrawerItemsProps] = null,
    contentOptions: js.Any = null,
    drawerBackgroundColor: java.lang.String = null,
    drawerPosition: reactDashNavigationLib.reactDashNavigationLibStrings.left | reactDashNavigationLib.reactDashNavigationLibStrings.right = null,
    drawerWidth: scala.Int | scala.Double = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
  ): DrawerViewConfig = {
    val __obj = js.Dynamic.literal()
    if (contentComponent != null) __obj.updateDynamic("contentComponent")(contentComponent.asInstanceOf[js.Any])
    if (contentOptions != null) __obj.updateDynamic("contentOptions")(contentOptions)
    if (drawerBackgroundColor != null) __obj.updateDynamic("drawerBackgroundColor")(drawerBackgroundColor)
    if (drawerPosition != null) __obj.updateDynamic("drawerPosition")(drawerPosition.asInstanceOf[js.Any])
    if (drawerWidth != null) __obj.updateDynamic("drawerWidth")(drawerWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerViewConfig]
  }
}

