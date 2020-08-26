package typings.reactNavigationMaterialBottomTabs.typesMod

import typings.react.mod.ReactNode
import typings.reactNavigationMaterialBottomTabs.anon.DefaultHandler
import typings.reactNavigationMaterialBottomTabs.anon.Focused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationMaterialBottomTabOptions extends js.Object {
  var tabBarAccessibilityLabel: js.UndefOr[String] = js.native
  var tabBarBadge: js.UndefOr[Boolean | Double | String] = js.native
  var tabBarColor: js.UndefOr[String] = js.native
  var tabBarIcon: js.UndefOr[ReactNode | (js.Function1[/* props */ Focused, ReactNode])] = js.native
  var tabBarLabel: js.UndefOr[ReactNode] = js.native
  var tabBarOnPress: js.UndefOr[js.Function1[/* props */ DefaultHandler, Unit]] = js.native
  var tabBarTestID: js.UndefOr[String] = js.native
  var tabBarVisible: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
}

object NavigationMaterialBottomTabOptions {
  @scala.inline
  def apply(): NavigationMaterialBottomTabOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationMaterialBottomTabOptions]
  }
  @scala.inline
  implicit class NavigationMaterialBottomTabOptionsOps[Self <: NavigationMaterialBottomTabOptions] (val x: Self) extends AnyVal {
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
    def setTabBarAccessibilityLabel(value: String): Self = this.set("tabBarAccessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarAccessibilityLabel: Self = this.set("tabBarAccessibilityLabel", js.undefined)
    @scala.inline
    def setTabBarBadge(value: Boolean | Double | String): Self = this.set("tabBarBadge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarBadge: Self = this.set("tabBarBadge", js.undefined)
    @scala.inline
    def setTabBarColor(value: String): Self = this.set("tabBarColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarColor: Self = this.set("tabBarColor", js.undefined)
    @scala.inline
    def setTabBarIconFunction1(value: /* props */ Focused => ReactNode): Self = this.set("tabBarIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setTabBarIcon(value: ReactNode | (js.Function1[/* props */ Focused, ReactNode])): Self = this.set("tabBarIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarIcon: Self = this.set("tabBarIcon", js.undefined)
    @scala.inline
    def setTabBarLabel(value: ReactNode): Self = this.set("tabBarLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarLabel: Self = this.set("tabBarLabel", js.undefined)
    @scala.inline
    def setTabBarOnPress(value: /* props */ DefaultHandler => Unit): Self = this.set("tabBarOnPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTabBarOnPress: Self = this.set("tabBarOnPress", js.undefined)
    @scala.inline
    def setTabBarTestID(value: String): Self = this.set("tabBarTestID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarTestID: Self = this.set("tabBarTestID", js.undefined)
    @scala.inline
    def setTabBarVisible(value: Boolean): Self = this.set("tabBarVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarVisible: Self = this.set("tabBarVisible", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

