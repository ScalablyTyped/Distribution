package typings.reactRouterNavigation

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactRouterNavigation.anon.Height
import typings.reactRouterNavigation.anon.Key
import typings.reactRouterNavigation.anon.Lazy
import typings.reactRouterNavigation.reactRouterNavigationStrings.bottom
import typings.reactRouterNavigation.reactRouterNavigationStrings.top
import typings.reactRouterNavigationCore.mod.RouteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-router-navigation", "BottomNavigation")
  @js.native
  class BottomNavigation protected ()
    extends Component[BottomNavigationProps, Key, js.Any] {
    def this(props: BottomNavigationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BottomNavigationProps, context: js.Any) = this()
    
    def renderNavigationBar(sceneProps: TabSubViewProps, props: TabSubViewProps): ReactNode = js.native
    
    def renderPager(sceneProps: TabSubViewProps): ReactNode = js.native
    
    def renderScene(sceneProps: TabSubViewProps): ReactElement = js.native
    
    def renderSceneView(sceneProps: TabSubViewProps): ReactNode = js.native
  }
  /* static members */
  object BottomNavigation {
    
    @JSImport("react-router-navigation", "BottomNavigation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-router-navigation", "BottomNavigation.defaultProps")
    @js.native
    def defaultProps: Lazy = js.native
    @scala.inline
    def defaultProps_=(x: Lazy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait Card
    extends StObject
       with CardProps {
    
    var key: String
  }
  object Card {
    
    @JSImport("react-router-navigation", "Card")
    @js.native
    def apply(props: CardProps): ReactElement = js.native
    
    @scala.inline
    implicit class CardMutableBuilder[Self <: Card] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("react-router-navigation", "NavBar")
  @js.native
  class NavBar protected ()
    extends Component[CardSubViewProps, Unit, js.Any] {
    def this(props: CardSubViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CardSubViewProps, context: js.Any) = this()
    
    @JSName("props")
    var props_NavBar: CardSubViewProps = js.native
    
    def renderLeftComponent(sceneProps: CardSubViewProps): ReactNode = js.native
    
    def renderRightComponent(sceneProps: CardSubViewProps): ReactNode = js.native
    
    def renderTitleComponent(sceneProps: CardSubViewProps): ReactNode = js.native
  }
  
  @JSImport("react-router-navigation", "Navigation")
  @js.native
  class Navigation protected ()
    extends Component[NavigationComponentProps, js.Object, js.Any] {
    def this(props: NavigationComponentProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NavigationComponentProps, context: js.Any) = this()
    
    @JSName("props")
    var props_Navigation: NavigationComponentProps = js.native
    
    def renderHeader(sceneProps: CardSubViewProps, props: CardSubViewProps): ReactNode = js.native
    
    def renderSceneComponent(sceneProps: CardSubViewProps): js.UndefOr[ComponentClass[js.Any, ComponentState]] = js.native
  }
  
  trait Tab
    extends StObject
       with TabProps {
    
    var key: String
  }
  object Tab {
    
    @JSImport("react-router-navigation", "Tab")
    @js.native
    def apply(props: TabProps): ReactElement = js.native
    
    @scala.inline
    implicit class TabMutableBuilder[Self <: Tab] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("react-router-navigation", "Tabs")
  @js.native
  class Tabs protected ()
    extends Component[TabBarComponentProps, Key, js.Any] {
    def this(props: TabBarComponentProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabBarComponentProps, context: js.Any) = this()
    
    @JSName("props")
    var props_Tabs: TabBarComponentProps = js.native
    
    def renderFooter(sceneProps: TabSubViewProps): ReactElement | Null = js.native
    
    def renderHeader(sceneProps: TabSubViewProps): ReactElement | Null = js.native
    
    def renderScene(sceneProps: TabSubViewProps): ReactElement | Null = js.native
    
    def renderTabBar(sceneProps: TabSubViewProps, props: TabSubViewProps): ReactElement | Null = js.native
  }
  
  trait BottomNavigationProps
    extends StObject
       with TabBarProps {
    
    var children: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object BottomNavigationProps {
    
    @scala.inline
    def apply(): BottomNavigationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BottomNavigationProps]
    }
    
    @scala.inline
    implicit class BottomNavigationPropsMutableBuilder[Self <: BottomNavigationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait CardProps
    extends StObject
       with RouteProps
       with NavBarProps
  object CardProps {
    
    @scala.inline
    def apply(): CardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardProps]
    }
  }
  
  type CardSubViewProps = js.Any
  
  trait NavBarProps extends StObject {
    
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
    def apply(): NavBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavBarProps]
    }
    
    @scala.inline
    implicit class NavBarPropsMutableBuilder[Self <: NavBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackButtonTintColor(value: String): Self = StObject.set(x, "backButtonTintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackButtonTintColorUndefined: Self = StObject.set(x, "backButtonTintColor", js.undefined)
      
      @scala.inline
      def setBackButtonTitle(value: String): Self = StObject.set(x, "backButtonTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackButtonTitleUndefined: Self = StObject.set(x, "backButtonTitle", js.undefined)
      
      @scala.inline
      def setHideBackButton(value: Boolean): Self = StObject.set(x, "hideBackButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideBackButtonUndefined: Self = StObject.set(x, "hideBackButton", js.undefined)
      
      @scala.inline
      def setHideNavBar(value: Boolean): Self = StObject.set(x, "hideNavBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideNavBarUndefined: Self = StObject.set(x, "hideNavBar", js.undefined)
      
      @scala.inline
      def setNavBarStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "navBarStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavBarStyleNull: Self = StObject.set(x, "navBarStyle", null)
      
      @scala.inline
      def setNavBarStyleUndefined: Self = StObject.set(x, "navBarStyle", js.undefined)
      
      @scala.inline
      def setRenderLeftButton(value: /* props */ CardSubViewProps => ReactNode): Self = StObject.set(x, "renderLeftButton", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderLeftButtonUndefined: Self = StObject.set(x, "renderLeftButton", js.undefined)
      
      @scala.inline
      def setRenderNavBar(value: /* props */ CardSubViewProps => ReactNode): Self = StObject.set(x, "renderNavBar", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderNavBarUndefined: Self = StObject.set(x, "renderNavBar", js.undefined)
      
      @scala.inline
      def setRenderRightButton(value: /* props */ CardSubViewProps => ReactNode): Self = StObject.set(x, "renderRightButton", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderRightButtonUndefined: Self = StObject.set(x, "renderRightButton", js.undefined)
      
      @scala.inline
      def setRenderTitle(value: /* props */ CardSubViewProps => ReactNode): Self = StObject.set(x, "renderTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderTitleUndefined: Self = StObject.set(x, "renderTitle", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
      
      @scala.inline
      def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait NavigationComponentProps
    extends StObject
       with NavigationProps {
    
    var children: js.UndefOr[js.Array[ReactElement]] = js.undefined
  }
  object NavigationComponentProps {
    
    @scala.inline
    def apply(): NavigationComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationComponentProps]
    }
    
    @scala.inline
    implicit class NavigationComponentPropsMutableBuilder[Self <: NavigationComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
  trait NavigationProps
    extends StObject
       with NavBarProps {
    
    var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var configureTransition: js.UndefOr[
        js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ /* transitionProps */ js.Any, 
          /* prevTransitionProps */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ js.Any
          ], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionSpec */ js.Any
        ]
      ] = js.undefined
    
    var onTransitionEnd: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var onTransitionStart: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  }
  object NavigationProps {
    
    @scala.inline
    def apply(): NavigationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationProps]
    }
    
    @scala.inline
    implicit class NavigationPropsMutableBuilder[Self <: NavigationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCardStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "cardStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardStyleNull: Self = StObject.set(x, "cardStyle", null)
      
      @scala.inline
      def setCardStyleUndefined: Self = StObject.set(x, "cardStyle", js.undefined)
      
      @scala.inline
      def setConfigureTransition(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ /* transitionProps */ js.Any, /* prevTransitionProps */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ js.Any
            ]) => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionSpec */ js.Any
      ): Self = StObject.set(x, "configureTransition", js.Any.fromFunction2(value))
      
      @scala.inline
      def setConfigureTransitionUndefined: Self = StObject.set(x, "configureTransition", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnTransitionStart(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onTransitionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionStartUndefined: Self = StObject.set(x, "onTransitionStart", js.undefined)
    }
  }
  
  trait TabBarComponentProps
    extends StObject
       with TabBarProps {
    
    var children: js.UndefOr[js.Array[ReactElement]] = js.undefined
  }
  object TabBarComponentProps {
    
    @scala.inline
    def apply(): TabBarComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarComponentProps]
    }
    
    @scala.inline
    implicit class TabBarComponentPropsMutableBuilder[Self <: TabBarComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
  trait TabBarProps extends StObject {
    
    var hideTabBar: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var renderLabel: js.UndefOr[js.Function1[/* props */ TabSubViewProps, ReactNode]] = js.undefined
    
    var renderTabBar: js.UndefOr[js.Function1[/* props */ TabSubViewProps, ReactNode]] = js.undefined
    
    // <BottomNavigation /> only:
    var renderTabIcon: js.UndefOr[js.Function1[/* props */ TabSubViewProps, ReactNode]] = js.undefined
    
    var tabActiveTintColor: js.UndefOr[String] = js.undefined
    
    var tabBarIndicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    // <Tabs /> only:
    var tabBarPosition: js.UndefOr[top | bottom] = js.undefined
    
    var tabBarStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var tabTintColor: js.UndefOr[String] = js.undefined
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
      def setHideTabBar(value: Boolean): Self = StObject.set(x, "hideTabBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideTabBarUndefined: Self = StObject.set(x, "hideTabBar", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
      
      @scala.inline
      def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setRenderLabel(value: /* props */ TabSubViewProps => ReactNode): Self = StObject.set(x, "renderLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderLabelUndefined: Self = StObject.set(x, "renderLabel", js.undefined)
      
      @scala.inline
      def setRenderTabBar(value: /* props */ TabSubViewProps => ReactNode): Self = StObject.set(x, "renderTabBar", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderTabBarUndefined: Self = StObject.set(x, "renderTabBar", js.undefined)
      
      @scala.inline
      def setRenderTabIcon(value: /* props */ TabSubViewProps => ReactNode): Self = StObject.set(x, "renderTabIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderTabIconUndefined: Self = StObject.set(x, "renderTabIcon", js.undefined)
      
      @scala.inline
      def setTabActiveTintColor(value: String): Self = StObject.set(x, "tabActiveTintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabActiveTintColorUndefined: Self = StObject.set(x, "tabActiveTintColor", js.undefined)
      
      @scala.inline
      def setTabBarIndicatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabBarIndicatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarIndicatorStyleNull: Self = StObject.set(x, "tabBarIndicatorStyle", null)
      
      @scala.inline
      def setTabBarIndicatorStyleUndefined: Self = StObject.set(x, "tabBarIndicatorStyle", js.undefined)
      
      @scala.inline
      def setTabBarPosition(value: top | bottom): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarPositionUndefined: Self = StObject.set(x, "tabBarPosition", js.undefined)
      
      @scala.inline
      def setTabBarStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabBarStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarStyleNull: Self = StObject.set(x, "tabBarStyle", null)
      
      @scala.inline
      def setTabBarStyleUndefined: Self = StObject.set(x, "tabBarStyle", js.undefined)
      
      @scala.inline
      def setTabStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabStyleNull: Self = StObject.set(x, "tabStyle", null)
      
      @scala.inline
      def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
      
      @scala.inline
      def setTabTintColor(value: String): Self = StObject.set(x, "tabTintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabTintColorUndefined: Self = StObject.set(x, "tabTintColor", js.undefined)
    }
  }
  
  trait TabProps
    extends StObject
       with RouteProps
       with TabBarProps {
    
    var onIndexChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var onReset: js.UndefOr[js.Function1[/* props */ TabBarProps & RouteProps, Unit]] = js.undefined
  }
  object TabProps {
    
    @scala.inline
    def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
    
    @scala.inline
    implicit class TabPropsMutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnIndexChange(value: /* index */ Double => Unit): Self = StObject.set(x, "onIndexChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnIndexChangeUndefined: Self = StObject.set(x, "onIndexChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: /* props */ TabBarProps & RouteProps => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    }
  }
  
  type TabSubViewProps = js.Any
  
  trait TabsProps
    extends StObject
       with TabBarProps {
    
    var configureTransition: js.UndefOr[
        js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ /* transitionProps */ js.Any, 
          /* prevTransitionProps */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ js.Any
          ], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionSpec */ js.Any
        ]
      ] = js.undefined
    
    // <Tabs /> only:
    var initialLayout: js.UndefOr[Height] = js.undefined
  }
  object TabsProps {
    
    @scala.inline
    def apply(): TabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsProps]
    }
    
    @scala.inline
    implicit class TabsPropsMutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigureTransition(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ /* transitionProps */ js.Any, /* prevTransitionProps */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ js.Any
            ]) => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionSpec */ js.Any
      ): Self = StObject.set(x, "configureTransition", js.Any.fromFunction2(value))
      
      @scala.inline
      def setConfigureTransitionUndefined: Self = StObject.set(x, "configureTransition", js.undefined)
      
      @scala.inline
      def setInitialLayout(value: Height): Self = StObject.set(x, "initialLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialLayoutUndefined: Self = StObject.set(x, "initialLayout", js.undefined)
    }
  }
}
