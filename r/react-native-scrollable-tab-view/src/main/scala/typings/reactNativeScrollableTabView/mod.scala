package typings.reactNativeScrollableTabView

import typings.react.mod.Component
import typings.react.mod.Props
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.ScrollViewProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeScrollableTabView.anon.ActiveTab
import typings.reactNativeScrollableTabView.anon.TabBarPropsDefaultTabBarP
import typings.reactNativeScrollableTabView.anon.TabBarPropsScrollableTabB
import typings.reactNativeScrollableTabView.anon.TabLabel
import typings.reactNativeScrollableTabView.reactNativeScrollableTabViewBooleans.`false`
import typings.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.bottom
import typings.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.overlayBottom
import typings.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.overlayTop
import typings.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-scrollable-tab-view", JSImport.Default)
  @js.native
  class default ()
    extends Component[ScrollableTabViewProperties, js.Object, js.Any]
  
  @JSImport("react-native-scrollable-tab-view", "DefaultTabBar")
  @js.native
  class DefaultTabBar protected ()
    extends Component[TabBarPropsDefaultTabBarP, js.Object, js.Any] {
    def this(props: TabBarPropsDefaultTabBarP) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabBarPropsDefaultTabBarP, context: js.Any) = this()
  }
  
  @JSImport("react-native-scrollable-tab-view", "ScrollableTabBar")
  @js.native
  class ScrollableTabBar protected ()
    extends Component[TabBarPropsScrollableTabB, js.Object, js.Any] {
    def this(props: TabBarPropsScrollableTabB) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabBarPropsScrollableTabB, context: js.Any) = this()
  }
  
  trait ChangeTabProperties extends StObject {
    
    // previousPage
    var from: Double
    
    // currentPage
    var i: Double
    
    // currentPage object
    var ref: Element
  }
  object ChangeTabProperties {
    
    @scala.inline
    def apply(from: Double, i: Double, ref: Element): ChangeTabProperties = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeTabProperties]
    }
    
    @scala.inline
    implicit class ChangeTabPropertiesMutableBuilder[Self <: ChangeTabProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: Element): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultTabBarProps extends StObject {
    
    var activeTextColor: js.UndefOr[String] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var inactiveTextColor: js.UndefOr[String] = js.undefined
    
    var renderTab: js.UndefOr[RenderTabProperties] = js.undefined
    
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    var tabStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var textStyle: js.UndefOr[TextStyle] = js.undefined
    
    var underlineStyle: js.UndefOr[ViewStyle] = js.undefined
  }
  object DefaultTabBarProps {
    
    @scala.inline
    def apply(): DefaultTabBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultTabBarProps]
    }
    
    @scala.inline
    implicit class DefaultTabBarPropsMutableBuilder[Self <: DefaultTabBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTextColor(value: String): Self = StObject.set(x, "activeTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTextColorUndefined: Self = StObject.set(x, "activeTextColor", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
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
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabStyle(value: ViewStyle): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
      
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
  
  type RenderTabProperties = js.Function5[
    /* name */ String, 
    /* pageIndex */ Double, 
    /* isTabActive */ Boolean, 
    /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], 
    /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]], 
    Element
  ]
  
  trait ScrollableTabBarProps
    extends StObject
       with DefaultTabBarProps {
    
    var scrollOffset: js.UndefOr[Double] = js.undefined
    
    var tabsContainerStyle: js.UndefOr[ViewStyle] = js.undefined
  }
  object ScrollableTabBarProps {
    
    @scala.inline
    def apply(): ScrollableTabBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollableTabBarProps]
    }
    
    @scala.inline
    implicit class ScrollableTabBarPropsMutableBuilder[Self <: ScrollableTabBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScrollOffset(value: Double): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
      
      @scala.inline
      def setTabsContainerStyle(value: ViewStyle): Self = StObject.set(x, "tabsContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsContainerStyleUndefined: Self = StObject.set(x, "tabsContainerStyle", js.undefined)
    }
  }
  
  @js.native
  trait ScrollableTabView
    extends Component[ScrollableTabViewProperties, js.Object, js.Any]
  
  trait ScrollableTabViewProperties
    extends StObject
       with Props[ScrollableTabView] {
    
    /**
      * props that are applied to root ScrollView/ViewPagerAndroid.
      * Note that overriding defaults set by the library may break functionality; see the source for details.
      */
    var contentProps: js.UndefOr[ScrollViewProps] = js.undefined
    
    /**
      * the index of the initially selected tab, defaults to 0 === first tab
      */
    var initialPage: js.UndefOr[Double] = js.undefined
    
    /**
      * disables horizontal dragging to scroll between tabs, default is false.
      */
    var locked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * function to call when tab changes, should accept 1 argument which is
      * an Object containing two keys: i: the index of the tab that is selected, ref: the ref of the
      * tab that is selected
      */
    var onChangeTab: js.UndefOr[js.Function1[/* value */ ChangeTabProperties, Unit]] = js.undefined
    
    /**
      * function to call when the pages are sliding,
      * should accept 1 argument which is an Float number representing the page position in the slide frame.
      */
    var onScroll: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    /**
      * set selected tab(can be buggy see
      * https://github.com/skv-headless/react-native-scrollable-tab-view/issues/126
      */
    var page: js.UndefOr[Double] = js.undefined
    
    /**
      * pre-render nearby # sibling, Infinity === render all
      * the siblings, default to 0 === render current page.
      */
    var prerenderingSiblingsNumber: js.UndefOr[Double] = js.undefined
    
    /**
      * accept 1 argument props and should return a component
      * to use as the tab bar. The component has goToPage, tabs, activeTab and ref added to the props,
      * and should implement setAnimationValue to be able to animate itself along with the tab content.
      * You can manually pass the props to the TabBar component.
      */
    var renderTabBar: js.UndefOr[
        (js.Function1[/* props */ typings.reactNativeScrollableTabView.anon.TabBarProps, Element]) | `false`
      ] = js.undefined
    
    /**
      * on tab press change tab without animation.
      */
    var scrollWithoutAnimation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * style (View.propTypes.style)
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * color of the default tab bar's text when active, defaults to navy
      */
    var tabBarActiveTextColor: js.UndefOr[String] = js.undefined
    
    /**
      * color of the default tab bar's background, defaults to white
      */
    var tabBarBackgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * color of the default tab bar's text when inactive, defaults to black
      */
    var tabBarInactiveTextColor: js.UndefOr[String] = js.undefined
    
    /**
      * Defaults to "top".
      * "bottom" to position the tab bar below content.
      * "overlayTop" or "overlayBottom" for a semitransparent tab bar that overlays content. Custom
      * tab bars must consume a style prop on their outer element to support this feature: style={this.props.style}.
      */
    var tabBarPosition: js.UndefOr[top | bottom | overlayTop | overlayBottom] = js.undefined
    
    /**
      * additional styles to the tab bar's text
      */
    var tabBarTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * style of the default tab bar's underline
      */
    var tabBarUnderlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object ScrollableTabViewProperties {
    
    @scala.inline
    def apply(): ScrollableTabViewProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollableTabViewProperties]
    }
    
    @scala.inline
    implicit class ScrollableTabViewPropertiesMutableBuilder[Self <: ScrollableTabViewProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentProps(value: ScrollViewProps): Self = StObject.set(x, "contentProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentPropsUndefined: Self = StObject.set(x, "contentProps", js.undefined)
      
      @scala.inline
      def setInitialPage(value: Double): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
      
      @scala.inline
      def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
      
      @scala.inline
      def setOnChangeTab(value: /* value */ ChangeTabProperties => Unit): Self = StObject.set(x, "onChangeTab", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeTabUndefined: Self = StObject.set(x, "onChangeTab", js.undefined)
      
      @scala.inline
      def setOnScroll(value: /* value */ Double => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setPrerenderingSiblingsNumber(value: Double): Self = StObject.set(x, "prerenderingSiblingsNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrerenderingSiblingsNumberUndefined: Self = StObject.set(x, "prerenderingSiblingsNumber", js.undefined)
      
      @scala.inline
      def setRenderTabBar(
        value: (js.Function1[/* props */ typings.reactNativeScrollableTabView.anon.TabBarProps, Element]) | `false`
      ): Self = StObject.set(x, "renderTabBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderTabBarFunction1(value: /* props */ typings.reactNativeScrollableTabView.anon.TabBarProps => Element): Self = StObject.set(x, "renderTabBar", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderTabBarUndefined: Self = StObject.set(x, "renderTabBar", js.undefined)
      
      @scala.inline
      def setScrollWithoutAnimation(value: Boolean): Self = StObject.set(x, "scrollWithoutAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollWithoutAnimationUndefined: Self = StObject.set(x, "scrollWithoutAnimation", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabBarActiveTextColor(value: String): Self = StObject.set(x, "tabBarActiveTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarActiveTextColorUndefined: Self = StObject.set(x, "tabBarActiveTextColor", js.undefined)
      
      @scala.inline
      def setTabBarBackgroundColor(value: String): Self = StObject.set(x, "tabBarBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarBackgroundColorUndefined: Self = StObject.set(x, "tabBarBackgroundColor", js.undefined)
      
      @scala.inline
      def setTabBarInactiveTextColor(value: String): Self = StObject.set(x, "tabBarInactiveTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarInactiveTextColorUndefined: Self = StObject.set(x, "tabBarInactiveTextColor", js.undefined)
      
      @scala.inline
      def setTabBarPosition(value: top | bottom | overlayTop | overlayBottom): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarPositionUndefined: Self = StObject.set(x, "tabBarPosition", js.undefined)
      
      @scala.inline
      def setTabBarTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "tabBarTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarTextStyleNull: Self = StObject.set(x, "tabBarTextStyle", null)
      
      @scala.inline
      def setTabBarTextStyleUndefined: Self = StObject.set(x, "tabBarTextStyle", js.undefined)
      
      @scala.inline
      def setTabBarUnderlineStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabBarUnderlineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarUnderlineStyleNull: Self = StObject.set(x, "tabBarUnderlineStyle", null)
      
      @scala.inline
      def setTabBarUnderlineStyleUndefined: Self = StObject.set(x, "tabBarUnderlineStyle", js.undefined)
    }
  }
  
  type TabBarProps[T] = T & ActiveTab
  
  type TabProps[T] = T & TabLabel
}
