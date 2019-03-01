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

object DrawerItemsProps {
  @scala.inline
  def apply(
    drawerPosition: reactDashNavigationLib.reactDashNavigationLibStrings.left | reactDashNavigationLib.reactDashNavigationLibStrings.right,
    getLabel: js.Function1[DrawerScene, reactLib.reactMod.ReactNs.ReactNode | java.lang.String],
    items: js.Array[NavigationRoute[NavigationParams]],
    navigation: NavigationScreenProp[DrawerNavigationState, NavigationParams],
    onItemPress: js.Function1[DrawerItem, scala.Unit],
    renderIcon: js.Function1[DrawerScene, reactLib.reactMod.ReactNs.ReactNode],
    activeBackgroundColor: java.lang.String = null,
    activeItemKey: java.lang.String = null,
    activeLabelStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    activeTintColor: java.lang.String = null,
    iconContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    inactiveBackgroundColor: java.lang.String = null,
    inactiveLabelStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    inactiveTintColor: java.lang.String = null,
    itemStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    itemsContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    labelStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    screenProps: js.Any = null
  ): DrawerItemsProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("drawerPosition")(drawerPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("getLabel")(getLabel)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("navigation")(navigation)
    __obj.updateDynamic("onItemPress")(onItemPress)
    __obj.updateDynamic("renderIcon")(renderIcon)
    if (activeBackgroundColor != null) __obj.updateDynamic("activeBackgroundColor")(activeBackgroundColor)
    if (activeItemKey != null) __obj.updateDynamic("activeItemKey")(activeItemKey)
    if (activeLabelStyle != null) __obj.updateDynamic("activeLabelStyle")(activeLabelStyle.asInstanceOf[js.Any])
    if (activeTintColor != null) __obj.updateDynamic("activeTintColor")(activeTintColor)
    if (iconContainerStyle != null) __obj.updateDynamic("iconContainerStyle")(iconContainerStyle.asInstanceOf[js.Any])
    if (inactiveBackgroundColor != null) __obj.updateDynamic("inactiveBackgroundColor")(inactiveBackgroundColor)
    if (inactiveLabelStyle != null) __obj.updateDynamic("inactiveLabelStyle")(inactiveLabelStyle.asInstanceOf[js.Any])
    if (inactiveTintColor != null) __obj.updateDynamic("inactiveTintColor")(inactiveTintColor)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (itemsContainerStyle != null) __obj.updateDynamic("itemsContainerStyle")(itemsContainerStyle.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps)
    __obj.asInstanceOf[DrawerItemsProps]
  }
}

