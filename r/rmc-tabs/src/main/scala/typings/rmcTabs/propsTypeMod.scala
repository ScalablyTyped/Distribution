package typings.rmcTabs

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.rmcTabs.modelsMod.Models.TabData
import typings.rmcTabs.rmcTabsBooleans.`false`
import typings.rmcTabs.rmcTabsStrings.bottom
import typings.rmcTabs.rmcTabsStrings.horizontal
import typings.rmcTabs.rmcTabsStrings.left
import typings.rmcTabs.rmcTabsStrings.right
import typings.rmcTabs.rmcTabsStrings.top
import typings.rmcTabs.rmcTabsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propsTypeMod {
  
  trait PropsType extends StObject {
    
    /** whether to change tabs with animation | default: true */
    var animated: js.UndefOr[Boolean] = js.undefined
    
    /** destroy inactive tab | default: false */
    var destroyInactiveTab: js.UndefOr[Boolean] = js.undefined
    
    /** distance to change tab, width ratio | default: 0.3 */
    var distanceToChangeTab: js.UndefOr[Double] = js.undefined
    
    /** initial Tab, index or key */
    var initialPage: js.UndefOr[Double | String] = js.undefined
    
    /** can't render content | default: false */
    var noRenderContent: js.UndefOr[Boolean] = js.undefined
    
    /** callback when tab is switched */
    var onChange: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.undefined
    
    /** on tab click */
    var onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.undefined
    
    /** current tab, index or key */
    var page: js.UndefOr[Double | String] = js.undefined
    
    /** pre-render nearby # sibling, Infinity: render all the siblings, 0: render current page | default: 1 */
    var prerenderingSiblingsNumber: js.UndefOr[Double] = js.undefined
    
    /** render for TabBar */
    var renderTabBar: js.UndefOr[(js.Function1[/* props */ TabBarPropsType, ReactNode]) | `false`] = js.undefined
    
    /** whether to switch tabs with swipe gestrue in the content | default: true */
    var swipeable: js.UndefOr[Boolean] = js.undefined
    
    /** tabBar active text color */
    var tabBarActiveTextColor: js.UndefOr[String] = js.undefined
    
    /** tabBar background color */
    var tabBarBackgroundColor: js.UndefOr[String] = js.undefined
    
    /** tabBar inactive text color */
    var tabBarInactiveTextColor: js.UndefOr[String] = js.undefined
    
    /** TabBar's position | default: top */
    var tabBarPosition: js.UndefOr[top | bottom | left | right] = js.undefined
    
    /** tabBar text style */
    var tabBarTextStyle: js.UndefOr[CSSProperties | js.Any] = js.undefined
    
    /** tabBar underline style */
    var tabBarUnderlineStyle: js.UndefOr[CSSProperties | js.Any] = js.undefined
    
    /** tab paging direction | default: horizontal */
    var tabDirection: js.UndefOr[horizontal | vertical] = js.undefined
    
    /** tabs data */
    var tabs: js.Array[TabData]
    
    /** use left instead of transform | default: false */
    var useLeftInsteadTransform: js.UndefOr[Boolean] = js.undefined
    
    /** use scroll follow pan | default: true */
    var useOnPan: js.UndefOr[Boolean] = js.undefined
    
    /** use paged | default: true */
    var usePaged: js.UndefOr[Boolean] = js.undefined
  }
  object PropsType {
    
    inline def apply(tabs: js.Array[TabData]): PropsType = {
      val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    extension [Self <: PropsType](x: Self) {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setDestroyInactiveTab(value: Boolean): Self = StObject.set(x, "destroyInactiveTab", value.asInstanceOf[js.Any])
      
      inline def setDestroyInactiveTabUndefined: Self = StObject.set(x, "destroyInactiveTab", js.undefined)
      
      inline def setDistanceToChangeTab(value: Double): Self = StObject.set(x, "distanceToChangeTab", value.asInstanceOf[js.Any])
      
      inline def setDistanceToChangeTabUndefined: Self = StObject.set(x, "distanceToChangeTab", js.undefined)
      
      inline def setInitialPage(value: Double | String): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
      
      inline def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
      
      inline def setNoRenderContent(value: Boolean): Self = StObject.set(x, "noRenderContent", value.asInstanceOf[js.Any])
      
      inline def setNoRenderContentUndefined: Self = StObject.set(x, "noRenderContent", js.undefined)
      
      inline def setOnChange(value: (/* tab */ TabData, /* index */ Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnTabClick(value: (/* tab */ TabData, /* index */ Double) => Unit): Self = StObject.set(x, "onTabClick", js.Any.fromFunction2(value))
      
      inline def setOnTabClickUndefined: Self = StObject.set(x, "onTabClick", js.undefined)
      
      inline def setPage(value: Double | String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPrerenderingSiblingsNumber(value: Double): Self = StObject.set(x, "prerenderingSiblingsNumber", value.asInstanceOf[js.Any])
      
      inline def setPrerenderingSiblingsNumberUndefined: Self = StObject.set(x, "prerenderingSiblingsNumber", js.undefined)
      
      inline def setRenderTabBar(value: (js.Function1[/* props */ TabBarPropsType, ReactNode]) | `false`): Self = StObject.set(x, "renderTabBar", value.asInstanceOf[js.Any])
      
      inline def setRenderTabBarFunction1(value: /* props */ TabBarPropsType => ReactNode): Self = StObject.set(x, "renderTabBar", js.Any.fromFunction1(value))
      
      inline def setRenderTabBarUndefined: Self = StObject.set(x, "renderTabBar", js.undefined)
      
      inline def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
      
      inline def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
      
      inline def setTabBarActiveTextColor(value: String): Self = StObject.set(x, "tabBarActiveTextColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarActiveTextColorUndefined: Self = StObject.set(x, "tabBarActiveTextColor", js.undefined)
      
      inline def setTabBarBackgroundColor(value: String): Self = StObject.set(x, "tabBarBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarBackgroundColorUndefined: Self = StObject.set(x, "tabBarBackgroundColor", js.undefined)
      
      inline def setTabBarInactiveTextColor(value: String): Self = StObject.set(x, "tabBarInactiveTextColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarInactiveTextColorUndefined: Self = StObject.set(x, "tabBarInactiveTextColor", js.undefined)
      
      inline def setTabBarPosition(value: top | bottom | left | right): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
      
      inline def setTabBarPositionUndefined: Self = StObject.set(x, "tabBarPosition", js.undefined)
      
      inline def setTabBarTextStyle(value: CSSProperties | js.Any): Self = StObject.set(x, "tabBarTextStyle", value.asInstanceOf[js.Any])
      
      inline def setTabBarTextStyleUndefined: Self = StObject.set(x, "tabBarTextStyle", js.undefined)
      
      inline def setTabBarUnderlineStyle(value: CSSProperties | js.Any): Self = StObject.set(x, "tabBarUnderlineStyle", value.asInstanceOf[js.Any])
      
      inline def setTabBarUnderlineStyleUndefined: Self = StObject.set(x, "tabBarUnderlineStyle", js.undefined)
      
      inline def setTabDirection(value: horizontal | vertical): Self = StObject.set(x, "tabDirection", value.asInstanceOf[js.Any])
      
      inline def setTabDirectionUndefined: Self = StObject.set(x, "tabDirection", js.undefined)
      
      inline def setTabs(value: js.Array[TabData]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsVarargs(value: TabData*): Self = StObject.set(x, "tabs", js.Array(value :_*))
      
      inline def setUseLeftInsteadTransform(value: Boolean): Self = StObject.set(x, "useLeftInsteadTransform", value.asInstanceOf[js.Any])
      
      inline def setUseLeftInsteadTransformUndefined: Self = StObject.set(x, "useLeftInsteadTransform", js.undefined)
      
      inline def setUseOnPan(value: Boolean): Self = StObject.set(x, "useOnPan", value.asInstanceOf[js.Any])
      
      inline def setUseOnPanUndefined: Self = StObject.set(x, "useOnPan", js.undefined)
      
      inline def setUsePaged(value: Boolean): Self = StObject.set(x, "usePaged", value.asInstanceOf[js.Any])
      
      inline def setUsePagedUndefined: Self = StObject.set(x, "usePaged", js.undefined)
    }
  }
  
  trait TabBarPropsType extends StObject {
    
    /** current active tab */
    var activeTab: Double
    
    /** use animate | default: true */
    var animated: Boolean
    
    /** call this function to switch tab */
    def goToTab(index: Double): Unit
    
    var instanceId: Double
    
    /** on tab click */
    var onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.undefined
    
    /** page size of tabbar's tab | default: 5 */
    var page: js.UndefOr[Double] = js.undefined
    
    /** render the tab of tabbar */
    var renderTab: js.UndefOr[js.Function1[/* tab */ TabData, ReactNode]] = js.undefined
    
    /** render the underline of tabbar */
    var renderUnderline: js.UndefOr[js.Function1[/* style */ CSSProperties | js.Any, ReactNode]] = js.undefined
    
    /** tabBar active text color */
    var tabBarActiveTextColor: js.UndefOr[String] = js.undefined
    
    /** tabBar background color */
    var tabBarBackgroundColor: js.UndefOr[String] = js.undefined
    
    /** tabBar inactive text color */
    var tabBarInactiveTextColor: js.UndefOr[String] = js.undefined
    
    /** tabBar's position | defualt: top */
    var tabBarPosition: js.UndefOr[top | bottom | left | right] = js.undefined
    
    /** tabBar text style */
    var tabBarTextStyle: js.UndefOr[CSSProperties | js.Any] = js.undefined
    
    /** tabBar underline style */
    var tabBarUnderlineStyle: js.UndefOr[CSSProperties | js.Any] = js.undefined
    
    /** tabs data */
    var tabs: js.Array[TabData]
  }
  object TabBarPropsType {
    
    inline def apply(
      activeTab: Double,
      animated: Boolean,
      goToTab: Double => Unit,
      instanceId: Double,
      tabs: js.Array[TabData]
    ): TabBarPropsType = {
      val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = js.Any.fromFunction1(goToTab), instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabBarPropsType]
    }
    
    extension [Self <: TabBarPropsType](x: Self) {
      
      inline def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setGoToTab(value: Double => Unit): Self = StObject.set(x, "goToTab", js.Any.fromFunction1(value))
      
      inline def setInstanceId(value: Double): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setOnTabClick(value: (/* tab */ TabData, /* index */ Double) => Unit): Self = StObject.set(x, "onTabClick", js.Any.fromFunction2(value))
      
      inline def setOnTabClickUndefined: Self = StObject.set(x, "onTabClick", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setRenderTab(value: /* tab */ TabData => ReactNode): Self = StObject.set(x, "renderTab", js.Any.fromFunction1(value))
      
      inline def setRenderTabUndefined: Self = StObject.set(x, "renderTab", js.undefined)
      
      inline def setRenderUnderline(value: /* style */ CSSProperties | js.Any => ReactNode): Self = StObject.set(x, "renderUnderline", js.Any.fromFunction1(value))
      
      inline def setRenderUnderlineUndefined: Self = StObject.set(x, "renderUnderline", js.undefined)
      
      inline def setTabBarActiveTextColor(value: String): Self = StObject.set(x, "tabBarActiveTextColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarActiveTextColorUndefined: Self = StObject.set(x, "tabBarActiveTextColor", js.undefined)
      
      inline def setTabBarBackgroundColor(value: String): Self = StObject.set(x, "tabBarBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarBackgroundColorUndefined: Self = StObject.set(x, "tabBarBackgroundColor", js.undefined)
      
      inline def setTabBarInactiveTextColor(value: String): Self = StObject.set(x, "tabBarInactiveTextColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarInactiveTextColorUndefined: Self = StObject.set(x, "tabBarInactiveTextColor", js.undefined)
      
      inline def setTabBarPosition(value: top | bottom | left | right): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
      
      inline def setTabBarPositionUndefined: Self = StObject.set(x, "tabBarPosition", js.undefined)
      
      inline def setTabBarTextStyle(value: CSSProperties | js.Any): Self = StObject.set(x, "tabBarTextStyle", value.asInstanceOf[js.Any])
      
      inline def setTabBarTextStyleUndefined: Self = StObject.set(x, "tabBarTextStyle", js.undefined)
      
      inline def setTabBarUnderlineStyle(value: CSSProperties | js.Any): Self = StObject.set(x, "tabBarUnderlineStyle", value.asInstanceOf[js.Any])
      
      inline def setTabBarUnderlineStyleUndefined: Self = StObject.set(x, "tabBarUnderlineStyle", js.undefined)
      
      inline def setTabs(value: js.Array[TabData]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsVarargs(value: TabData*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    }
  }
}
