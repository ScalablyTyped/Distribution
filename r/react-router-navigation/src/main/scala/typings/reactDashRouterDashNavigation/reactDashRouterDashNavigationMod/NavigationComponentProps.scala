package typings.reactDashRouterDashNavigation.reactDashRouterDashNavigationMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNavigation.reactDashNavigationMod.NavigationTransitionProps
import typings.reactDashNavigation.reactDashNavigationMod.NavigationTransitionSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationComponentProps extends NavigationProps {
  var children: js.UndefOr[js.Array[ReactElement]] = js.undefined
}

object NavigationComponentProps {
  @scala.inline
  def apply(
    backButtonTintColor: String = null,
    backButtonTitle: String = null,
    cardStyle: StyleProp[ViewStyle] = null,
    children: js.Array[ReactElement] = null,
    configureTransition: (/* transitionProps */ NavigationTransitionProps, /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps]) => NavigationTransitionSpec = null,
    hideBackButton: js.UndefOr[Boolean] = js.undefined,
    hideNavBar: js.UndefOr[Boolean] = js.undefined,
    navBarStyle: StyleProp[ViewStyle] = null,
    onTransitionEnd: /* repeated */ js.Any => Unit = null,
    onTransitionStart: /* repeated */ js.Any => Unit = null,
    renderLeftButton: /* props */ CardSubViewProps => ReactNode = null,
    renderNavBar: /* props */ CardSubViewProps => ReactNode = null,
    renderRightButton: /* props */ CardSubViewProps => ReactNode = null,
    renderTitle: /* props */ CardSubViewProps => ReactNode = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null
  ): NavigationComponentProps = {
    val __obj = js.Dynamic.literal()
    if (backButtonTintColor != null) __obj.updateDynamic("backButtonTintColor")(backButtonTintColor)
    if (backButtonTitle != null) __obj.updateDynamic("backButtonTitle")(backButtonTitle)
    if (cardStyle != null) __obj.updateDynamic("cardStyle")(cardStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (configureTransition != null) __obj.updateDynamic("configureTransition")(js.Any.fromFunction2(configureTransition))
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton)
    if (!js.isUndefined(hideNavBar)) __obj.updateDynamic("hideNavBar")(hideNavBar)
    if (navBarStyle != null) __obj.updateDynamic("navBarStyle")(navBarStyle.asInstanceOf[js.Any])
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction1(onTransitionStart))
    if (renderLeftButton != null) __obj.updateDynamic("renderLeftButton")(js.Any.fromFunction1(renderLeftButton))
    if (renderNavBar != null) __obj.updateDynamic("renderNavBar")(js.Any.fromFunction1(renderNavBar))
    if (renderRightButton != null) __obj.updateDynamic("renderRightButton")(js.Any.fromFunction1(renderRightButton))
    if (renderTitle != null) __obj.updateDynamic("renderTitle")(js.Any.fromFunction1(renderTitle))
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationComponentProps]
  }
}

