package typings.reactRouter

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactRouter.anon.PartialLocation
import typings.reactRouter.contextMod.Navigator
import typings.reactRouter.contextMod.RelativeRoutingType
import typings.reactRouter.contextMod.RouteMatch
import typings.reactRouter.contextMod.RouteObject
import typings.reactRouter.reactRouterBooleans.`false`
import typings.reactRouter.reactRouterBooleans.`true`
import typings.remixRunRouter.anon.ActionResult
import typings.remixRunRouter.historyMod.Action
import typings.remixRunRouter.historyMod.InitialEntry
import typings.remixRunRouter.historyMod.To
import typings.remixRunRouter.routerMod.Router
import typings.remixRunRouter.utilsMod.ActionFunction
import typings.remixRunRouter.utilsMod.ActionFunctionArgs
import typings.remixRunRouter.utilsMod.LoaderFunction
import typings.remixRunRouter.utilsMod.LoaderFunctionArgs
import typings.remixRunRouter.utilsMod.ShouldRevalidateFunction
import typings.remixRunRouter.utilsMod.TrackedPromise
import typings.std.Awaited
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("react-router/dist/lib/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Await(hasChildrenErrorElementResolve: AwaitProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Await")(hasChildrenErrorElementResolve.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MemoryRouter(hasBasenameChildrenInitialEntriesInitialIndex: MemoryRouterProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MemoryRouter")(hasBasenameChildrenInitialEntriesInitialIndex.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def Navigate(hasToReplaceStateRelative: NavigateProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Navigate")(hasToReplaceStateRelative.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  inline def Outlet(props: OutletProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Outlet")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def Route(_props: IndexRouteProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(_props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def Route(_props: LayoutRouteProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(_props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def Route(_props: PathRouteProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(_props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def Router(hasBasenamePropChildrenLocationPropNavigationTypeNavigatorStaticProp: RouterProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(hasBasenamePropChildrenLocationPropNavigationTypeNavigatorStaticProp.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def RouterProvider(hasFallbackElementRouter: RouterProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("RouterProvider")(hasFallbackElementRouter.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def Routes(hasChildrenLocation: RoutesProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Routes")(hasChildrenLocation.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def createRoutesFromChildren(children: ReactNode): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromChildren")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]
  inline def createRoutesFromChildren(children: ReactNode, parentPath: js.Array[Double]): js.Array[RouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromChildren")(children.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[RouteObject]]
  
  inline def enhanceManualRouteObjects(routes: js.Array[RouteObject]): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("enhanceManualRouteObjects")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]
  
  inline def renderMatches(): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("renderMatches")().asInstanceOf[ReactElement | Null]
  inline def renderMatches(matches: js.Array[RouteMatch[String, RouteObject]]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("renderMatches")(matches.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  trait AwaitProps extends StObject {
    
    var children: ReactNode | AwaitResolveRenderFunction
    
    var errorElement: js.UndefOr[ReactNode] = js.undefined
    
    var resolve: TrackedPromise | Any
  }
  object AwaitProps {
    
    inline def apply(resolve: TrackedPromise | Any): AwaitProps = {
      val __obj = js.Dynamic.literal(resolve = resolve.asInstanceOf[js.Any])
      __obj.asInstanceOf[AwaitProps]
    }
    
    extension [Self <: AwaitProps](x: Self) {
      
      inline def setChildren(value: ReactNode | AwaitResolveRenderFunction): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* data */ Awaited[Any] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setErrorElement(value: ReactNode): Self = StObject.set(x, "errorElement", value.asInstanceOf[js.Any])
      
      inline def setErrorElementUndefined: Self = StObject.set(x, "errorElement", js.undefined)
      
      inline def setResolve(value: TrackedPromise | Any): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    }
  }
  
  type AwaitResolveRenderFunction = js.Function1[/* data */ Awaited[Any], ReactElement]
  
  trait DataRouteProps extends StObject {
    
    var action: js.UndefOr[ActionFunction] = js.undefined
    
    var errorElement: js.UndefOr[ReactNode | Null] = js.undefined
    
    var handle: js.UndefOr[Any] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var loader: js.UndefOr[LoaderFunction] = js.undefined
    
    var shouldRevalidate: js.UndefOr[ShouldRevalidateFunction] = js.undefined
  }
  object DataRouteProps {
    
    inline def apply(): DataRouteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataRouteProps]
    }
    
    extension [Self <: DataRouteProps](x: Self) {
      
      inline def setAction(value: /* args */ ActionFunctionArgs => (js.Promise[Any | Response]) | Response | Any): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setErrorElement(value: ReactNode): Self = StObject.set(x, "errorElement", value.asInstanceOf[js.Any])
      
      inline def setErrorElementNull: Self = StObject.set(x, "errorElement", null)
      
      inline def setErrorElementUndefined: Self = StObject.set(x, "errorElement", js.undefined)
      
      inline def setHandle(value: Any): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLoader(value: /* args */ LoaderFunctionArgs => (js.Promise[Any | Response]) | Response | Any): Self = StObject.set(x, "loader", js.Any.fromFunction1(value))
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setShouldRevalidate(value: /* args */ ActionResult => Boolean): Self = StObject.set(x, "shouldRevalidate", js.Any.fromFunction1(value))
      
      inline def setShouldRevalidateUndefined: Self = StObject.set(x, "shouldRevalidate", js.undefined)
    }
  }
  
  trait IndexRouteProps
    extends StObject
       with DataRouteProps {
    
    var element: js.UndefOr[ReactNode | Null] = js.undefined
    
    var index: `true`
  }
  object IndexRouteProps {
    
    inline def apply(): IndexRouteProps = {
      val __obj = js.Dynamic.literal(index = true)
      __obj.asInstanceOf[IndexRouteProps]
    }
    
    extension [Self <: IndexRouteProps](x: Self) {
      
      inline def setElement(value: ReactNode): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setIndex(value: `true`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutRouteProps
    extends StObject
       with DataRouteProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var element: js.UndefOr[ReactNode | Null] = js.undefined
  }
  object LayoutRouteProps {
    
    inline def apply(): LayoutRouteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutRouteProps]
    }
    
    extension [Self <: LayoutRouteProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setElement(value: ReactNode): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  trait MemoryRouterProps extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var initialEntries: js.UndefOr[js.Array[InitialEntry]] = js.undefined
    
    var initialIndex: js.UndefOr[Double] = js.undefined
  }
  object MemoryRouterProps {
    
    inline def apply(): MemoryRouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemoryRouterProps]
    }
    
    extension [Self <: MemoryRouterProps](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialEntries(value: js.Array[InitialEntry]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
      
      inline def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
      
      inline def setInitialEntriesVarargs(value: InitialEntry*): Self = StObject.set(x, "initialEntries", js.Array(value*))
      
      inline def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
    }
  }
  
  trait NavigateProps extends StObject {
    
    var relative: js.UndefOr[RelativeRoutingType] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
    
    var to: To
  }
  object NavigateProps {
    
    inline def apply(to: To): NavigateProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigateProps]
    }
    
    extension [Self <: NavigateProps](x: Self) {
      
      inline def setRelative(value: RelativeRoutingType): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTo(value: To): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutletProps extends StObject {
    
    var context: js.UndefOr[Any] = js.undefined
  }
  object OutletProps {
    
    inline def apply(): OutletProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutletProps]
    }
    
    extension [Self <: OutletProps](x: Self) {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  trait PathRouteProps
    extends StObject
       with DataRouteProps {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var element: js.UndefOr[ReactNode | Null] = js.undefined
    
    var index: js.UndefOr[`false`] = js.undefined
    
    var path: String
  }
  object PathRouteProps {
    
    inline def apply(path: String): PathRouteProps = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathRouteProps]
    }
    
    extension [Self <: PathRouteProps](x: Self) {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setElement(value: ReactNode): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setIndex(value: `false`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteProps
    extends StObject
       with DataRouteProps {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var element: js.UndefOr[ReactNode | Null] = js.undefined
    
    var index: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object RouteProps {
    
    inline def apply(): RouteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteProps]
    }
    
    extension [Self <: RouteProps](x: Self) {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setElement(value: ReactNode): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait RouterProps extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var location: PartialLocation | String
    
    var navigationType: js.UndefOr[Action] = js.undefined
    
    var navigator: Navigator
    
    var static: js.UndefOr[Boolean] = js.undefined
  }
  object RouterProps {
    
    inline def apply(location: PartialLocation | String, navigator: Navigator): RouterProps = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterProps]
    }
    
    extension [Self <: RouterProps](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLocation(value: PartialLocation | String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setNavigationType(value: Action): Self = StObject.set(x, "navigationType", value.asInstanceOf[js.Any])
      
      inline def setNavigationTypeUndefined: Self = StObject.set(x, "navigationType", js.undefined)
      
      inline def setNavigator(value: Navigator): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
      
      inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    }
  }
  
  trait RouterProviderProps extends StObject {
    
    var fallbackElement: js.UndefOr[ReactNode] = js.undefined
    
    var router: Router
  }
  object RouterProviderProps {
    
    inline def apply(router: Router): RouterProviderProps = {
      val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterProviderProps]
    }
    
    extension [Self <: RouterProviderProps](x: Self) {
      
      inline def setFallbackElement(value: ReactNode): Self = StObject.set(x, "fallbackElement", value.asInstanceOf[js.Any])
      
      inline def setFallbackElementUndefined: Self = StObject.set(x, "fallbackElement", js.undefined)
      
      inline def setRouter(value: Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoutesProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var location: js.UndefOr[PartialLocation | String] = js.undefined
  }
  object RoutesProps {
    
    inline def apply(): RoutesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoutesProps]
    }
    
    extension [Self <: RoutesProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLocation(value: PartialLocation | String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
}
