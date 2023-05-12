package typings.remixRunRouter.distUtilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.remixRunRouter.anon.ActionResult
import typings.remixRunRouter.anon.HasErrorBoundary
import typings.remixRunRouter.anon.PartialLocation
import typings.remixRunRouter.distHistoryMod.Path
import typings.remixRunRouter.distHistoryMod.To
import typings.remixRunRouter.distUtilsMod.^
import typings.remixRunRouter.remixRunRouterStrings.Asterisk
import typings.remixRunRouter.remixRunRouterStrings.GET
import typings.std.Exclude
import typings.std.NonNullable
import typings.std.Omit
import typings.std.Record
import typings.std.Response
import typings.std.ResponseInit
import typings.std.Set
import typings.std.Uppercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def convertRoutesToDataRoutes(routes: js.Array[AgnosticRouteObject], mapRouteProperties: MapRoutePropertiesFunction): js.Array[AgnosticDataRouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertRoutesToDataRoutes")(routes.asInstanceOf[js.Any], mapRouteProperties.asInstanceOf[js.Any])).asInstanceOf[js.Array[AgnosticDataRouteObject]]
inline def convertRoutesToDataRoutes(
  routes: js.Array[AgnosticRouteObject],
  mapRouteProperties: MapRoutePropertiesFunction,
  parentPath: js.Array[Double]
): js.Array[AgnosticDataRouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertRoutesToDataRoutes")(routes.asInstanceOf[js.Any], mapRouteProperties.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[AgnosticDataRouteObject]]
inline def convertRoutesToDataRoutes(
  routes: js.Array[AgnosticRouteObject],
  mapRouteProperties: MapRoutePropertiesFunction,
  parentPath: js.Array[Double],
  manifest: RouteManifest
): js.Array[AgnosticDataRouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertRoutesToDataRoutes")(routes.asInstanceOf[js.Any], mapRouteProperties.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any], manifest.asInstanceOf[js.Any])).asInstanceOf[js.Array[AgnosticDataRouteObject]]
inline def convertRoutesToDataRoutes(
  routes: js.Array[AgnosticRouteObject],
  mapRouteProperties: MapRoutePropertiesFunction,
  parentPath: Unit,
  manifest: RouteManifest
): js.Array[AgnosticDataRouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertRoutesToDataRoutes")(routes.asInstanceOf[js.Any], mapRouteProperties.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any], manifest.asInstanceOf[js.Any])).asInstanceOf[js.Array[AgnosticDataRouteObject]]

inline def defer: DeferFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("defer").asInstanceOf[DeferFunction]

inline def generatePath[Path /* <: String */](originalPath: Path): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(originalPath.asInstanceOf[js.Any]).asInstanceOf[String]
inline def generatePath[Path /* <: String */](
  originalPath: Path,
  params: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in @remix-run/router.@remix-run/router/dist/utils.PathParam<Path> ]: string | null} */ js.Any
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(originalPath.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getPathContributingMatches[T /* <: AgnosticRouteMatch[String, AgnosticRouteObject] */](matches: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathContributingMatches")(matches.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]

inline def getToPathname(to: To): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToPathname")(to.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]

inline def immutableRouteKeys: Set[ImmutableRouteKey] = ^.asInstanceOf[js.Dynamic].selectDynamic("immutableRouteKeys").asInstanceOf[Set[ImmutableRouteKey]]

inline def isRouteErrorResponse(error: Any): /* is @remix-run/router.@remix-run/router/dist/utils.ErrorResponse */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRouteErrorResponse")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @remix-run/router.@remix-run/router/dist/utils.ErrorResponse */ Boolean]

inline def joinPaths(paths: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("joinPaths")(paths.asInstanceOf[js.Any]).asInstanceOf[String]

inline def json: JsonFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("json").asInstanceOf[JsonFunction]

inline def matchPath[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: Path, pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]
inline def matchPath[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: PathPattern[Path], pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]

inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: String, basename: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: PartialLocation): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: PartialLocation, basename: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]

inline def normalizeHash(hash: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHash")(hash.asInstanceOf[js.Any]).asInstanceOf[String]

inline def normalizePathname(pathname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePathname")(pathname.asInstanceOf[js.Any]).asInstanceOf[String]

inline def normalizeSearch(search: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSearch")(search.asInstanceOf[js.Any]).asInstanceOf[String]

inline def redirect: RedirectFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("redirect").asInstanceOf[RedirectFunction]

inline def resolvePath(to: To): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(to.asInstanceOf[js.Any]).asInstanceOf[Path]
inline def resolvePath(to: To, fromPathname: String): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(to.asInstanceOf[js.Any], fromPathname.asInstanceOf[js.Any])).asInstanceOf[Path]

inline def resolveTo(toArg: To, routePathnames: js.Array[String], locationPathname: String): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTo")(toArg.asInstanceOf[js.Any], routePathnames.asInstanceOf[js.Any], locationPathname.asInstanceOf[js.Any])).asInstanceOf[Path]
inline def resolveTo(toArg: To, routePathnames: js.Array[String], locationPathname: String, isPathRelative: Boolean): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTo")(toArg.asInstanceOf[js.Any], routePathnames.asInstanceOf[js.Any], locationPathname.asInstanceOf[js.Any], isPathRelative.asInstanceOf[js.Any])).asInstanceOf[Path]

inline def stripBasename(pathname: String, basename: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("stripBasename")(pathname.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[String | Null]

type ActionFunction = js.Function1[/* args */ ActionFunctionArgs, js.Promise[DataFunctionValue] | DataFunctionValue]

type ActionFunctionArgs = DataFunctionArgs

type AgnosticDataRouteMatch = AgnosticRouteMatch[String, AgnosticDataRouteObject]

/**
  * Loaders and actions can return anything except `undefined` (`null` is a
  * valid return value if there is no data to return).  Responses are preferred
  * and will ease any future migration to Remix
  */
type DataFunctionValue = Response | NonNullable[Any] | Null

type DeferFunction = js.Function2[
/* data */ Record[String, Any], 
/* init */ js.UndefOr[Double | ResponseInit], 
DeferredData]

type DetectErrorBoundaryFunction = js.Function1[/* route */ AgnosticRouteObject, Boolean]

type FormMethod = LowerCaseFormMethod

type HTMLFormMethod = LowerCaseFormMethod | UpperCaseFormMethod

type JsonFunction = js.Function2[/* data */ Any, /* init */ js.UndefOr[Double | ResponseInit], Response]

type LazyRouteFunction[R /* <: AgnosticRouteObject */] = js.Function0[js.Promise[Omit[R, ImmutableRouteKey]]]

type LoaderFunction = js.Function1[/* args */ LoaderFunctionArgs, js.Promise[DataFunctionValue] | DataFunctionValue]

type LoaderFunctionArgs = DataFunctionArgs

type MapRoutePropertiesFunction = js.Function1[/* route */ AgnosticRouteObject, HasErrorBoundary & (Record[String, Any])]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  [@remix-run/router.@remix-run/router/dist/utils.PathParam<Segment>] extends [never] ? string : @remix-run/router.@remix-run/router/dist/utils.PathParam<Segment>
  }}}
  */
type ParamParseKey[Segment /* <: String */] = String

/**
  * Examples:
  * "/a/b/ *" -> "*"
  * ":a" -> "a"
  * "/a/:b" -> "b"
  * "/a/blahblahblah:b" -> "b"
  * "/:a/:b" -> "a" | "b"
  * "/:a/b/:c/ *" -> "a" | "c" | "*"
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  Path extends '*' | '/ *' ? '*' : Path extends / * template literal string: ${inferRest}/ * * / string ? '*' | @remix-run/router.@remix-run/router/dist/utils._PathParam</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any> : @remix-run/router.@remix-run/router/dist/utils._PathParam<Path>
  }}}
  */
type PathParam[Path /* <: String */] = Asterisk

type RedirectFunction = js.Function2[/* url */ String, /* init */ js.UndefOr[Double | ResponseInit], Response]

type RouteData = StringDictionary[Any]

type RouteManifest = Record[String, js.UndefOr[AgnosticDataRouteObject]]

type ShouldRevalidateFunction = js.Function1[/* args */ ActionResult, Boolean]

type UpperCaseFormMethod = Uppercase[LowerCaseFormMethod]

type V7FormMethod = UpperCaseFormMethod

type V7MutationFormMethod = Exclude[V7FormMethod, GET]
