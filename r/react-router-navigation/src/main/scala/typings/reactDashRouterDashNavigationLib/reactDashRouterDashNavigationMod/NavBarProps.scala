package typings
package reactDashRouterDashNavigationLib.reactDashRouterDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NavBarProps extends js.Object {
  var backButtonTintColor: js.UndefOr[java.lang.String] = js.undefined
  var backButtonTitle: js.UndefOr[java.lang.String] = js.undefined
  // Left button
  var hideBackButton: js.UndefOr[scala.Boolean] = js.undefined
  // General
  var hideNavBar: js.UndefOr[scala.Boolean] = js.undefined
  var navBarStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var renderLeftButton: js.UndefOr[js.Function1[/* props */ CardSubViewProps, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var renderNavBar: js.UndefOr[js.Function1[/* props */ CardSubViewProps, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  // Right button
  var renderRightButton: js.UndefOr[js.Function1[/* props */ CardSubViewProps, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var renderTitle: js.UndefOr[js.Function1[/* props */ CardSubViewProps, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  // Title
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
}

