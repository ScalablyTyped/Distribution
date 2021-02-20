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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ActiveTab extends StObject {
    
    var activeTab: js.UndefOr[Double] = js.native
    
    var containerWidth: js.UndefOr[Double] = js.native
    
    var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.native
    
    var scrollValue: js.UndefOr[Value] = js.native
    
    var tabs: js.UndefOr[js.Array[Element]] = js.native
  }
  object ActiveTab {
    
    @scala.inline
    def apply(): ActiveTab = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActiveTab]
    }
    
    @scala.inline
    implicit class ActiveTabMutableBuilder[Self <: ActiveTab] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      @scala.inline
      def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerWidthUndefined: Self = StObject.set(x, "containerWidth", js.undefined)
      
      @scala.inline
      def setGoToPage(value: /* pageNumber */ Double => Unit): Self = StObject.set(x, "goToPage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGoToPageUndefined: Self = StObject.set(x, "goToPage", js.undefined)
      
      @scala.inline
      def setScrollValue(value: Value): Self = StObject.set(x, "scrollValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollValueUndefined: Self = StObject.set(x, "scrollValue", js.undefined)
      
      @scala.inline
      def setTabs(value: js.Array[Element]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      @scala.inline
      def setTabsVarargs(value: Element*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    }
  }
  
  /* Inlined react-native-scrollable-tab-view.react-native-scrollable-tab-view.TabBarProps<{}> */
  @js.native
  trait TabBarProps extends StObject {
    
    var activeTab: js.UndefOr[Double] = js.native
    
    var containerWidth: js.UndefOr[Double] = js.native
    
    var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.native
    
    var scrollValue: js.UndefOr[Value] = js.native
    
    var tabs: js.UndefOr[js.Array[Element]] = js.native
  }
  object TabBarProps {
    
    @scala.inline
    def apply(): TabBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarProps]
    }
    
    @scala.inline
    implicit class TabBarPropsMutableBuilder[Self <: TabBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      @scala.inline
      def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerWidthUndefined: Self = StObject.set(x, "containerWidth", js.undefined)
      
      @scala.inline
      def setGoToPage(value: /* pageNumber */ Double => Unit): Self = StObject.set(x, "goToPage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGoToPageUndefined: Self = StObject.set(x, "goToPage", js.undefined)
      
      @scala.inline
      def setScrollValue(value: Value): Self = StObject.set(x, "scrollValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollValueUndefined: Self = StObject.set(x, "scrollValue", js.undefined)
      
      @scala.inline
      def setTabs(value: js.Array[Element]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      @scala.inline
      def setTabsVarargs(value: Element*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    }
  }
  
  /* Inlined react-native-scrollable-tab-view.react-native-scrollable-tab-view.TabBarProps<react-native-scrollable-tab-view.react-native-scrollable-tab-view.DefaultTabBarProps> */
  @js.native
  trait TabBarPropsDefaultTabBarP extends StObject {
    
    var activeTab: js.UndefOr[Double] = js.native
    
    var activeTextColor: js.UndefOr[String] = js.native
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var containerWidth: js.UndefOr[Double] = js.native
    
    var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.native
    
    var inactiveTextColor: js.UndefOr[String] = js.native
    
    var renderTab: js.UndefOr[RenderTabProperties] = js.native
    
    var scrollValue: js.UndefOr[Value] = js.native
    
    var style: js.UndefOr[ViewStyle] = js.native
    
    var tabStyle: js.UndefOr[ViewStyle] = js.native
    
    var tabs: js.UndefOr[js.Array[Element]] = js.native
    
    var textStyle: js.UndefOr[TextStyle] = js.native
    
    var underlineStyle: js.UndefOr[ViewStyle] = js.native
  }
  object TabBarPropsDefaultTabBarP {
    
    @scala.inline
    def apply(): TabBarPropsDefaultTabBarP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarPropsDefaultTabBarP]
    }
    
    @scala.inline
    implicit class TabBarPropsDefaultTabBarPMutableBuilder[Self <: TabBarPropsDefaultTabBarP] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      @scala.inline
      def setActiveTextColor(value: String): Self = StObject.set(x, "activeTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTextColorUndefined: Self = StObject.set(x, "activeTextColor", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerWidthUndefined: Self = StObject.set(x, "containerWidth", js.undefined)
      
      @scala.inline
      def setGoToPage(value: /* pageNumber */ Double => Unit): Self = StObject.set(x, "goToPage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGoToPageUndefined: Self = StObject.set(x, "goToPage", js.undefined)
      
      @scala.inline
      def setInactiveTextColor(value: String): Self = StObject.set(x, "inactiveTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInactiveTextColorUndefined: Self = StObject.set(x, "inactiveTextColor", js.undefined)
      
      @scala.inline
      def setRenderTab(
        value: (/* name */ String, /* pageIndex */ Double, /* isTabActive */ Boolean, /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]) => Element
      ): Self = StObject.set(x, "renderTab", js.Any.fromFunction5(value))
      
      @scala.inline
      def setRenderTabUndefined: Self = StObject.set(x, "renderTab", js.undefined)
      
      @scala.inline
      def setScrollValue(value: Value): Self = StObject.set(x, "scrollValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollValueUndefined: Self = StObject.set(x, "scrollValue", js.undefined)
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabStyle(value: ViewStyle): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
      
      @scala.inline
      def setTabs(value: js.Array[Element]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      @scala.inline
      def setTabsVarargs(value: Element*): Self = StObject.set(x, "tabs", js.Array(value :_*))
      
      @scala.inline
      def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      @scala.inline
      def setUnderlineStyle(value: ViewStyle): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
    }
  }
  
  /* Inlined react-native-scrollable-tab-view.react-native-scrollable-tab-view.TabBarProps<react-native-scrollable-tab-view.react-native-scrollable-tab-view.ScrollableTabBarProps> */
  @js.native
  trait TabBarPropsScrollableTabB extends StObject {
    
    var activeTab: js.UndefOr[Double] = js.native
    
    var activeTextColor: js.UndefOr[String] = js.native
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var containerWidth: js.UndefOr[Double] = js.native
    
    var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.native
    
    var inactiveTextColor: js.UndefOr[String] = js.native
    
    var renderTab: js.UndefOr[RenderTabProperties] = js.native
    
    var scrollOffset: js.UndefOr[Double] = js.native
    
    var scrollValue: js.UndefOr[Value] = js.native
    
    var style: js.UndefOr[ViewStyle] = js.native
    
    var tabStyle: js.UndefOr[ViewStyle] = js.native
    
    var tabs: js.UndefOr[js.Array[Element]] = js.native
    
    var tabsContainerStyle: js.UndefOr[ViewStyle] = js.native
    
    var textStyle: js.UndefOr[TextStyle] = js.native
    
    var underlineStyle: js.UndefOr[ViewStyle] = js.native
  }
  object TabBarPropsScrollableTabB {
    
    @scala.inline
    def apply(): TabBarPropsScrollableTabB = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarPropsScrollableTabB]
    }
    
    @scala.inline
    implicit class TabBarPropsScrollableTabBMutableBuilder[Self <: TabBarPropsScrollableTabB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      @scala.inline
      def setActiveTextColor(value: String): Self = StObject.set(x, "activeTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTextColorUndefined: Self = StObject.set(x, "activeTextColor", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerWidthUndefined: Self = StObject.set(x, "containerWidth", js.undefined)
      
      @scala.inline
      def setGoToPage(value: /* pageNumber */ Double => Unit): Self = StObject.set(x, "goToPage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGoToPageUndefined: Self = StObject.set(x, "goToPage", js.undefined)
      
      @scala.inline
      def setInactiveTextColor(value: String): Self = StObject.set(x, "inactiveTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInactiveTextColorUndefined: Self = StObject.set(x, "inactiveTextColor", js.undefined)
      
      @scala.inline
      def setRenderTab(
        value: (/* name */ String, /* pageIndex */ Double, /* isTabActive */ Boolean, /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]) => Element
      ): Self = StObject.set(x, "renderTab", js.Any.fromFunction5(value))
      
      @scala.inline
      def setRenderTabUndefined: Self = StObject.set(x, "renderTab", js.undefined)
      
      @scala.inline
      def setScrollOffset(value: Double): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
      
      @scala.inline
      def setScrollValue(value: Value): Self = StObject.set(x, "scrollValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollValueUndefined: Self = StObject.set(x, "scrollValue", js.undefined)
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabStyle(value: ViewStyle): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
      
      @scala.inline
      def setTabs(value: js.Array[Element]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsContainerStyle(value: ViewStyle): Self = StObject.set(x, "tabsContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsContainerStyleUndefined: Self = StObject.set(x, "tabsContainerStyle", js.undefined)
      
      @scala.inline
      def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      @scala.inline
      def setTabsVarargs(value: Element*): Self = StObject.set(x, "tabs", js.Array(value :_*))
      
      @scala.inline
      def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      @scala.inline
      def setUnderlineStyle(value: ViewStyle): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
    }
  }
  
  @js.native
  trait TabLabel extends StObject {
    
    var tabLabel: ReactChild = js.native
  }
  object TabLabel {
    
    @scala.inline
    def apply(tabLabel: ReactChild): TabLabel = {
      val __obj = js.Dynamic.literal(tabLabel = tabLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabLabel]
    }
    
    @scala.inline
    implicit class TabLabelMutableBuilder[Self <: TabLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabLabel(value: ReactChild): Self = StObject.set(x, "tabLabel", value.asInstanceOf[js.Any])
    }
  }
}
