package typings.reactRouter

import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactRouter.anon.Basename
import typings.reactRouter.anon.Data
import typings.reactRouter.anon.Relative
import typings.reactRouter.anon.Revalidate
import typings.reactRouter.distLibComponentsMod.AwaitProps
import typings.reactRouter.distLibComponentsMod.MemoryRouterProps
import typings.reactRouter.distLibComponentsMod.NavigateProps
import typings.reactRouter.distLibComponentsMod.OutletProps
import typings.reactRouter.distLibComponentsMod.RouteProps
import typings.reactRouter.distLibComponentsMod.RouterProps
import typings.reactRouter.distLibComponentsMod.RouterProviderProps
import typings.reactRouter.distLibComponentsMod.RoutesProps
import typings.reactRouter.distLibContextMod.DataRouterContextObject
import typings.reactRouter.distLibContextMod.LocationContextObject
import typings.reactRouter.distLibContextMod.NavigationContextObject
import typings.reactRouter.distLibContextMod.RouteContextObject
import typings.reactRouter.distLibContextMod.RouteMatch
import typings.reactRouter.distLibContextMod.RouteObject
import typings.reactRouter.distLibHooksMod.NavigateFunction
import typings.remixRunRouter.anon.PartialLocation
import typings.remixRunRouter.anon.PartialPath
import typings.remixRunRouter.distHistoryMod.Action
import typings.remixRunRouter.distHistoryMod.Location
import typings.remixRunRouter.distHistoryMod.Path
import typings.remixRunRouter.distHistoryMod.To
import typings.remixRunRouter.distRouterMod.Navigation
import typings.remixRunRouter.distRouterMod.Router
import typings.remixRunRouter.distRouterMod.RouterState
import typings.remixRunRouter.distRouterMod.StaticHandlerContext
import typings.remixRunRouter.distUtilsMod.AgnosticRouteMatch
import typings.remixRunRouter.distUtilsMod.AgnosticRouteObject
import typings.remixRunRouter.distUtilsMod.DeferredData
import typings.remixRunRouter.distUtilsMod.JsonFunction
import typings.remixRunRouter.distUtilsMod.ParamParseKey
import typings.remixRunRouter.distUtilsMod.PathMatch
import typings.remixRunRouter.distUtilsMod.PathPattern
import typings.remixRunRouter.distUtilsMod.RedirectFunction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-router", "AbortedDeferredError")
  @js.native
  open class AbortedDeferredError ()
    extends typings.remixRunRouter.mod.AbortedDeferredError
  
  inline def Await(param0: AwaitProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Await")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MemoryRouter(param0: MemoryRouterProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MemoryRouter")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def Navigate(param0: NavigateProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Navigate")(param0.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  @JSImport("react-router", "NavigationType")
  @js.native
  object NavigationType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Action & String] = js.native
    
    /* "POP" */ val Pop: typings.remixRunRouter.distHistoryMod.Action.Pop & String = js.native
    
    /* "PUSH" */ val Push: typings.remixRunRouter.distHistoryMod.Action.Push & String = js.native
    
    /* "REPLACE" */ val Replace: typings.remixRunRouter.distHistoryMod.Action.Replace & String = js.native
  }
  
  inline def Outlet(props: OutletProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Outlet")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def Route(_props: RouteProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(_props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def Router(param0: RouterProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def RouterProvider(param0: RouterProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("RouterProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def Routes(param0: RoutesProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Routes")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  @JSImport("react-router", "UNSAFE_DataRouterContext")
  @js.native
  val UNSAFEDataRouterContext: Context[DataRouterContextObject | Null] = js.native
  
  @JSImport("react-router", "UNSAFE_DataRouterStateContext")
  @js.native
  val UNSAFEDataRouterStateContext: Context[RouterState | Null] = js.native
  
  @JSImport("react-router", "UNSAFE_DataStaticRouterContext")
  @js.native
  val UNSAFEDataStaticRouterContext: Context[StaticHandlerContext | Null] = js.native
  
  inline def UNSAFEEnhanceManualRouteObjects(routes: js.Array[RouteObject]): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_enhanceManualRouteObjects")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]
  
  @JSImport("react-router", "UNSAFE_LocationContext")
  @js.native
  val UNSAFELocationContext: Context[LocationContextObject] = js.native
  
  @JSImport("react-router", "UNSAFE_NavigationContext")
  @js.native
  val UNSAFENavigationContext: Context[NavigationContextObject] = js.native
  
  @JSImport("react-router", "UNSAFE_RouteContext")
  @js.native
  val UNSAFERouteContext: Context[RouteContextObject] = js.native
  
  inline def createMemoryRouter(routes: js.Array[RouteObject]): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryRouter")(routes.asInstanceOf[js.Any]).asInstanceOf[Router]
  inline def createMemoryRouter(routes: js.Array[RouteObject], opts: Basename): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryRouter")(routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Router]
  
  inline def createPath(param0: PartialPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createRoutesFromChildren(children: ReactNode): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromChildren")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]
  inline def createRoutesFromChildren(children: ReactNode, parentPath: js.Array[Double]): js.Array[RouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromChildren")(children.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[RouteObject]]
  
  inline def createRoutesFromElements(children: ReactNode): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromElements")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]
  inline def createRoutesFromElements(children: ReactNode, parentPath: js.Array[Double]): js.Array[RouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromElements")(children.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[RouteObject]]
  
  inline def defer(data: Record[String, Any]): DeferredData = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(data.asInstanceOf[js.Any]).asInstanceOf[DeferredData]
  
  inline def generatePath[Path /* <: String */](path: Path): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generatePath[Path /* <: String */](
    path: Path,
    params: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in @remix-run/router.@remix-run/router/dist/utils.PathParam<Path> ]: string} */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(path.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isRouteErrorResponse(e: Any): /* is @remix-run/router.@remix-run/router/dist/utils.ErrorResponse */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRouteErrorResponse")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @remix-run/router.@remix-run/router/dist/utils.ErrorResponse */ Boolean]
  
  @JSImport("react-router", "json")
  @js.native
  val json: JsonFunction = js.native
  
  inline def matchPath[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: Path, pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]
  inline def matchPath[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: PathPattern[Path], pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]
  
  inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
  inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: String, basename: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
  inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: PartialLocation): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
  inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: PartialLocation, basename: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
  
  inline def parsePath(path: String): PartialPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[PartialPath]
  
  @JSImport("react-router", "redirect")
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
  inline def useHref(to: To, param1: Relative): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useHref")(to.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  
  inline def useParams[ParamsOrKey /* <: String | (Record[String, js.UndefOr[String]]) */](): /* import warning: importer.ImportType#apply Failed type conversion: [ParamsOrKey] extends [string] ? @remix-run/router.@remix-run/router/dist/utils.Params<ParamsOrKey> : std.Partial<ParamsOrKey> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useParams")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ParamsOrKey] extends [string] ? @remix-run/router.@remix-run/router/dist/utils.Params<ParamsOrKey> : std.Partial<ParamsOrKey> */ js.Any]
  
  inline def useResolvedPath(to: To): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("useResolvedPath")(to.asInstanceOf[js.Any]).asInstanceOf[Path]
  inline def useResolvedPath(to: To, param1: Relative): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("useResolvedPath")(to.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Path]
  
  inline def useRevalidator(): Revalidate = ^.asInstanceOf[js.Dynamic].applyDynamic("useRevalidator")().asInstanceOf[Revalidate]
  
  inline def useRouteError(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteError")().asInstanceOf[Any]
  
  inline def useRouteLoaderData(routeId: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteLoaderData")(routeId.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useRoutes(routes: js.Array[RouteObject]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def useRoutes(routes: js.Array[RouteObject], locationArg: String): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  inline def useRoutes(routes: js.Array[RouteObject], locationArg: typings.reactRouter.anon.PartialLocation): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  type Hash = String
  
  type Pathname = String
  
  type Search = String
}
