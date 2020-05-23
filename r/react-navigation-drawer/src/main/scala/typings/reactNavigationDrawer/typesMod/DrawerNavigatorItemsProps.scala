package typings.reactNavigationDrawer.typesMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationDrawer.anon.Focused
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerNavigatorItemsProps extends js.Object {
  var activeBackgroundColor: js.UndefOr[String | ThemedColor] = js.undefined
  var activeItemKey: js.UndefOr[String | Null] = js.undefined
  var activeLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var activeTintColor: js.UndefOr[String | ThemedColor] = js.undefined
  var drawerPosition: left | right
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var inactiveBackgroundColor: js.UndefOr[String | ThemedColor] = js.undefined
  var inactiveLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var inactiveTintColor: js.UndefOr[String | ThemedColor] = js.undefined
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var items: js.Array[NavigationRoute[NavigationParams]]
  var itemsContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var screenProps: js.Any
  def getLabel(scene: Scene): ReactNode
  def onItemPress(scene: Focused): Unit
  def renderIcon(scene: Scene): ReactNode
}

object DrawerNavigatorItemsProps {
  @scala.inline
  def apply(
    drawerPosition: left | right,
    getLabel: Scene => ReactNode,
    items: js.Array[NavigationRoute[NavigationParams]],
    onItemPress: Focused => Unit,
    renderIcon: Scene => ReactNode,
    screenProps: js.Any,
    activeBackgroundColor: String | ThemedColor = null,
    activeItemKey: js.UndefOr[Null | String] = js.undefined,
    activeLabelStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    activeTintColor: String | ThemedColor = null,
    iconContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    inactiveBackgroundColor: String | ThemedColor = null,
    inactiveLabelStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    inactiveTintColor: String | ThemedColor = null,
    itemStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    itemsContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    labelStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined
  ): DrawerNavigatorItemsProps = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], getLabel = js.Any.fromFunction1(getLabel), items = items.asInstanceOf[js.Any], onItemPress = js.Any.fromFunction1(onItemPress), renderIcon = js.Any.fromFunction1(renderIcon), screenProps = screenProps.asInstanceOf[js.Any])
    if (activeBackgroundColor != null) __obj.updateDynamic("activeBackgroundColor")(activeBackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(activeItemKey)) __obj.updateDynamic("activeItemKey")(activeItemKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeLabelStyle)) __obj.updateDynamic("activeLabelStyle")(activeLabelStyle.asInstanceOf[js.Any])
    if (activeTintColor != null) __obj.updateDynamic("activeTintColor")(activeTintColor.asInstanceOf[js.Any])
    if (!js.isUndefined(iconContainerStyle)) __obj.updateDynamic("iconContainerStyle")(iconContainerStyle.asInstanceOf[js.Any])
    if (inactiveBackgroundColor != null) __obj.updateDynamic("inactiveBackgroundColor")(inactiveBackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(inactiveLabelStyle)) __obj.updateDynamic("inactiveLabelStyle")(inactiveLabelStyle.asInstanceOf[js.Any])
    if (inactiveTintColor != null) __obj.updateDynamic("inactiveTintColor")(inactiveTintColor.asInstanceOf[js.Any])
    if (!js.isUndefined(itemStyle)) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(itemsContainerStyle)) __obj.updateDynamic("itemsContainerStyle")(itemsContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(labelStyle)) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerNavigatorItemsProps]
  }
}

