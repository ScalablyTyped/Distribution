package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarBottomProps extends js.Object {
  var activeBackgroundColor: java.lang.String
  var activeTintColor: java.lang.String
  var adaptive: js.UndefOr[scala.Boolean] = js.undefined
  var allowFontScaling: scala.Boolean
  var animateStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var inactiveBackgroundColor: java.lang.String
  var inactiveTintColor: java.lang.String
  var labelStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.TextStyle] = js.undefined
  var navigation: NavigationScreenProp[NavigationState, NavigationParams]
  var position: AnimatedValue
  var showIcon: js.UndefOr[scala.Boolean] = js.undefined
  var showLabel: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var tabStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  def getLabel(scene: TabScene): reactLib.reactMod.ReactNode | java.lang.String
  def getOnPress(previousScene: NavigationRoute[NavigationParams], scene: TabScene): js.Function1[/* args */ reactDashNavigationLib.Anon_IndexJumpToIndex, scala.Unit]
  def getTestIDProps(scene: TabScene): js.Function1[/* scene */ TabScene, _]
  def jumpToIndex(index: scala.Double): scala.Unit
  def renderIcon(scene: TabScene): reactLib.reactMod.ReactNode
}

object TabBarBottomProps {
  @scala.inline
  def apply(
    activeBackgroundColor: java.lang.String,
    activeTintColor: java.lang.String,
    allowFontScaling: scala.Boolean,
    getLabel: TabScene => reactLib.reactMod.ReactNode | java.lang.String,
    getOnPress: (NavigationRoute[NavigationParams], TabScene) => js.Function1[/* args */ reactDashNavigationLib.Anon_IndexJumpToIndex, scala.Unit],
    getTestIDProps: TabScene => js.Function1[/* scene */ TabScene, _],
    inactiveBackgroundColor: java.lang.String,
    inactiveTintColor: java.lang.String,
    jumpToIndex: scala.Double => scala.Unit,
    navigation: NavigationScreenProp[NavigationState, NavigationParams],
    position: AnimatedValue,
    renderIcon: TabScene => reactLib.reactMod.ReactNode,
    adaptive: js.UndefOr[scala.Boolean] = js.undefined,
    animateStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    labelStyle: reactDashNativeLib.reactDashNativeMod.TextStyle = null,
    showIcon: js.UndefOr[scala.Boolean] = js.undefined,
    showLabel: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    tabStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null
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

