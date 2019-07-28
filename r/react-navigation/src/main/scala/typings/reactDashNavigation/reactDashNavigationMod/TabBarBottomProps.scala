package typings.reactDashNavigation.reactDashNavigationMod

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNavigation.Anon_IndexJumpToIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarBottomProps extends js.Object {
  var activeBackgroundColor: String
  var activeTintColor: String
  var adaptive: js.UndefOr[Boolean] = js.undefined
  var allowFontScaling: Boolean
  var animateStyle: js.UndefOr[ViewStyle] = js.undefined
  var inactiveBackgroundColor: String
  var inactiveTintColor: String
  var labelStyle: js.UndefOr[TextStyle] = js.undefined
  var navigation: NavigationScreenProp[NavigationState, NavigationParams]
  var position: AnimatedValue
  var showIcon: js.UndefOr[Boolean] = js.undefined
  var showLabel: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[ViewStyle] = js.undefined
  var tabStyle: js.UndefOr[ViewStyle] = js.undefined
  def getLabel(scene: TabScene): ReactNode | String
  def getOnPress(previousScene: NavigationRoute[NavigationParams], scene: TabScene): js.Function1[/* args */ Anon_IndexJumpToIndex, Unit]
  def getTestIDProps(scene: TabScene): js.Function1[/* scene */ TabScene, _]
  def jumpToIndex(index: Double): Unit
  def renderIcon(scene: TabScene): ReactNode
}

object TabBarBottomProps {
  @scala.inline
  def apply(
    activeBackgroundColor: String,
    activeTintColor: String,
    allowFontScaling: Boolean,
    getLabel: TabScene => ReactNode | String,
    getOnPress: (NavigationRoute[NavigationParams], TabScene) => js.Function1[/* args */ Anon_IndexJumpToIndex, Unit],
    getTestIDProps: TabScene => js.Function1[/* scene */ TabScene, _],
    inactiveBackgroundColor: String,
    inactiveTintColor: String,
    jumpToIndex: Double => Unit,
    navigation: NavigationScreenProp[NavigationState, NavigationParams],
    position: AnimatedValue,
    renderIcon: TabScene => ReactNode,
    adaptive: js.UndefOr[Boolean] = js.undefined,
    animateStyle: ViewStyle = null,
    labelStyle: TextStyle = null,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    showLabel: js.UndefOr[Boolean] = js.undefined,
    style: ViewStyle = null,
    tabStyle: ViewStyle = null
  ): TabBarBottomProps = {
    val __obj = js.Dynamic.literal(activeBackgroundColor = activeBackgroundColor, activeTintColor = activeTintColor, allowFontScaling = allowFontScaling, getLabel = js.Any.fromFunction1(getLabel), getOnPress = js.Any.fromFunction2(getOnPress), getTestIDProps = js.Any.fromFunction1(getTestIDProps), inactiveBackgroundColor = inactiveBackgroundColor, inactiveTintColor = inactiveTintColor, jumpToIndex = js.Any.fromFunction1(jumpToIndex), navigation = navigation, position = position, renderIcon = js.Any.fromFunction1(renderIcon))
    if (!js.isUndefined(adaptive)) __obj.updateDynamic("adaptive")(adaptive)
    if (animateStyle != null) __obj.updateDynamic("animateStyle")(animateStyle)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon)
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle)
    __obj.asInstanceOf[TabBarBottomProps]
  }
}

