package typings.reactDashNavigation.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNavigation.Anon_IndexJumpToIndex
import typings.reactDashNavigation.reactDashNavigationMod.AnimatedValue
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typings.reactDashNavigation.reactDashNavigationMod.NavigationState
import typings.reactDashNavigation.reactDashNavigationMod.TabBarBottomProps
import typings.reactDashNavigation.reactDashNavigationMod.TabScene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabBarBottom
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashNavigation.reactDashNavigationMod.TabBarBottom] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNavigation.reactDashNavigationMod.TabBarBottom].asInstanceOf[String | js.Object]
  def apply(
    activeBackgroundColor: String,
    activeTintColor: String,
    allowFontScaling: Boolean,
    getLabel: TabScene => TagMod[Any] | String,
    getOnPress: (NavigationRoute[NavigationParams], TabScene) => js.Function1[/* args */ Anon_IndexJumpToIndex, Unit],
    getTestIDProps: TabScene => js.Function1[/* scene */ TabScene, _],
    inactiveBackgroundColor: String,
    inactiveTintColor: String,
    jumpToIndex: Double => Unit,
    navigation: NavigationScreenProp[NavigationState, NavigationParams],
    position: AnimatedValue,
    renderIcon: TabScene => TagMod[Any],
    adaptive: js.UndefOr[Boolean] = js.undefined,
    animateStyle: ViewStyle = null,
    labelStyle: TextStyle = null,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    showLabel: js.UndefOr[Boolean] = js.undefined,
    style: ViewStyle = null,
    tabStyle: ViewStyle = null
  ): BuildingComponent[tag.type, typings.reactDashNavigation.reactDashNavigationMod.TabBarBottom] = {
    val __obj = js.Dynamic.literal(activeBackgroundColor = activeBackgroundColor, activeTintColor = activeTintColor, allowFontScaling = allowFontScaling, getLabel = js.Any.fromFunction1(getLabel), getOnPress = js.Any.fromFunction2(getOnPress), getTestIDProps = js.Any.fromFunction1(getTestIDProps), inactiveBackgroundColor = inactiveBackgroundColor, inactiveTintColor = inactiveTintColor, jumpToIndex = js.Any.fromFunction1(jumpToIndex), navigation = navigation, position = position, renderIcon = js.Any.fromFunction1(renderIcon))
    if (!js.isUndefined(adaptive)) __obj.updateDynamic("adaptive")(adaptive)
    if (animateStyle != null) __obj.updateDynamic("animateStyle")(animateStyle)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon)
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TabBarBottomProps
}

