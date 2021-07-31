package typings.reactRouterNavigationCore

import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactRouter.mod.RouterProps
import typings.reactRouter.mod.`match`
import typings.reactRouterNavigationCore.anon.Cards
import typings.reactRouterNavigationCore.anon.ForceSync
import typings.reactRouterNavigationCore.anon.LoadedTabs
import typings.reactRouterNavigationCore.anon.Params
import typings.reactRouterNavigationCore.anon.TestID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-router-navigation-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-router-navigation-core", "CardStack")
  @js.native
  class CardStack protected ()
    extends PureComponent[CardStackProps, Cards, js.Any] {
    def this(props: CardStackProps) = this()
    def this(props: CardStackProps, context: js.Any) = this()
    
    def onListenHistory(history: History[LocationState], nextHistory: History[LocationState]): Unit = js.native
    
    // Pop to previous scene (n-1)
    def onNavigateBack(): Boolean = js.native
    
    def unlistenHistory(): Unit = js.native
  }
  
  @JSImport("react-router-navigation-core", "TabStack")
  @js.native
  class TabStack protected ()
    extends PureComponent[TabStackProps, LoadedTabs, js.Any] {
    def this(props: TabStackProps) = this()
    
    def onIndexChange(index: Double): Unit = js.native
    
    def onListenHistory(history: History[LocationState], nextHistory: History[LocationState]): Unit = js.native
    
    var unlistenHistory: js.UndefOr[js.Function0[Unit]] = js.native
  }
  /* static members */
  object TabStack {
    
    @JSImport("react-router-navigation-core", "TabStack")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-router-navigation-core", "TabStack.defaultProps")
    @js.native
    def defaultProps: ForceSync = js.native
    @scala.inline
    def defaultProps_=(x: ForceSync): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def build[Item](children: js.Array[ReactElement]): js.Array[Item] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[Item]]
  @scala.inline
  def build[Item](children: js.Array[ReactElement], oldBuild: js.Array[Item]): js.Array[Item] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(children.asInstanceOf[js.Any], oldBuild.asInstanceOf[js.Any])).asInstanceOf[js.Array[Item]]
  
  @scala.inline
  def createKey(route: Route[js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createKey")(route.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def get[Item /* <: Route[js.Object] */](items: js.Array[Item], route: Route[js.Object]): Item = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(items.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[Item]
  
  @scala.inline
  def getRoute(stack: js.Array[RouteProps], location: Location[LocationState]): js.UndefOr[Route[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRoute")(stack.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Route[js.Object]]]
  
  @scala.inline
  def renderSubView(render: js.Function2[/* propsA */ js.Any, /* propsB */ js.Any, ReactNode]): js.Function1[/* ownProps */ js.Any, ReactNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderSubView")(render.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ownProps */ js.Any, ReactNode]]
  @scala.inline
  def renderSubView(render: js.Function2[/* propsA */ js.Any, /* propsB */ js.Any, ReactNode], additionalProps: js.Any): js.Function1[/* ownProps */ js.Any, ReactNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSubView")(render.asInstanceOf[js.Any], additionalProps.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ownProps */ js.Any, ReactNode]]
  
  @scala.inline
  def runHistoryListenner(history: History[LocationState], onListenHistory: js.Function0[Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("runHistoryListenner")(history.asInstanceOf[js.Any], onListenHistory.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def shouldUpdate(
    currentItem: RouteProps,
    nextItem: RouteProps,
    currentLocation: Location[LocationState],
    nextLocation: Location[LocationState]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldUpdate")(currentItem.asInstanceOf[js.Any], nextItem.asInstanceOf[js.Any], currentLocation.asInstanceOf[js.Any], nextLocation.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Card
    extends StObject
       with RouteProps {
    
    var key: String
  }
  object Card {
    
    @scala.inline
    def apply(key: String): Card = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Card]
    }
    
    @scala.inline
    implicit class CardMutableBuilder[Self <: Card] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait CardStackProps extends StObject {
    
    var children: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    def render(props: CardsRendererProps): ReactNode
  }
  object CardStackProps {
    
    @scala.inline
    def apply(render: CardsRendererProps => ReactNode): CardStackProps = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[CardStackProps]
    }
    
    @scala.inline
    implicit class CardStackPropsMutableBuilder[Self <: CardStackProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setRender(value: CardsRendererProps => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CardsRendererProps extends StObject {
    
    var cards: js.Array[Card] = js.native
    
    var navigationState: NavigationState[Params] = js.native
    
    def onNavigateBack(): Boolean = js.native
    def onNavigateBack(routeKey: String): Boolean = js.native
  }
  
  trait NavigationState[OwnRoute] extends StObject {
    
    var index: Double
    
    var routes: js.Array[Route[js.Object] & OwnRoute]
  }
  object NavigationState {
    
    @scala.inline
    def apply[OwnRoute](index: Double, routes: js.Array[Route[js.Object] & OwnRoute]): NavigationState[OwnRoute] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationState[OwnRoute]]
    }
    
    @scala.inline
    implicit class NavigationStateMutableBuilder[Self <: NavigationState[?], OwnRoute] (val x: Self & NavigationState[OwnRoute]) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutes(value: js.Array[Route[js.Object] & OwnRoute]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesVarargs(value: (Route[js.Object] & OwnRoute)*): Self = StObject.set(x, "routes", js.Array(value :_*))
    }
  }
  
  trait Route[T] extends StObject {
    
    var key: String
    
    var `match`: js.UndefOr[typings.reactRouter.mod.`match`[T]] = js.undefined
    
    var routeName: String
  }
  object Route {
    
    @scala.inline
    def apply[T](key: String, routeName: String): Route[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route[T]]
    }
    
    @scala.inline
    implicit class RouteMutableBuilder[Self <: Route[?], T] (val x: Self & Route[T]) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatch(value: `match`[T]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteProps extends StObject {
    
    var children: js.UndefOr[(js.Function1[/* props */ RouterProps, ReactNode]) | ReactNode] = js.undefined
    
    var component: js.UndefOr[ComponentClass[RouterProps, ComponentState]] = js.undefined
    
    var exact: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* props */ RouterProps, ReactNode]] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object RouteProps {
    
    @scala.inline
    def apply(): RouteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteProps]
    }
    
    @scala.inline
    implicit class RoutePropsMutableBuilder[Self <: RouteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (js.Function1[/* props */ RouterProps, ReactNode]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* props */ RouterProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setComponent(value: ComponentClass[RouterProps, ComponentState]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setRender(value: /* props */ RouterProps => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait Tab
    extends StObject
       with RouteProps {
    
    var key: String
    
    var onIndexChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  }
  object Tab {
    
    @scala.inline
    def apply(key: String): Tab = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tab]
    }
    
    @scala.inline
    implicit class TabMutableBuilder[Self <: Tab] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnIndexChange(value: /* index */ Double => Unit): Self = StObject.set(x, "onIndexChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnIndexChangeUndefined: Self = StObject.set(x, "onIndexChange", js.undefined)
    }
  }
  
  trait TabStackProps extends StObject {
    
    var children: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    var forceSync: js.UndefOr[Boolean] = js.undefined
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    def render(props: TabsRendererProps): ReactNode
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object TabStackProps {
    
    @scala.inline
    def apply(render: TabsRendererProps => ReactNode): TabStackProps = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[TabStackProps]
    }
    
    @scala.inline
    implicit class TabStackPropsMutableBuilder[Self <: TabStackProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setForceSync(value: Boolean): Self = StObject.set(x, "forceSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceSyncUndefined: Self = StObject.set(x, "forceSync", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setRender(value: TabsRendererProps => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait TabsRendererProps extends StObject {
    
    var loadedTabs: js.Array[String]
    
    var navigationState: NavigationState[TestID]
    
    def onIndexChange(index: Double): Unit
    
    var tabs: js.Array[Tab]
  }
  object TabsRendererProps {
    
    @scala.inline
    def apply(
      loadedTabs: js.Array[String],
      navigationState: NavigationState[TestID],
      onIndexChange: Double => Unit,
      tabs: js.Array[Tab]
    ): TabsRendererProps = {
      val __obj = js.Dynamic.literal(loadedTabs = loadedTabs.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsRendererProps]
    }
    
    @scala.inline
    implicit class TabsRendererPropsMutableBuilder[Self <: TabsRendererProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadedTabs(value: js.Array[String]): Self = StObject.set(x, "loadedTabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedTabsVarargs(value: String*): Self = StObject.set(x, "loadedTabs", js.Array(value :_*))
      
      @scala.inline
      def setNavigationState(value: NavigationState[TestID]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnIndexChange(value: Double => Unit): Self = StObject.set(x, "onIndexChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTabs(value: js.Array[Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsVarargs(value: Tab*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    }
  }
}
