package typings.storybookRouter.reactRouterIndexMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.storybookRouter.anon.PartialLocation
import typings.storybookRouter.reactRouterIndexMod.^
import typings.storybookRouter.reactRouterNodeModulesHistoryIndexMod.Action
import typings.storybookRouter.reactRouterNodeModulesHistoryIndexMod.Location
import typings.storybookRouter.reactRouterNodeModulesHistoryIndexMod.Path
import typings.storybookRouter.reactRouterNodeModulesHistoryIndexMod.To
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def MemoryRouter(hasBasenameChildrenInitialEntriesInitialIndex: MemoryRouterProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MemoryRouter")(hasBasenameChildrenInitialEntriesInitialIndex.asInstanceOf[js.Any]).asInstanceOf[ReactElement]

inline def Navigate(hasToReplaceState: NavigateProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Navigate")(hasToReplaceState.asInstanceOf[js.Any]).asInstanceOf[Null]

inline def Outlet(_props: OutletProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Outlet")(_props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]

inline def Route(_props: IndexRouteProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(_props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
inline def Route(_props: LayoutRouteProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(_props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
inline def Route(_props: PathRouteProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(_props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]

inline def Router(hasBasenamePropChildrenLocationPropNavigationTypeNavigatorStaticProp: RouterProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(hasBasenamePropChildrenLocationPropNavigationTypeNavigatorStaticProp.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]

inline def Routes(hasChildrenLocation: RoutesProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Routes")(hasChildrenLocation.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]

inline def UNSAFELocationContext: Context[LocationContextObject] = ^.asInstanceOf[js.Dynamic].selectDynamic("UNSAFE_LocationContext").asInstanceOf[Context[LocationContextObject]]

inline def UNSAFENavigationContext: Context[NavigationContextObject] = ^.asInstanceOf[js.Dynamic].selectDynamic("UNSAFE_NavigationContext").asInstanceOf[Context[NavigationContextObject]]

inline def UNSAFERouteContext: Context[RouteContextObject] = ^.asInstanceOf[js.Dynamic].selectDynamic("UNSAFE_RouteContext").asInstanceOf[Context[RouteContextObject]]

inline def createRoutesFromChildren(children: ReactNode): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromChildren")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]

inline def generatePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
inline def generatePath(path: String, params: Params[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(path.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]

inline def matchPath[ParamKey /* <: String */](pattern: String, pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]
inline def matchPath[ParamKey /* <: String */](pattern: PathPattern, pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]

inline def matchRoutes(routes: js.Array[RouteObject], locationArg: String): js.Array[RouteMatch[String]] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[RouteMatch[String]] | Null]
inline def matchRoutes(routes: js.Array[RouteObject], locationArg: String, basename: String): js.Array[RouteMatch[String]] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[js.Array[RouteMatch[String]] | Null]
inline def matchRoutes(routes: js.Array[RouteObject], locationArg: PartialLocation): js.Array[RouteMatch[String]] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[RouteMatch[String]] | Null]
inline def matchRoutes(routes: js.Array[RouteObject], locationArg: PartialLocation, basename: String): js.Array[RouteMatch[String]] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[js.Array[RouteMatch[String]] | Null]

inline def renderMatches(): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("renderMatches")().asInstanceOf[ReactElement | Null]
inline def renderMatches(matches: js.Array[RouteMatch[String]]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("renderMatches")(matches.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]

inline def resolvePath(to: To): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(to.asInstanceOf[js.Any]).asInstanceOf[Path]
inline def resolvePath(to: To, fromPathname: String): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(to.asInstanceOf[js.Any], fromPathname.asInstanceOf[js.Any])).asInstanceOf[Path]

inline def useHref(to: To): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useHref")(to.asInstanceOf[js.Any]).asInstanceOf[String]

inline def useInRouterContext(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useInRouterContext")().asInstanceOf[Boolean]

inline def useLocation(): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[Location]

inline def useMatch[ParamKey /* <: String */](pattern: String): PathMatch[ParamKey] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatch")(pattern.asInstanceOf[js.Any]).asInstanceOf[PathMatch[ParamKey] | Null]
inline def useMatch[ParamKey /* <: String */](pattern: PathPattern): PathMatch[ParamKey] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatch")(pattern.asInstanceOf[js.Any]).asInstanceOf[PathMatch[ParamKey] | Null]

inline def useNavigate(): NavigateFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigate")().asInstanceOf[NavigateFunction]

inline def useNavigationType(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigationType")().asInstanceOf[Action]

inline def useOutlet(): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useOutlet")().asInstanceOf[ReactElement | Null]

inline def useParams[Key /* <: String */](): Params[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("useParams")().asInstanceOf[Params[Key]]

inline def useResolvedPath(to: To): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("useResolvedPath")(to.asInstanceOf[js.Any]).asInstanceOf[Path]

inline def useRoutes(routes: js.Array[RouteObject]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
inline def useRoutes(routes: js.Array[RouteObject], locationArg: String): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
inline def useRoutes(routes: js.Array[RouteObject], locationArg: PartialLocation): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]

type Params[Key /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{readonly [ key in Key ]: string | undefined}
  */ typings.storybookRouter.storybookRouterStrings.Params & TopLevel[Any]
