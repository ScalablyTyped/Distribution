package typings.reactDashNavigation.reactDashNavigationMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNavigation.Anon_IndexJumpToIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarTopProps extends js.Object {
  var activeTintColor: String
  var allowFontScaling: Boolean
  var iconStyle: js.UndefOr[ViewStyle] = js.undefined
  var inactiveTintColor: String
  var indicatorStyle: StyleProp[ViewStyle]
  var labelStyle: js.UndefOr[TextStyle] = js.undefined
  var navigation: NavigationScreenProp[NavigationState, NavigationParams]
  var position: AnimatedValue
  var showIcon: Boolean
  var showLabel: Boolean
  var tabBarPosition: String
  var upperCaseLabel: Boolean
  def getLabel(scene: TabScene): ReactNode | String
  def getOnPress(previousScene: NavigationRoute[NavigationParams], scene: TabScene): js.Function1[/* args */ Anon_IndexJumpToIndex, Unit]
  def jumpToIndex(index: Double): Unit
  def renderIcon(scene: TabScene): ReactElement
}

object TabBarTopProps {
  @scala.inline
  def apply(
    activeTintColor: String,
    allowFontScaling: Boolean,
    getLabel: TabScene => ReactNode | String,
    getOnPress: (NavigationRoute[NavigationParams], TabScene) => js.Function1[/* args */ Anon_IndexJumpToIndex, Unit],
    inactiveTintColor: String,
    indicatorStyle: StyleProp[ViewStyle],
    jumpToIndex: Double => Unit,
    navigation: NavigationScreenProp[NavigationState, NavigationParams],
    position: AnimatedValue,
    renderIcon: TabScene => ReactElement,
    showIcon: Boolean,
    showLabel: Boolean,
    tabBarPosition: String,
    upperCaseLabel: Boolean,
    iconStyle: ViewStyle = null,
    labelStyle: TextStyle = null
  ): TabBarTopProps = {
    val __obj = js.Dynamic.literal(activeTintColor = activeTintColor, allowFontScaling = allowFontScaling, getLabel = js.Any.fromFunction1(getLabel), getOnPress = js.Any.fromFunction2(getOnPress), inactiveTintColor = inactiveTintColor, indicatorStyle = indicatorStyle.asInstanceOf[js.Any], jumpToIndex = js.Any.fromFunction1(jumpToIndex), navigation = navigation, position = position, renderIcon = js.Any.fromFunction1(renderIcon), showIcon = showIcon, showLabel = showLabel, tabBarPosition = tabBarPosition, upperCaseLabel = upperCaseLabel)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    __obj.asInstanceOf[TabBarTopProps]
  }
}

