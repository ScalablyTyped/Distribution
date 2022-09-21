package typings.reactNativeScrollableTabView

import typings.react.mod.ReactChild
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeScrollableTabView.mod.RenderTabProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActiveTab extends StObject {
    
    var activeTab: js.UndefOr[Double] = js.undefined
    
    var containerWidth: js.UndefOr[Double] = js.undefined
    
    var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.undefined
    
    var scrollValue: js.UndefOr[Value] = js.undefined
    
    var tabs: js.UndefOr[js.Array[Element]] = js.undefined
  }
  object ActiveTab {
    
    inline def apply(): ActiveTab = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActiveTab]
    }
    
    extension [Self <: ActiveTab](x: Self) {
      
      inline def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      inline def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      inline def setContainerWidthUndefined: Self = StObject.set(x, "containerWidth", js.undefined)
      
      inline def setGoToPage(value: /* pageNumber */ Double => Unit): Self = StObject.set(x, "goToPage", js.Any.fromFunction1(value))
      
      inline def setGoToPageUndefined: Self = StObject.set(x, "goToPage", js.undefined)
      
      inline def setScrollValue(value: Value): Self = StObject.set(x, "scrollValue", value.asInstanceOf[js.Any])
      
      inline def setScrollValueUndefined: Self = StObject.set(x, "scrollValue", js.undefined)
      
      inline def setTabs(value: js.Array[Element]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      inline def setTabsVarargs(value: Element*): Self = StObject.set(x, "tabs", js.Array(value*))
    }
  }
  
  /* Inlined react-native-scrollable-tab-view.react-native-scrollable-tab-view.TabBarProps<{}> */
  trait TabBarProps extends StObject {
    
    var activeTab: js.UndefOr[Double] = js.undefined
    
    var containerWidth: js.UndefOr[Double] = js.undefined
    
    var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.undefined
    
    var scrollValue: js.UndefOr[Value] = js.undefined
    
    var tabs: js.UndefOr[js.Array[Element]] = js.undefined
  }
  object TabBarProps {
    
    inline def apply(): TabBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarProps]
    }
    
    extension [Self <: TabBarProps](x: Self) {
      
      inline def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      inline def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      inline def setContainerWidthUndefined: Self = StObject.set(x, "containerWidth", js.undefined)
      
      inline def setGoToPage(value: /* pageNumber */ Double => Unit): Self = StObject.set(x, "goToPage", js.Any.fromFunction1(value))
      
      inline def setGoToPageUndefined: Self = StObject.set(x, "goToPage", js.undefined)
      
      inline def setScrollValue(value: Value): Self = StObject.set(x, "scrollValue", value.asInstanceOf[js.Any])
      
      inline def setScrollValueUndefined: Self = StObject.set(x, "scrollValue", js.undefined)
      
      inline def setTabs(value: js.Array[Element]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      inline def setTabsVarargs(value: Element*): Self = StObject.set(x, "tabs", js.Array(value*))
    }
  }
  
  /* Inlined react-native-scrollable-tab-view.react-native-scrollable-tab-view.TabBarProps<react-native-scrollable-tab-view.react-native-scrollable-tab-view.DefaultTabBarProps> */
  trait TabBarPropsDefaultTabBarP extends StObject {
    
    var activeTab: js.UndefOr[Double] = js.undefined
    
    var activeTextColor: js.UndefOr[String] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var containerWidth: js.UndefOr[Double] = js.undefined
    
    var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.undefined
    
    var inactiveTextColor: js.UndefOr[String] = js.undefined
    
    var renderTab: js.UndefOr[RenderTabProperties] = js.undefined
    
    var scrollValue: js.UndefOr[Value] = js.undefined
    
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    var tabStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var tabs: js.UndefOr[js.Array[Element]] = js.undefined
    
    var textStyle: js.UndefOr[TextStyle] = js.undefined
    
    var underlineStyle: js.UndefOr[ViewStyle] = js.undefined
  }
  object TabBarPropsDefaultTabBarP {
    
    inline def apply(): TabBarPropsDefaultTabBarP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarPropsDefaultTabBarP]
    }
    
    extension [Self <: TabBarPropsDefaultTabBarP](x: Self) {
      
      inline def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      inline def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      inline def setActiveTextColor(value: String): Self = StObject.set(x, "activeTextColor", value.asInstanceOf[js.Any])
      
      inline def setActiveTextColorUndefined: Self = StObject.set(x, "activeTextColor", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      inline def setContainerWidthUndefined: Self = StObject.set(x, "containerWidth", js.undefined)
      
      inline def setGoToPage(value: /* pageNumber */ Double => Unit): Self = StObject.set(x, "goToPage", js.Any.fromFunction1(value))
      
      inline def setGoToPageUndefined: Self = StObject.set(x, "goToPage", js.undefined)
      
      inline def setInactiveTextColor(value: String): Self = StObject.set(x, "inactiveTextColor", value.asInstanceOf[js.Any])
      
      inline def setInactiveTextColorUndefined: Self = StObject.set(x, "inactiveTextColor", js.undefined)
      
      inline def setRenderTab(
        value: (/* name */ String, /* pageIndex */ Double, /* isTabActive */ Boolean, /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]) => Element
      ): Self = StObject.set(x, "renderTab", js.Any.fromFunction5(value))
      
      inline def setRenderTabUndefined: Self = StObject.set(x, "renderTab", js.undefined)
      
      inline def setScrollValue(value: Value): Self = StObject.set(x, "scrollValue", value.asInstanceOf[js.Any])
      
      inline def setScrollValueUndefined: Self = StObject.set(x, "scrollValue", js.undefined)
      
      inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabStyle(value: ViewStyle): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
      
      inline def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
      
      inline def setTabs(value: js.Array[Element]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      inline def setTabsVarargs(value: Element*): Self = StObject.set(x, "tabs", js.Array(value*))
      
      inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setUnderlineStyle(value: ViewStyle): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
      
      inline def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
    }
  }
  
  /* Inlined react-native-scrollable-tab-view.react-native-scrollable-tab-view.TabBarProps<react-native-scrollable-tab-view.react-native-scrollable-tab-view.ScrollableTabBarProps> */
  trait TabBarPropsScrollableTabB extends StObject {
    
    var activeTab: js.UndefOr[Double] = js.undefined
    
    var activeTextColor: js.UndefOr[String] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var containerWidth: js.UndefOr[Double] = js.undefined
    
    var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.undefined
    
    var inactiveTextColor: js.UndefOr[String] = js.undefined
    
    var renderTab: js.UndefOr[RenderTabProperties] = js.undefined
    
    var scrollOffset: js.UndefOr[Double] = js.undefined
    
    var scrollValue: js.UndefOr[Value] = js.undefined
    
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    var tabStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var tabs: js.UndefOr[js.Array[Element]] = js.undefined
    
    var tabsContainerStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var textStyle: js.UndefOr[TextStyle] = js.undefined
    
    var underlineStyle: js.UndefOr[ViewStyle] = js.undefined
  }
  object TabBarPropsScrollableTabB {
    
    inline def apply(): TabBarPropsScrollableTabB = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarPropsScrollableTabB]
    }
    
    extension [Self <: TabBarPropsScrollableTabB](x: Self) {
      
      inline def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      inline def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      inline def setActiveTextColor(value: String): Self = StObject.set(x, "activeTextColor", value.asInstanceOf[js.Any])
      
      inline def setActiveTextColorUndefined: Self = StObject.set(x, "activeTextColor", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      inline def setContainerWidthUndefined: Self = StObject.set(x, "containerWidth", js.undefined)
      
      inline def setGoToPage(value: /* pageNumber */ Double => Unit): Self = StObject.set(x, "goToPage", js.Any.fromFunction1(value))
      
      inline def setGoToPageUndefined: Self = StObject.set(x, "goToPage", js.undefined)
      
      inline def setInactiveTextColor(value: String): Self = StObject.set(x, "inactiveTextColor", value.asInstanceOf[js.Any])
      
      inline def setInactiveTextColorUndefined: Self = StObject.set(x, "inactiveTextColor", js.undefined)
      
      inline def setRenderTab(
        value: (/* name */ String, /* pageIndex */ Double, /* isTabActive */ Boolean, /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]) => Element
      ): Self = StObject.set(x, "renderTab", js.Any.fromFunction5(value))
      
      inline def setRenderTabUndefined: Self = StObject.set(x, "renderTab", js.undefined)
      
      inline def setScrollOffset(value: Double): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
      
      inline def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
      
      inline def setScrollValue(value: Value): Self = StObject.set(x, "scrollValue", value.asInstanceOf[js.Any])
      
      inline def setScrollValueUndefined: Self = StObject.set(x, "scrollValue", js.undefined)
      
      inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabStyle(value: ViewStyle): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
      
      inline def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
      
      inline def setTabs(value: js.Array[Element]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsContainerStyle(value: ViewStyle): Self = StObject.set(x, "tabsContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setTabsContainerStyleUndefined: Self = StObject.set(x, "tabsContainerStyle", js.undefined)
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      inline def setTabsVarargs(value: Element*): Self = StObject.set(x, "tabs", js.Array(value*))
      
      inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setUnderlineStyle(value: ViewStyle): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
      
      inline def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
    }
  }
  
  trait TabLabel extends StObject {
    
    var tabLabel: ReactChild
  }
  object TabLabel {
    
    inline def apply(tabLabel: ReactChild): TabLabel = {
      val __obj = js.Dynamic.literal(tabLabel = tabLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabLabel]
    }
    
    extension [Self <: TabLabel](x: Self) {
      
      inline def setTabLabel(value: ReactChild): Self = StObject.set(x, "tabLabel", value.asInstanceOf[js.Any])
    }
  }
}
