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
  def getLabel(scene: TabScene): reactLib.reactMod.ReactNs.ReactNode | java.lang.String
  def getOnPress(previousScene: NavigationRoute[NavigationParams], scene: TabScene): js.Function1[/* args */ reactDashNavigationLib.Anon_PreviousScene, scala.Unit]
  def getTestIDProps(scene: TabScene): js.Function1[/* scene */ TabScene, _]
  def jumpToIndex(index: scala.Double): scala.Unit
  def renderIcon(scene: TabScene): reactLib.reactMod.ReactNs.ReactNode
}

