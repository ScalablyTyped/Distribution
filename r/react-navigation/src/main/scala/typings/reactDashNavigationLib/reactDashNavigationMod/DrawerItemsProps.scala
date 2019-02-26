package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerItemsProps extends js.Object {
  var activeBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var activeItemKey: js.UndefOr[java.lang.String] = js.undefined
  var activeLabelStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var activeTintColor: js.UndefOr[java.lang.String] = js.undefined
  var drawerPosition: reactDashNavigationLib.reactDashNavigationLibStrings.left | reactDashNavigationLib.reactDashNavigationLibStrings.right
  var iconContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var inactiveBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var inactiveLabelStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var inactiveTintColor: js.UndefOr[java.lang.String] = js.undefined
  var itemStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var items: js.Array[NavigationRoute[NavigationParams]]
  var itemsContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var labelStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var navigation: NavigationScreenProp[DrawerNavigationState, NavigationParams]
  var screenProps: js.UndefOr[js.Any] = js.undefined
  def getLabel(scene: DrawerScene): reactLib.reactMod.ReactNs.ReactNode | java.lang.String
  def onItemPress(info: DrawerItem): scala.Unit
  def renderIcon(scene: DrawerScene): reactLib.reactMod.ReactNs.ReactNode
}

