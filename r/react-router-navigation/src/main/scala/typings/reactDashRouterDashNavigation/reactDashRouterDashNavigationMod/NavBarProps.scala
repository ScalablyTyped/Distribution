package typings.reactDashRouterDashNavigation.reactDashRouterDashNavigationMod

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavBarProps extends js.Object {
  var backButtonTintColor: js.UndefOr[String] = js.undefined
  var backButtonTitle: js.UndefOr[String] = js.undefined
  // Left button
  var hideBackButton: js.UndefOr[Boolean] = js.undefined
  // General
  var hideNavBar: js.UndefOr[Boolean] = js.undefined
  var navBarStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var renderLeftButton: js.UndefOr[js.Function1[/* props */ CardSubViewProps, ReactNode]] = js.undefined
  var renderNavBar: js.UndefOr[js.Function1[/* props */ CardSubViewProps, ReactNode]] = js.undefined
  // Right button
  var renderRightButton: js.UndefOr[js.Function1[/* props */ CardSubViewProps, ReactNode]] = js.undefined
  var renderTitle: js.UndefOr[js.Function1[/* props */ CardSubViewProps, ReactNode]] = js.undefined
  // Title
  var title: js.UndefOr[String] = js.undefined
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}

object NavBarProps {
  @scala.inline
  def apply(
    backButtonTintColor: String = null,
    backButtonTitle: String = null,
    hideBackButton: js.UndefOr[Boolean] = js.undefined,
    hideNavBar: js.UndefOr[Boolean] = js.undefined,
    navBarStyle: StyleProp[ViewStyle] = null,
    renderLeftButton: /* props */ CardSubViewProps => ReactNode = null,
    renderNavBar: /* props */ CardSubViewProps => ReactNode = null,
    renderRightButton: /* props */ CardSubViewProps => ReactNode = null,
    renderTitle: /* props */ CardSubViewProps => ReactNode = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null
  ): NavBarProps = {
    val __obj = js.Dynamic.literal()
    if (backButtonTintColor != null) __obj.updateDynamic("backButtonTintColor")(backButtonTintColor)
    if (backButtonTitle != null) __obj.updateDynamic("backButtonTitle")(backButtonTitle)
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton)
    if (!js.isUndefined(hideNavBar)) __obj.updateDynamic("hideNavBar")(hideNavBar)
    if (navBarStyle != null) __obj.updateDynamic("navBarStyle")(navBarStyle.asInstanceOf[js.Any])
    if (renderLeftButton != null) __obj.updateDynamic("renderLeftButton")(js.Any.fromFunction1(renderLeftButton))
    if (renderNavBar != null) __obj.updateDynamic("renderNavBar")(js.Any.fromFunction1(renderNavBar))
    if (renderRightButton != null) __obj.updateDynamic("renderRightButton")(js.Any.fromFunction1(renderRightButton))
    if (renderTitle != null) __obj.updateDynamic("renderTitle")(js.Any.fromFunction1(renderTitle))
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavBarProps]
  }
}

