package typings.reactDashNavigation.reactDashNavigationMod

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNavigation.reactDashNavigationStrings.left
import typings.reactDashNavigation.reactDashNavigationStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerItemsProps extends js.Object {
  var activeBackgroundColor: js.UndefOr[String] = js.undefined
  var activeItemKey: js.UndefOr[String] = js.undefined
  var activeLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var activeTintColor: js.UndefOr[String] = js.undefined
  var drawerPosition: left | right
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var inactiveBackgroundColor: js.UndefOr[String] = js.undefined
  var inactiveLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var inactiveTintColor: js.UndefOr[String] = js.undefined
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var items: js.Array[NavigationRoute[NavigationParams]]
  var itemsContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var navigation: NavigationScreenProp[DrawerNavigationState, NavigationParams]
  var screenProps: js.UndefOr[js.Any] = js.undefined
  def getLabel(scene: DrawerScene): ReactNode | String
  def onItemPress(info: DrawerItem): Unit
  def renderIcon(scene: DrawerScene): ReactNode
}

object DrawerItemsProps {
  @scala.inline
  def apply(
    drawerPosition: left | right,
    getLabel: DrawerScene => ReactNode | String,
    items: js.Array[NavigationRoute[NavigationParams]],
    navigation: NavigationScreenProp[DrawerNavigationState, NavigationParams],
    onItemPress: DrawerItem => Unit,
    renderIcon: DrawerScene => ReactNode,
    activeBackgroundColor: String = null,
    activeItemKey: String = null,
    activeLabelStyle: StyleProp[TextStyle] = null,
    activeTintColor: String = null,
    iconContainerStyle: StyleProp[ViewStyle] = null,
    inactiveBackgroundColor: String = null,
    inactiveLabelStyle: StyleProp[TextStyle] = null,
    inactiveTintColor: String = null,
    itemStyle: StyleProp[ViewStyle] = null,
    itemsContainerStyle: StyleProp[ViewStyle] = null,
    labelStyle: StyleProp[TextStyle] = null,
    screenProps: js.Any = null
  ): DrawerItemsProps = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], getLabel = js.Any.fromFunction1(getLabel), items = items, navigation = navigation, onItemPress = js.Any.fromFunction1(onItemPress), renderIcon = js.Any.fromFunction1(renderIcon))
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

