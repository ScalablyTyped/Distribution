package typings.reactRouterNavigation.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactRouterNavigation.reactRouterNavigationStrings.bottom
import typings.reactRouterNavigation.reactRouterNavigationStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBarProps extends js.Object {
  var hideTabBar: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String] = js.native
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var renderLabel: js.UndefOr[js.Function1[/* props */ TabSubViewProps, ReactNode]] = js.native
  var renderTabBar: js.UndefOr[js.Function1[/* props */ TabSubViewProps, ReactNode]] = js.native
  // <BottomNavigation /> only:
  var renderTabIcon: js.UndefOr[js.Function1[/* props */ TabSubViewProps, ReactNode]] = js.native
  var tabActiveTintColor: js.UndefOr[String] = js.native
  var tabBarIndicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  // <Tabs /> only:
  var tabBarPosition: js.UndefOr[top | bottom] = js.native
  var tabBarStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var tabTintColor: js.UndefOr[String] = js.native
}

object TabBarProps {
  @scala.inline
  def apply(): TabBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabBarProps]
  }
  @scala.inline
  implicit class TabBarPropsOps[Self <: TabBarProps] (val x: Self) extends AnyVal {
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
    def setHideTabBar(value: Boolean): Self = this.set("hideTabBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideTabBar: Self = this.set("hideTabBar", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelStyle(value: StyleProp[TextStyle]): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setLabelStyleNull: Self = this.set("labelStyle", null)
    @scala.inline
    def setRenderLabel(value: /* props */ TabSubViewProps => ReactNode): Self = this.set("renderLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderLabel: Self = this.set("renderLabel", js.undefined)
    @scala.inline
    def setRenderTabBar(value: /* props */ TabSubViewProps => ReactNode): Self = this.set("renderTabBar", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderTabBar: Self = this.set("renderTabBar", js.undefined)
    @scala.inline
    def setRenderTabIcon(value: /* props */ TabSubViewProps => ReactNode): Self = this.set("renderTabIcon", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderTabIcon: Self = this.set("renderTabIcon", js.undefined)
    @scala.inline
    def setTabActiveTintColor(value: String): Self = this.set("tabActiveTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabActiveTintColor: Self = this.set("tabActiveTintColor", js.undefined)
    @scala.inline
    def setTabBarIndicatorStyle(value: StyleProp[ViewStyle]): Self = this.set("tabBarIndicatorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarIndicatorStyle: Self = this.set("tabBarIndicatorStyle", js.undefined)
    @scala.inline
    def setTabBarIndicatorStyleNull: Self = this.set("tabBarIndicatorStyle", null)
    @scala.inline
    def setTabBarPosition(value: top | bottom): Self = this.set("tabBarPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarPosition: Self = this.set("tabBarPosition", js.undefined)
    @scala.inline
    def setTabBarStyle(value: StyleProp[ViewStyle]): Self = this.set("tabBarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarStyle: Self = this.set("tabBarStyle", js.undefined)
    @scala.inline
    def setTabBarStyleNull: Self = this.set("tabBarStyle", null)
    @scala.inline
    def setTabStyle(value: StyleProp[ViewStyle]): Self = this.set("tabStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabStyle: Self = this.set("tabStyle", js.undefined)
    @scala.inline
    def setTabStyleNull: Self = this.set("tabStyle", null)
    @scala.inline
    def setTabTintColor(value: String): Self = this.set("tabTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabTintColor: Self = this.set("tabTintColor", js.undefined)
  }
  
}

