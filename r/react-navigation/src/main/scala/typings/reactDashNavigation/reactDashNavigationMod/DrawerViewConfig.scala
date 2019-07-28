package typings.reactDashNavigation.reactDashNavigationMod

import typings.react.reactMod.ComponentType
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNavigation.reactDashNavigationStrings.left
import typings.reactDashNavigation.reactDashNavigationStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerViewConfig extends js.Object {
  var contentComponent: js.UndefOr[ComponentType[DrawerItemsProps]] = js.undefined
  var contentOptions: js.UndefOr[js.Any] = js.undefined
  var drawerBackgroundColor: js.UndefOr[String] = js.undefined
  var drawerPosition: js.UndefOr[left | right] = js.undefined
  var drawerWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object DrawerViewConfig {
  @scala.inline
  def apply(
    contentComponent: ComponentType[DrawerItemsProps] = null,
    contentOptions: js.Any = null,
    drawerBackgroundColor: String = null,
    drawerPosition: left | right = null,
    drawerWidth: Int | Double = null,
    style: StyleProp[ViewStyle] = null
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

