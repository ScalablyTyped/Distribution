package typings
package reactDashRouterDashNavigationLib.reactDashRouterDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationComponentProps extends NavigationProps {
  var children: js.UndefOr[js.Array[reactLib.reactMod.ReactNs.ReactElement[_]]] = js.undefined
}

object NavigationComponentProps {
  @scala.inline
  def apply(
    backButtonTintColor: java.lang.String = null,
    backButtonTitle: java.lang.String = null,
    cardStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    children: js.Array[reactLib.reactMod.ReactNs.ReactElement[_]] = null,
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
  ): NavigationComponentProps = {
    val __obj = js.Dynamic.literal()
    if (backButtonTintColor != null) __obj.updateDynamic("backButtonTintColor")(backButtonTintColor)
    if (backButtonTitle != null) __obj.updateDynamic("backButtonTitle")(backButtonTitle)
    if (cardStyle != null) __obj.updateDynamic("cardStyle")(cardStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
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
    __obj.asInstanceOf[NavigationComponentProps]
  }
}

