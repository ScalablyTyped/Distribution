package typings
package reactDashRouterDashNavigationLib.reactDashRouterDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationProps extends NavBarProps {
  var cardStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var configureTransition: js.UndefOr[
    js.Function2[
      /* transitionProps */ reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionProps, 
      /* prevTransitionProps */ js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionProps], 
      reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionSpec
    ]
  ] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
}

object NavigationProps {
  @scala.inline
  def apply(
    backButtonTintColor: java.lang.String = null,
    backButtonTitle: java.lang.String = null,
    cardStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    configureTransition: js.Function2[
      /* transitionProps */ reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionProps, 
      /* prevTransitionProps */ js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionProps], 
      reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionSpec
    ] = null,
    hideBackButton: js.UndefOr[scala.Boolean] = js.undefined,
    hideNavBar: js.UndefOr[scala.Boolean] = js.undefined,
    navBarStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    onTransitionEnd: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    onTransitionStart: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    renderLeftButton: js.Function1[/* props */ CardSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    renderNavBar: js.Function1[/* props */ CardSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    renderRightButton: js.Function1[/* props */ CardSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    renderTitle: js.Function1[/* props */ CardSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    title: java.lang.String = null,
    titleStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null
  ): NavigationProps = {
    val __obj = js.Dynamic.literal()
    if (backButtonTintColor != null) __obj.updateDynamic("backButtonTintColor")(backButtonTintColor)
    if (backButtonTitle != null) __obj.updateDynamic("backButtonTitle")(backButtonTitle)
    if (cardStyle != null) __obj.updateDynamic("cardStyle")(cardStyle.asInstanceOf[js.Any])
    if (configureTransition != null) __obj.updateDynamic("configureTransition")(configureTransition)
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton)
    if (!js.isUndefined(hideNavBar)) __obj.updateDynamic("hideNavBar")(hideNavBar)
    if (navBarStyle != null) __obj.updateDynamic("navBarStyle")(navBarStyle.asInstanceOf[js.Any])
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(onTransitionEnd)
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(onTransitionStart)
    if (renderLeftButton != null) __obj.updateDynamic("renderLeftButton")(renderLeftButton)
    if (renderNavBar != null) __obj.updateDynamic("renderNavBar")(renderNavBar)
    if (renderRightButton != null) __obj.updateDynamic("renderRightButton")(renderRightButton)
    if (renderTitle != null) __obj.updateDynamic("renderTitle")(renderTitle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationProps]
  }
}

