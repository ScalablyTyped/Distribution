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
    reactLib.reactMod.ReactElement[_] | (js.Function1[/* headerProps */ HeaderProps, reactLib.reactMod.ReactElement[_]]) | scala.Null
  ] = js.undefined
  var headerBackImage: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  var headerBackTitle: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var headerBackTitleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var headerBackground: js.UndefOr[reactLib.reactMod.ReactNode | reactLib.reactMod.ReactType[_]] = js.undefined
  var headerForceInset: js.UndefOr[HeaderForceInset] = js.undefined
  var headerLeft: js.UndefOr[
    reactLib.reactMod.ReactElement[_] | (js.Function1[/* backButtonProps */ HeaderBackButtonProps, reactLib.reactMod.ReactElement[_]]) | scala.Null
  ] = js.undefined
  var headerPressColorAndroid: js.UndefOr[java.lang.String] = js.undefined
  var headerRight: js.UndefOr[reactLib.reactMod.ReactElement[_] | scala.Null] = js.undefined
  var headerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var headerTintColor: js.UndefOr[java.lang.String] = js.undefined
  var headerTitle: js.UndefOr[java.lang.String | reactLib.reactMod.ReactElement[_]] = js.undefined
  var headerTitleAllowFontScaling: js.UndefOr[scala.Boolean] = js.undefined
  var headerTitleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var headerTransparent: js.UndefOr[scala.Boolean] = js.undefined
  var headerTruncatedBackTitle: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object NavigationStackScreenOptions {
  @scala.inline
  def apply(
    gestureDirection: reactDashNavigationLib.reactDashNavigationLibStrings.default | reactDashNavigationLib.reactDashNavigationLibStrings.inverted = null,
    gestureResponseDistance: reactDashNavigationLib.Anon_Horizontal = null,
    gesturesEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    header: reactLib.reactMod.ReactElement[_] | (js.Function1[/* headerProps */ HeaderProps, reactLib.reactMod.ReactElement[_]]) = null,
    headerBackImage: reactLib.reactMod.ReactElement[_] = null,
    headerBackTitle: java.lang.String = null,
    headerBackTitleStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    headerBackground: reactLib.reactMod.ReactNode | reactLib.reactMod.ReactType[_] = null,
    headerForceInset: HeaderForceInset = null,
    headerLeft: reactLib.reactMod.ReactElement[_] | (js.Function1[/* backButtonProps */ HeaderBackButtonProps, reactLib.reactMod.ReactElement[_]]) = null,
    headerPressColorAndroid: java.lang.String = null,
    headerRight: reactLib.reactMod.ReactElement[_] = null,
    headerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    headerTintColor: java.lang.String = null,
    headerTitle: java.lang.String | reactLib.reactMod.ReactElement[_] = null,
    headerTitleAllowFontScaling: js.UndefOr[scala.Boolean] = js.undefined,
    headerTitleStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    headerTransparent: js.UndefOr[scala.Boolean] = js.undefined,
    headerTruncatedBackTitle: java.lang.String = null,
    title: java.lang.String = null
  ): NavigationStackScreenOptions = {
    val __obj = js.Dynamic.literal()
    if (gestureDirection != null) __obj.updateDynamic("gestureDirection")(gestureDirection.asInstanceOf[js.Any])
    if (gestureResponseDistance != null) __obj.updateDynamic("gestureResponseDistance")(gestureResponseDistance)
    if (!js.isUndefined(gesturesEnabled)) __obj.updateDynamic("gesturesEnabled")(gesturesEnabled)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerBackImage != null) __obj.updateDynamic("headerBackImage")(headerBackImage)
    if (headerBackTitle != null) __obj.updateDynamic("headerBackTitle")(headerBackTitle)
    if (headerBackTitleStyle != null) __obj.updateDynamic("headerBackTitleStyle")(headerBackTitleStyle.asInstanceOf[js.Any])
    if (headerBackground != null) __obj.updateDynamic("headerBackground")(headerBackground.asInstanceOf[js.Any])
    if (headerForceInset != null) __obj.updateDynamic("headerForceInset")(headerForceInset)
    if (headerLeft != null) __obj.updateDynamic("headerLeft")(headerLeft.asInstanceOf[js.Any])
    if (headerPressColorAndroid != null) __obj.updateDynamic("headerPressColorAndroid")(headerPressColorAndroid)
    if (headerRight != null) __obj.updateDynamic("headerRight")(headerRight)
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (headerTintColor != null) __obj.updateDynamic("headerTintColor")(headerTintColor)
    if (headerTitle != null) __obj.updateDynamic("headerTitle")(headerTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTitleAllowFontScaling)) __obj.updateDynamic("headerTitleAllowFontScaling")(headerTitleAllowFontScaling)
    if (headerTitleStyle != null) __obj.updateDynamic("headerTitleStyle")(headerTitleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTransparent)) __obj.updateDynamic("headerTransparent")(headerTransparent)
    if (headerTruncatedBackTitle != null) __obj.updateDynamic("headerTruncatedBackTitle")(headerTruncatedBackTitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[NavigationStackScreenOptions]
  }
}

