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

object NavBarProps {
  @scala.inline
  def apply(
    backButtonTintColor: java.lang.String = null,
    backButtonTitle: java.lang.String = null,
    hideBackButton: js.UndefOr[scala.Boolean] = js.undefined,
    hideNavBar: js.UndefOr[scala.Boolean] = js.undefined,
    navBarStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    renderLeftButton: js.Function1[/* props */ CardSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    renderNavBar: js.Function1[/* props */ CardSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    renderRightButton: js.Function1[/* props */ CardSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    renderTitle: js.Function1[/* props */ CardSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    title: java.lang.String = null,
    titleStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null
  ): NavBarProps = {
    val __obj = js.Dynamic.literal()
    if (backButtonTintColor != null) __obj.updateDynamic("backButtonTintColor")(backButtonTintColor)
    if (backButtonTitle != null) __obj.updateDynamic("backButtonTitle")(backButtonTitle)
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton)
    if (!js.isUndefined(hideNavBar)) __obj.updateDynamic("hideNavBar")(hideNavBar)
    if (navBarStyle != null) __obj.updateDynamic("navBarStyle")(navBarStyle.asInstanceOf[js.Any])
    if (renderLeftButton != null) __obj.updateDynamic("renderLeftButton")(renderLeftButton)
    if (renderNavBar != null) __obj.updateDynamic("renderNavBar")(renderNavBar)
    if (renderRightButton != null) __obj.updateDynamic("renderRightButton")(renderRightButton)
    if (renderTitle != null) __obj.updateDynamic("renderTitle")(renderTitle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavBarProps]
  }
}

