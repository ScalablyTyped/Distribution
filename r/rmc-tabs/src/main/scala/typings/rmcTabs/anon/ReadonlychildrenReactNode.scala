package typings.rmcTabs.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.rmcTabs.modelsMod.Models.TabData
import typings.rmcTabs.propsTypeMod.TabBarPropsType
import typings.rmcTabs.rmcTabsBooleans.`false`
import typings.rmcTabs.rmcTabsStrings.bottom
import typings.rmcTabs.rmcTabsStrings.horizontal
import typings.rmcTabs.rmcTabsStrings.left
import typings.rmcTabs.rmcTabsStrings.right
import typings.rmcTabs.rmcTabsStrings.top
import typings.rmcTabs.rmcTabsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> & std.Readonly<rmc-tabs.rmc-tabs/lib/Tabs.PropsType> */
@js.native
trait ReadonlychildrenReactNode extends js.Object {
  
  val animated: js.UndefOr[Boolean] = js.native
  
  val children: js.UndefOr[ReactNode] = js.native
  
  val destroyInactiveTab: js.UndefOr[Boolean] = js.native
  
  val distanceToChangeTab: js.UndefOr[Double] = js.native
  
  val initialPage: js.UndefOr[Double | String] = js.native
  
  val noRenderContent: js.UndefOr[Boolean] = js.native
  
  val onChange: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.native
  
  val onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.native
  
  val page: js.UndefOr[Double | String] = js.native
  
  val prefixCls: js.UndefOr[String] = js.native
  
  val prerenderingSiblingsNumber: js.UndefOr[Double] = js.native
  
  val renderTabBar: js.UndefOr[(js.Function1[/* props */ TabBarPropsType, ReactNode]) | `false`] = js.native
  
  val swipeable: js.UndefOr[Boolean] = js.native
  
  val tabBarActiveTextColor: js.UndefOr[String] = js.native
  
  val tabBarBackgroundColor: js.UndefOr[String] = js.native
  
  val tabBarInactiveTextColor: js.UndefOr[String] = js.native
  
  val tabBarPosition: js.UndefOr[top | bottom | left | right] = js.native
  
  val tabBarTextStyle: js.UndefOr[CSSProperties | js.Any] = js.native
  
  val tabBarUnderlineStyle: js.UndefOr[CSSProperties | js.Any] = js.native
  
  val tabDirection: js.UndefOr[horizontal | vertical] = js.native
  
  val tabs: js.Array[TabData] = js.native
  
  val useLeftInsteadTransform: js.UndefOr[Boolean] = js.native
  
  val useOnPan: js.UndefOr[Boolean] = js.native
  
  val usePaged: js.UndefOr[Boolean] = js.native
}
object ReadonlychildrenReactNode {
  
  @scala.inline
  def apply(tabs: js.Array[TabData]): ReadonlychildrenReactNode = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlychildrenReactNode]
  }
  
  @scala.inline
  implicit class ReadonlychildrenReactNodeOps[Self <: ReadonlychildrenReactNode] (val x: Self) extends AnyVal {
    
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
    def setTabsVarargs(value: TabData*): Self = this.set("tabs", js.Array(value :_*))
    
    @scala.inline
    def setTabs(value: js.Array[TabData]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDestroyInactiveTab(value: Boolean): Self = this.set("destroyInactiveTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyInactiveTab: Self = this.set("destroyInactiveTab", js.undefined)
    
    @scala.inline
    def setDistanceToChangeTab(value: Double): Self = this.set("distanceToChangeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceToChangeTab: Self = this.set("distanceToChangeTab", js.undefined)
    
    @scala.inline
    def setInitialPage(value: Double | String): Self = this.set("initialPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialPage: Self = this.set("initialPage", js.undefined)
    
    @scala.inline
    def setNoRenderContent(value: Boolean): Self = this.set("noRenderContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoRenderContent: Self = this.set("noRenderContent", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* tab */ TabData, /* index */ Double) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnTabClick(value: (/* tab */ TabData, /* index */ Double) => Unit): Self = this.set("onTabClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnTabClick: Self = this.set("onTabClick", js.undefined)
    
    @scala.inline
    def setPage(value: Double | String): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setPrerenderingSiblingsNumber(value: Double): Self = this.set("prerenderingSiblingsNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrerenderingSiblingsNumber: Self = this.set("prerenderingSiblingsNumber", js.undefined)
    
    @scala.inline
    def setRenderTabBarFunction1(value: /* props */ TabBarPropsType => ReactNode): Self = this.set("renderTabBar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderTabBar(value: (js.Function1[/* props */ TabBarPropsType, ReactNode]) | `false`): Self = this.set("renderTabBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderTabBar: Self = this.set("renderTabBar", js.undefined)
    
    @scala.inline
    def setSwipeable(value: Boolean): Self = this.set("swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeable: Self = this.set("swipeable", js.undefined)
    
    @scala.inline
    def setTabBarActiveTextColor(value: String): Self = this.set("tabBarActiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarActiveTextColor: Self = this.set("tabBarActiveTextColor", js.undefined)
    
    @scala.inline
    def setTabBarBackgroundColor(value: String): Self = this.set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarBackgroundColor: Self = this.set("tabBarBackgroundColor", js.undefined)
    
    @scala.inline
    def setTabBarInactiveTextColor(value: String): Self = this.set("tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarInactiveTextColor: Self = this.set("tabBarInactiveTextColor", js.undefined)
    
    @scala.inline
    def setTabBarPosition(value: top | bottom | left | right): Self = this.set("tabBarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarPosition: Self = this.set("tabBarPosition", js.undefined)
    
    @scala.inline
    def setTabBarTextStyle(value: CSSProperties | js.Any): Self = this.set("tabBarTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarTextStyle: Self = this.set("tabBarTextStyle", js.undefined)
    
    @scala.inline
    def setTabBarUnderlineStyle(value: CSSProperties | js.Any): Self = this.set("tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarUnderlineStyle: Self = this.set("tabBarUnderlineStyle", js.undefined)
    
    @scala.inline
    def setTabDirection(value: horizontal | vertical): Self = this.set("tabDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabDirection: Self = this.set("tabDirection", js.undefined)
    
    @scala.inline
    def setUseLeftInsteadTransform(value: Boolean): Self = this.set("useLeftInsteadTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLeftInsteadTransform: Self = this.set("useLeftInsteadTransform", js.undefined)
    
    @scala.inline
    def setUseOnPan(value: Boolean): Self = this.set("useOnPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseOnPan: Self = this.set("useOnPan", js.undefined)
    
    @scala.inline
    def setUsePaged(value: Boolean): Self = this.set("usePaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePaged: Self = this.set("usePaged", js.undefined)
  }
}
