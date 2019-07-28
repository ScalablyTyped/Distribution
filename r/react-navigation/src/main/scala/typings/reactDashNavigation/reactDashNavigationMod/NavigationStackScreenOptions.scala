package typings.reactDashNavigation.reactDashNavigationMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactType
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNavigation.Anon_Horizontal
import typings.reactDashNavigation.reactDashNavigationStrings.default
import typings.reactDashNavigation.reactDashNavigationStrings.inverted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationStackScreenOptions extends js.Object {
  var gestureDirection: js.UndefOr[default | inverted] = js.undefined
  var gestureResponseDistance: js.UndefOr[Anon_Horizontal] = js.undefined
  var gesturesEnabled: js.UndefOr[Boolean] = js.undefined
  var header: js.UndefOr[
    ReactElement | (js.Function1[/* headerProps */ HeaderProps, ReactElement]) | Null
  ] = js.undefined
  var headerBackImage: js.UndefOr[ReactElement] = js.undefined
  var headerBackTitle: js.UndefOr[String | Null] = js.undefined
  var headerBackTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var headerBackground: js.UndefOr[ReactNode | ReactType[_]] = js.undefined
  var headerForceInset: js.UndefOr[HeaderForceInset] = js.undefined
  var headerLeft: js.UndefOr[
    ReactElement | (js.Function1[/* backButtonProps */ HeaderBackButtonProps, ReactElement]) | Null
  ] = js.undefined
  var headerPressColorAndroid: js.UndefOr[String] = js.undefined
  var headerRight: js.UndefOr[ReactElement | Null] = js.undefined
  var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var headerTintColor: js.UndefOr[String] = js.undefined
  var headerTitle: js.UndefOr[String | ReactElement] = js.undefined
  var headerTitleAllowFontScaling: js.UndefOr[Boolean] = js.undefined
  var headerTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var headerTransparent: js.UndefOr[Boolean] = js.undefined
  var headerTruncatedBackTitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object NavigationStackScreenOptions {
  @scala.inline
  def apply(
    gestureDirection: default | inverted = null,
    gestureResponseDistance: Anon_Horizontal = null,
    gesturesEnabled: js.UndefOr[Boolean] = js.undefined,
    header: ReactElement | (js.Function1[/* headerProps */ HeaderProps, ReactElement]) = null,
    headerBackImage: ReactElement = null,
    headerBackTitle: String = null,
    headerBackTitleStyle: StyleProp[TextStyle] = null,
    headerBackground: ReactNode | ReactType[_] = null,
    headerForceInset: HeaderForceInset = null,
    headerLeft: ReactElement | (js.Function1[/* backButtonProps */ HeaderBackButtonProps, ReactElement]) = null,
    headerPressColorAndroid: String = null,
    headerRight: ReactElement = null,
    headerStyle: StyleProp[ViewStyle] = null,
    headerTintColor: String = null,
    headerTitle: String | ReactElement = null,
    headerTitleAllowFontScaling: js.UndefOr[Boolean] = js.undefined,
    headerTitleStyle: StyleProp[TextStyle] = null,
    headerTransparent: js.UndefOr[Boolean] = js.undefined,
    headerTruncatedBackTitle: String = null,
    title: String = null
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

