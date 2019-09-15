package typings.reactDashNavigation.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNavigation.reactDashNavigationMod.DrawerItem
import typings.reactDashNavigation.reactDashNavigationMod.DrawerItemsProps
import typings.reactDashNavigation.reactDashNavigationMod.DrawerNavigationState
import typings.reactDashNavigation.reactDashNavigationMod.DrawerScene
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typings.reactDashNavigation.reactDashNavigationStrings.left
import typings.reactDashNavigation.reactDashNavigationStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerItems
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashNavigation.reactDashNavigationMod.DrawerItems] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNavigation.reactDashNavigationMod.DrawerItems].asInstanceOf[String | js.Object]
  def apply(
    drawerPosition: left | right,
    getLabel: DrawerScene => TagMod[Any] | String,
    items: js.Array[NavigationRoute[NavigationParams]],
    navigation: NavigationScreenProp[DrawerNavigationState, NavigationParams],
    onItemPress: DrawerItem => Unit,
    renderIcon: DrawerScene => TagMod[Any],
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
  ): BuildingComponent[tag.type, typings.reactDashNavigation.reactDashNavigationMod.DrawerItems] = {
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
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DrawerItemsProps
}

