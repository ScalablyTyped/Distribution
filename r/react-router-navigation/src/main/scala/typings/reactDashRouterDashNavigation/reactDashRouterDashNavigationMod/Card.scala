package typings.reactDashRouterDashNavigation.reactDashRouterDashNavigationMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashRouter.reactDashRouterMod.RouterProps
import typings.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card
  extends RouteProps
     with NavBarProps {
  var key: String
}

object Card {
  @scala.inline
  def apply(
    key: String,
    backButtonTintColor: String = null,
    backButtonTitle: String = null,
    children: (js.Function1[/* props */ RouterProps, ReactNode]) | ReactNode = null,
    component: ComponentClass[RouterProps, ComponentState] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    hideBackButton: js.UndefOr[Boolean] = js.undefined,
    hideNavBar: js.UndefOr[Boolean] = js.undefined,
    navBarStyle: StyleProp[ViewStyle] = null,
    path: String = null,
    render: /* props */ RouterProps => ReactNode = null,
    renderLeftButton: /* props */ CardSubViewProps => ReactNode = null,
    renderNavBar: /* props */ CardSubViewProps => ReactNode = null,
    renderRightButton: /* props */ CardSubViewProps => ReactNode = null,
    renderTitle: /* props */ CardSubViewProps => ReactNode = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null
  ): Card = {
    val __obj = js.Dynamic.literal(key = key)
    if (backButtonTintColor != null) __obj.updateDynamic("backButtonTintColor")(backButtonTintColor)
    if (backButtonTitle != null) __obj.updateDynamic("backButtonTitle")(backButtonTitle)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component)
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton)
    if (!js.isUndefined(hideNavBar)) __obj.updateDynamic("hideNavBar")(hideNavBar)
    if (navBarStyle != null) __obj.updateDynamic("navBarStyle")(navBarStyle.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (renderLeftButton != null) __obj.updateDynamic("renderLeftButton")(js.Any.fromFunction1(renderLeftButton))
    if (renderNavBar != null) __obj.updateDynamic("renderNavBar")(js.Any.fromFunction1(renderNavBar))
    if (renderRightButton != null) __obj.updateDynamic("renderRightButton")(js.Any.fromFunction1(renderRightButton))
    if (renderTitle != null) __obj.updateDynamic("renderTitle")(js.Any.fromFunction1(renderTitle))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
}

