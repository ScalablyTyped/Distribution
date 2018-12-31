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
  def getLabel(scene: TabScene): reactLib.reactMod.ReactNs.ReactNode | java.lang.String
  def getOnPress(previousScene: NavigationRoute[NavigationParams], scene: TabScene): js.Function1[/* args */ reactDashNavigationLib.Anon_PreviousScene, scala.Unit]
  def jumpToIndex(index: scala.Double): scala.Unit
  def renderIcon(scene: TabScene): reactLib.reactMod.ReactNs.ReactElement[_]
}

