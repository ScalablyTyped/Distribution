package typings.reactRouterNavigation.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavBarProps extends js.Object {
  var backButtonTintColor: js.UndefOr[String] = js.native
  var backButtonTitle: js.UndefOr[String] = js.native
  // Left button
  var hideBackButton: js.UndefOr[Boolean] = js.native
  // General
  var hideNavBar: js.UndefOr[Boolean] = js.native
  var navBarStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var renderLeftButton: js.UndefOr[js.Function1[/* props */ CardSubViewProps, ReactNode]] = js.native
  var renderNavBar: js.UndefOr[js.Function1[/* props */ CardSubViewProps, ReactNode]] = js.native
  // Right button
  var renderRightButton: js.UndefOr[js.Function1[/* props */ CardSubViewProps, ReactNode]] = js.native
  var renderTitle: js.UndefOr[js.Function1[/* props */ CardSubViewProps, ReactNode]] = js.native
  // Title
  var title: js.UndefOr[String] = js.native
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
}

object NavBarProps {
  @scala.inline
  def apply(): NavBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavBarProps]
  }
  @scala.inline
  implicit class NavBarPropsOps[Self <: NavBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackButtonTintColor(value: String): Self = this.set("backButtonTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackButtonTintColor: Self = this.set("backButtonTintColor", js.undefined)
    @scala.inline
    def setBackButtonTitle(value: String): Self = this.set("backButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackButtonTitle: Self = this.set("backButtonTitle", js.undefined)
    @scala.inline
    def setHideBackButton(value: Boolean): Self = this.set("hideBackButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideBackButton: Self = this.set("hideBackButton", js.undefined)
    @scala.inline
    def setHideNavBar(value: Boolean): Self = this.set("hideNavBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideNavBar: Self = this.set("hideNavBar", js.undefined)
    @scala.inline
    def setNavBarStyle(value: StyleProp[ViewStyle]): Self = this.set("navBarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavBarStyle: Self = this.set("navBarStyle", js.undefined)
    @scala.inline
    def setNavBarStyleNull: Self = this.set("navBarStyle", null)
    @scala.inline
    def setRenderLeftButton(value: /* props */ CardSubViewProps => ReactNode): Self = this.set("renderLeftButton", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderLeftButton: Self = this.set("renderLeftButton", js.undefined)
    @scala.inline
    def setRenderNavBar(value: /* props */ CardSubViewProps => ReactNode): Self = this.set("renderNavBar", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderNavBar: Self = this.set("renderNavBar", js.undefined)
    @scala.inline
    def setRenderRightButton(value: /* props */ CardSubViewProps => ReactNode): Self = this.set("renderRightButton", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderRightButton: Self = this.set("renderRightButton", js.undefined)
    @scala.inline
    def setRenderTitle(value: /* props */ CardSubViewProps => ReactNode): Self = this.set("renderTitle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderTitle: Self = this.set("renderTitle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    @scala.inline
    def setTitleStyleNull: Self = this.set("titleStyle", null)
  }
  
}

