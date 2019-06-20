package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarTopProps extends js.Object {
  var activeTintColor: java.lang.String
  var allowFontScaling: scala.Boolean
  var iconStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var inactiveTintColor: java.lang.String
  var indicatorStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  var labelStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.TextStyle] = js.undefined
  var navigation: NavigationScreenProp[NavigationState, NavigationParams]
  var position: AnimatedValue
  var showIcon: scala.Boolean
  var showLabel: scala.Boolean
  var tabBarPosition: java.lang.String
  var upperCaseLabel: scala.Boolean
  def getLabel(scene: TabScene): reactLib.reactMod.ReactNode | java.lang.String
  def getOnPress(previousScene: NavigationRoute[NavigationParams], scene: TabScene): js.Function1[/* args */ reactDashNavigationLib.Anon_IndexJumpToIndex, scala.Unit]
  def jumpToIndex(index: scala.Double): scala.Unit
  def renderIcon(scene: TabScene): reactLib.reactMod.ReactElement
}

object TabBarTopProps {
  @scala.inline
  def apply(
    activeTintColor: java.lang.String,
    allowFontScaling: scala.Boolean,
    getLabel: TabScene => reactLib.reactMod.ReactNode | java.lang.String,
    getOnPress: (NavigationRoute[NavigationParams], TabScene) => js.Function1[/* args */ reactDashNavigationLib.Anon_IndexJumpToIndex, scala.Unit],
    inactiveTintColor: java.lang.String,
    indicatorStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle],
    jumpToIndex: scala.Double => scala.Unit,
    navigation: NavigationScreenProp[NavigationState, NavigationParams],
    position: AnimatedValue,
    renderIcon: TabScene => reactLib.reactMod.ReactElement,
    showIcon: scala.Boolean,
    showLabel: scala.Boolean,
    tabBarPosition: java.lang.String,
    upperCaseLabel: scala.Boolean,
    iconStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    labelStyle: reactDashNativeLib.reactDashNativeMod.TextStyle = null
  ): TabBarTopProps = {
    val __obj = js.Dynamic.literal(activeTintColor = activeTintColor, allowFontScaling = allowFontScaling, getLabel = js.Any.fromFunction1(getLabel), getOnPress = js.Any.fromFunction2(getOnPress), inactiveTintColor = inactiveTintColor, indicatorStyle = indicatorStyle.asInstanceOf[js.Any], jumpToIndex = js.Any.fromFunction1(jumpToIndex), navigation = navigation, position = position, renderIcon = js.Any.fromFunction1(renderIcon), showIcon = showIcon, showLabel = showLabel, tabBarPosition = tabBarPosition, upperCaseLabel = upperCaseLabel)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    __obj.asInstanceOf[TabBarTopProps]
  }
}

