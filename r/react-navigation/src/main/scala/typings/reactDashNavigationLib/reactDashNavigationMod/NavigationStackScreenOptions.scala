package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NavigationStackScreenOptions extends js.Object {
  var gestureDirection: js.UndefOr[
    reactDashNavigationLib.reactDashNavigationLibStrings.default | reactDashNavigationLib.reactDashNavigationLibStrings.inverted
  ] = js.undefined
  var gestureResponseDistance: js.UndefOr[reactDashNavigationLib.Anon_Horizontal] = js.undefined
  var gesturesEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var header: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[_] | (js.Function1[/* headerProps */ HeaderProps, reactLib.reactMod.ReactNs.ReactElement[_]]) | scala.Null
  ] = js.undefined
  var headerBackImage: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var headerBackTitle: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var headerBackTitleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var headerBackground: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var headerForceInset: js.UndefOr[HeaderForceInset] = js.undefined
  var headerLeft: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[_] | (js.Function1[
      /* backButtonProps */ HeaderBackButtonProps, 
      reactLib.reactMod.ReactNs.ReactElement[_]
    ]) | scala.Null
  ] = js.undefined
  var headerPressColorAndroid: js.UndefOr[java.lang.String] = js.undefined
  var headerRight: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null] = js.undefined
  var headerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var headerTintColor: js.UndefOr[java.lang.String] = js.undefined
  var headerTitle: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var headerTitleAllowFontScaling: js.UndefOr[scala.Boolean] = js.undefined
  var headerTitleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var headerTransparent: js.UndefOr[scala.Boolean] = js.undefined
  var headerTruncatedBackTitle: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

