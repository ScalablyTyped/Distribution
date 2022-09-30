package typings.reduxRouter

import org.scalablytyped.runtime.TopLevel
import typings.history.mod.Pathname
import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactRouter.anon.Basename
import typings.reactRouter.anon.Data
import typings.reactRouter.anon.Relative
import typings.reactRouter.anon.Revalidate
import typings.reactRouter.componentsMod.AwaitProps
import typings.reactRouter.componentsMod.IndexRouteProps
import typings.reactRouter.componentsMod.LayoutRouteProps
import typings.reactRouter.componentsMod.MemoryRouterProps
import typings.reactRouter.componentsMod.NavigateProps
import typings.reactRouter.componentsMod.OutletProps
import typings.reactRouter.componentsMod.PathRouteProps
import typings.reactRouter.componentsMod.RouterProps
import typings.reactRouter.componentsMod.RouterProviderProps
import typings.reactRouter.componentsMod.RoutesProps
import typings.reactRouter.contextMod.DataRouterContextObject
import typings.reactRouter.contextMod.LocationContextObject
import typings.reactRouter.contextMod.NavigationContextObject
import typings.reactRouter.contextMod.RouteContextObject
import typings.reactRouter.contextMod.RouteMatch
import typings.reactRouter.contextMod.RouteObject
import typings.reactRouter.hooksMod.NavigateFunction
import typings.reduxRouter.actionCreatorsMod.ReduxRouterAction
import typings.remixRunRouter.anon.PartialLocation
import typings.remixRunRouter.anon.PartialPath
import typings.remixRunRouter.historyMod.Action
import typings.remixRunRouter.historyMod.Location
import typings.remixRunRouter.historyMod.Path
import typings.remixRunRouter.historyMod.To
import typings.remixRunRouter.routerMod.Navigation
import typings.remixRunRouter.routerMod.Router
import typings.remixRunRouter.routerMod.RouterState
import typings.remixRunRouter.routerMod.StaticHandlerContext
import typings.remixRunRouter.utilsMod.AgnosticRouteMatch
import typings.remixRunRouter.utilsMod.AgnosticRouteObject
import typings.remixRunRouter.utilsMod.DeferredData
import typings.remixRunRouter.utilsMod.JsonFunction
import typings.remixRunRouter.utilsMod.ParamParseKey
import typings.remixRunRouter.utilsMod.Params
import typings.remixRunRouter.utilsMod.PathMatch
import typings.remixRunRouter.utilsMod.PathPattern
import typings.remixRunRouter.utilsMod.RedirectFunction
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ReduxRouter {
    
    @JSImport("redux-router", "ReduxRouter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("redux-router", "ReduxRouter.AbortedDeferredError")
    @js.native
    open class AbortedDeferredError ()
      extends typings.reduxRouter.reduxRouterMod.default.AbortedDeferredError
    
    inline def Await(hasChildrenErrorElementResolve: AwaitProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Await")(hasChildrenErrorElementResolve.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def MemoryRouter(hasBasenameChildrenInitialEntriesInitialIndex: MemoryRouterProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MemoryRouter")(hasBasenameChildrenInitialEntriesInitialIndex.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    inline def Navigate(hasToReplaceStateRelative: NavigateProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Navigate")(hasToReplaceStateRelative.asInstanceOf[js.Any]).asInstanceOf[Null]
    
    @JSImport("redux-router", "ReduxRouter.NavigationType")
    @js.native
    object NavigationType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[Action & String] = js.native
      
      /* "POP" */ val Pop: typings.remixRunRouter.historyMod.Action.Pop & String = js.native
      
      /* "PUSH" */ val Push: typings.remixRunRouter.historyMod.Action.Push & String = js.native
      
      /* "REPLACE" */ val Replace: typings.remixRunRouter.historyMod.Action.Replace & String = js.native
    }
    
    inline def Outlet(props: OutletProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Outlet")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    inline def Route(_props: IndexRouteProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(_props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def Route(_props: LayoutRouteProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(_props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def Route(_props: PathRouteProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(_props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    inline def Router(hasBasenamePropChildrenLocationPropNavigationTypeNavigatorStaticProp: RouterProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(hasBasenamePropChildrenLocationPropNavigationTypeNavigatorStaticProp.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    inline def RouterProvider(hasFallbackElementRouter: RouterProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("RouterProvider")(hasFallbackElementRouter.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    inline def Routes(hasChildrenLocation: RoutesProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Routes")(hasChildrenLocation.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("redux-router", "ReduxRouter.UNSAFE_DataRouterContext")
    @js.native
    val UNSAFEDataRouterContext: Context[DataRouterContextObject | Null] = js.native
    
    @JSImport("redux-router", "ReduxRouter.UNSAFE_DataRouterStateContext")
    @js.native
    val UNSAFEDataRouterStateContext: Context[RouterState | Null] = js.native
    
    @JSImport("redux-router", "ReduxRouter.UNSAFE_DataStaticRouterContext")
    @js.native
    val UNSAFEDataStaticRouterContext: Context[StaticHandlerContext | Null] = js.native
    
    inline def UNSAFEEnhanceManualRouteObjects(routes: js.Array[RouteObject]): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_enhanceManualRouteObjects")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]
    
    @JSImport("redux-router", "ReduxRouter.UNSAFE_LocationContext")
    @js.native
    val UNSAFELocationContext: Context[LocationContextObject] = js.native
    
    @JSImport("redux-router", "ReduxRouter.UNSAFE_NavigationContext")
    @js.native
    val UNSAFENavigationContext: Context[NavigationContextObject] = js.native
    
    @JSImport("redux-router", "ReduxRouter.UNSAFE_RouteContext")
    @js.native
    val UNSAFERouteContext: Context[RouteContextObject] = js.native
    
    inline def createMemoryRouter(routes: js.Array[RouteObject]): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryRouter")(routes.asInstanceOf[js.Any]).asInstanceOf[Router]
    inline def createMemoryRouter(routes: js.Array[RouteObject], opts: Basename): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryRouter")(routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Router]
    
    inline def createPath(hasPathnameSearchHash: PartialPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(hasPathnameSearchHash.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def createRoutesFromChildren(children: ReactNode): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromChildren")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]
    inline def createRoutesFromChildren(children: ReactNode, parentPath: js.Array[Double]): js.Array[RouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromChildren")(children.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[RouteObject]]
    
    inline def createRoutesFromElements(children: ReactNode): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromElements")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]
    inline def createRoutesFromElements(children: ReactNode, parentPath: js.Array[Double]): js.Array[RouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromElements")(children.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[RouteObject]]
    
    inline def defer(data: Record[String, Any]): DeferredData = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(data.asInstanceOf[js.Any]).asInstanceOf[DeferredData]
    
    inline def generatePath[Path /* <: String */](path: Path): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def generatePath[Path /* <: String */](
      path: Path,
      params: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in @remix-run/router.@remix-run/router/dist/utils.PathParam<Path> ]: string}
      */ typings.reduxRouter.reduxRouterStrings.generatePath & TopLevel[Any]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(path.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def isRouteErrorResponse(e: Any): /* is @remix-run/router.@remix-run/router/dist/utils.ErrorResponse */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRouteErrorResponse")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @remix-run/router.@remix-run/router/dist/utils.ErrorResponse */ Boolean]
    
    @JSImport("redux-router", "ReduxRouter.json")
    @js.native
    val json: JsonFunction = js.native
    
    inline def matchPath[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: Path, pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]
    inline def matchPath[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: PathPattern[Path], pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]
    
    inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
    inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: String, basename: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
    inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: PartialLocation): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
    inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: PartialLocation, basename: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
    
    inline def parsePath(path: String): PartialPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[PartialPath]
    
    @JSImport("redux-router", "ReduxRouter.redirect")
    @js.native
    val redirect: RedirectFunction = js.native
    
    inline def renderMatches(): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("renderMatches")().asInstanceOf[ReactElement | Null]
    inline def renderMatches(matches: js.Array[RouteMatch[String, RouteObject]]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("renderMatches")(matches.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    inline def resolvePath(to: To): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(to.asInstanceOf[js.Any]).asInstanceOf[Path]
    inline def resolvePath(to: To, fromPathname: String): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(to.asInstanceOf[js.Any], fromPathname.asInstanceOf[js.Any])).asInstanceOf[Path]
    
    inline def useActionData(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useActionData")().asInstanceOf[Any]
    
    inline def useAsyncError(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncError")().asInstanceOf[Any]
    
    inline def useAsyncValue(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncValue")().asInstanceOf[Any]
    
    inline def useHref(to: To): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useHref")(to.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def useHref(to: To, hasRelative: Relative): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useHref")(to.asInstanceOf[js.Any], hasRelative.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def useInRouterContext(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useInRouterContext")().asInstanceOf[Boolean]
    
    inline def useLoaderData(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useLoaderData")().asInstanceOf[Any]
    
    inline def useLocation(): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[Location]
    
    inline def useMatch[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: Path): PathMatch[ParamKey] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatch")(pattern.asInstanceOf[js.Any]).asInstanceOf[PathMatch[ParamKey] | Null]
    inline def useMatch[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: PathPattern[Path]): PathMatch[ParamKey] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatch")(pattern.asInstanceOf[js.Any]).asInstanceOf[PathMatch[ParamKey] | Null]
    
    inline def useMatches(): js.Array[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatches")().asInstanceOf[js.Array[Data]]
    
    inline def useNavigate(): NavigateFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigate")().asInstanceOf[NavigateFunction]
    
    inline def useNavigation(): Navigation = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigation")().asInstanceOf[Navigation]
    
    inline def useNavigationType(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigationType")().asInstanceOf[Action]
    
    inline def useOutlet(): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useOutlet")().asInstanceOf[ReactElement | Null]
    inline def useOutlet(context: Any): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useOutlet")(context.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    inline def useOutletContext[Context](): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("useOutletContext")().asInstanceOf[Context]
    
    inline def useParams[ParamsOrKey /* <: String | (Record[String, js.UndefOr[String]]) */](): Partial[ParamsOrKey] | Params[ParamsOrKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("useParams")().asInstanceOf[Partial[ParamsOrKey] | Params[ParamsOrKey]]
    
    inline def useResolvedPath(to: To): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("useResolvedPath")(to.asInstanceOf[js.Any]).asInstanceOf[Path]
    inline def useResolvedPath(to: To, hasRelative: Relative): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("useResolvedPath")(to.asInstanceOf[js.Any], hasRelative.asInstanceOf[js.Any])).asInstanceOf[Path]
    
    inline def useRevalidator(): Revalidate = ^.asInstanceOf[js.Dynamic].applyDynamic("useRevalidator")().asInstanceOf[Revalidate]
    
    inline def useRouteError(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteError")().asInstanceOf[Any]
    
    inline def useRouteLoaderData(routeId: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteLoaderData")(routeId.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def useRoutes(routes: js.Array[RouteObject]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def useRoutes(routes: js.Array[RouteObject], locationArg: String): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    inline def useRoutes(routes: js.Array[RouteObject], locationArg: typings.reactRouter.anon.PartialLocation): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  }
  
  inline def go(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("go")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReduxRouterAction]
  
  inline def goBack(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReduxRouterAction]
  
  inline def goForward(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goForward")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReduxRouterAction]
  
  inline def historyAPI(method: Any): js.Function1[/* repeated */ js.Object, ReduxRouterAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("historyAPI")(method.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Object, ReduxRouterAction]]
  
  inline def isActive(pathname: Pathname): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActive")(pathname.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isActive(
    pathname: Pathname,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.Query */ Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActive")(pathname.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isActive(
    pathname: Pathname,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.Query */ Any,
    indexOnly: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActive")(pathname.asInstanceOf[js.Any], query.asInstanceOf[js.Any], indexOnly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isActive(pathname: Pathname, query: Unit, indexOnly: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActive")(pathname.asInstanceOf[js.Any], query.asInstanceOf[js.Any], indexOnly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def push(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReduxRouterAction]
  
  inline def pushState(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("pushState")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReduxRouterAction]
  
  @JSImport("redux-router", "reduxReactRouter")
  @js.native
  val reduxReactRouter: Any = js.native
  
  inline def replace(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReduxRouterAction]
  
  inline def replaceState(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceState")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReduxRouterAction]
  
  inline def routerStateReducer(state: Any, action: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("routerStateReducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setState(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setState")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReduxRouterAction]
}
