package typings.reactDashNavigation.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNavigation.Anon_IndexJumpToIndex
import typings.reactDashNavigation.reactDashNavigationMod.AnimatedValue
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typings.reactDashNavigation.reactDashNavigationMod.NavigationState
import typings.reactDashNavigation.reactDashNavigationMod.TabBarTopProps
import typings.reactDashNavigation.reactDashNavigationMod.TabScene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabBarTop
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashNavigation.reactDashNavigationMod.TabBarTop] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNavigation.reactDashNavigationMod.TabBarTop].asInstanceOf[String | js.Object]
  def apply(
    activeTintColor: String,
    allowFontScaling: Boolean,
    getLabel: TabScene => TagMod[Any] | String,
    getOnPress: (NavigationRoute[NavigationParams], TabScene) => js.Function1[/* args */ Anon_IndexJumpToIndex, Unit],
    inactiveTintColor: String,
    jumpToIndex: Double => Unit,
    navigation: NavigationScreenProp[NavigationState, NavigationParams],
    position: AnimatedValue,
    renderIcon: TabScene => ReactElement,
    showIcon: Boolean,
    showLabel: Boolean,
    tabBarPosition: String,
    upperCaseLabel: Boolean,
    iconStyle: ViewStyle = null,
    indicatorStyle: StyleProp[ViewStyle] = null,
    labelStyle: TextStyle = null
  ): BuildingComponent[tag.type, typings.reactDashNavigation.reactDashNavigationMod.TabBarTop] = {
    val __obj = js.Dynamic.literal(activeTintColor = activeTintColor, allowFontScaling = allowFontScaling, getLabel = js.Any.fromFunction1(getLabel), getOnPress = js.Any.fromFunction2(getOnPress), inactiveTintColor = inactiveTintColor, jumpToIndex = js.Any.fromFunction1(jumpToIndex), navigation = navigation, position = position, renderIcon = js.Any.fromFunction1(renderIcon), showIcon = showIcon, showLabel = showLabel, tabBarPosition = tabBarPosition, upperCaseLabel = upperCaseLabel)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TabBarTopProps
}

