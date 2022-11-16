package typings.remixRunRouter.distUtilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.remixRunRouter.anon.ActionResult
import typings.remixRunRouter.anon.PartialLocation
import typings.remixRunRouter.distHistoryMod.Path
import typings.remixRunRouter.distHistoryMod.To
import typings.remixRunRouter.distUtilsMod.^
import typings.remixRunRouter.remixRunRouterStrings.Asterisk
import typings.std.Record
import typings.std.Response
import typings.std.ResponseInit
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def convertRoutesToDataRoutes(routes: js.Array[AgnosticRouteObject]): js.Array[AgnosticDataRouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertRoutesToDataRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Array[AgnosticDataRouteObject]]
inline def convertRoutesToDataRoutes(routes: js.Array[AgnosticRouteObject], parentPath: js.Array[Double]): js.Array[AgnosticDataRouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertRoutesToDataRoutes")(routes.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[AgnosticDataRouteObject]]
inline def convertRoutesToDataRoutes(routes: js.Array[AgnosticRouteObject], parentPath: js.Array[Double], allIds: Set[String]): js.Array[AgnosticDataRouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertRoutesToDataRoutes")(routes.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any], allIds.asInstanceOf[js.Any])).asInstanceOf[js.Array[AgnosticDataRouteObject]]
inline def convertRoutesToDataRoutes(routes: js.Array[AgnosticRouteObject], parentPath: Unit, allIds: Set[String]): js.Array[AgnosticDataRouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertRoutesToDataRoutes")(routes.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any], allIds.asInstanceOf[js.Any])).asInstanceOf[js.Array[AgnosticDataRouteObject]]

inline def defer(data: Record[String, Any]): DeferredData = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(data.asInstanceOf[js.Any]).asInstanceOf[DeferredData]

inline def generatePath[Path /* <: String */](path: Path): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
inline def generatePath[Path /* <: String */](
  path: Path,
  params: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in @remix-run/router.@remix-run/router/dist/utils.PathParam<Path> ]: string} */ js.Any
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(path.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getToPathname(to: To): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToPathname")(to.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]

inline def invariant(value: Boolean): /* asserts value */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(value.asInstanceOf[js.Any]).asInstanceOf[/* asserts value */ Boolean]
inline def invariant(value: Boolean, message: String): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
inline def invariant[T](): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("invariant")().asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
inline def invariant[T](value: T): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(value.asInstanceOf[js.Any]).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
inline def invariant[T](value: T, message: String): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
inline def invariant[T](value: Null, message: String): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
inline def invariant[T](value: Unit, message: String): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]

inline def isRouteErrorResponse(e: Any): /* is @remix-run/router.@remix-run/router/dist/utils.ErrorResponse */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRouteErrorResponse")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @remix-run/router.@remix-run/router/dist/utils.ErrorResponse */ Boolean]

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

inline def warning(cond: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(cond.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]

type ActionFunction = js.Function1[/* args */ ActionFunctionArgs, (js.Promise[Any | Response]) | Response | Any]

type ActionFunctionArgs = DataFunctionArgs

type AgnosticDataRouteMatch = AgnosticRouteMatch[String, AgnosticDataRouteObject]

type JsonFunction = js.Function2[/* data */ Any, /* init */ js.UndefOr[Double | ResponseInit], Response]

type LoaderFunction = js.Function1[/* args */ LoaderFunctionArgs, (js.Promise[Any | Response]) | Response | Any]

type LoaderFunctionArgs = DataFunctionArgs

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
  Path extends '*' ? '*' : Path extends / * template literal string: ${inferRest}/ * * / string ? '*' | @remix-run/router.@remix-run/router/dist/utils._PathParam</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any> : @remix-run/router.@remix-run/router/dist/utils._PathParam<Path>
  }}}
  */
type PathParam[Path /* <: String */] = Asterisk

type RedirectFunction = js.Function2[/* url */ String, /* init */ js.UndefOr[Double | ResponseInit], Response]

type RouteData = StringDictionary[Any]

type ShouldRevalidateFunction = js.Function1[/* args */ ActionResult, Boolean]
