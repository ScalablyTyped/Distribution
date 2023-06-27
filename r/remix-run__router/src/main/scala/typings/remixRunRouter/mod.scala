package typings.remixRunRouter

import typings.remixRunRouter.anon.PartialLocation
import typings.remixRunRouter.anon.PartialPath
import typings.remixRunRouter.distHistoryMod.BrowserHistory
import typings.remixRunRouter.distHistoryMod.BrowserHistoryOptions
import typings.remixRunRouter.distHistoryMod.HashHistory
import typings.remixRunRouter.distHistoryMod.HashHistoryOptions
import typings.remixRunRouter.distHistoryMod.MemoryHistory
import typings.remixRunRouter.distHistoryMod.MemoryHistoryOptions
import typings.remixRunRouter.distHistoryMod.Path
import typings.remixRunRouter.distHistoryMod.To
import typings.remixRunRouter.distRouterMod.BlockerUnblocked
import typings.remixRunRouter.distRouterMod.CreateStaticHandlerOptions
import typings.remixRunRouter.distRouterMod.Router
import typings.remixRunRouter.distRouterMod.RouterInit
import typings.remixRunRouter.distRouterMod.StaticHandler
import typings.remixRunRouter.distRouterMod.StaticHandlerContext
import typings.remixRunRouter.distUtilsMod.AgnosticDataRouteObject
import typings.remixRunRouter.distUtilsMod.AgnosticRouteMatch
import typings.remixRunRouter.distUtilsMod.AgnosticRouteObject
import typings.remixRunRouter.distUtilsMod.DeferFunction
import typings.remixRunRouter.distUtilsMod.DeferredData
import typings.remixRunRouter.distUtilsMod.JsonFunction
import typings.remixRunRouter.distUtilsMod.MapRoutePropertiesFunction
import typings.remixRunRouter.distUtilsMod.ParamParseKey
import typings.remixRunRouter.distUtilsMod.PathMatch
import typings.remixRunRouter.distUtilsMod.PathPattern
import typings.remixRunRouter.distUtilsMod.RedirectFunction
import typings.remixRunRouter.distUtilsMod.RouteManifest
import typings.remixRunRouter.remixRunRouterStrings.idle
import typings.std.Record
import typings.std.ResponseInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@remix-run/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@remix-run/router", "AbortedDeferredError")
  @js.native
  open class AbortedDeferredError ()
    extends typings.remixRunRouter.distUtilsMod.AbortedDeferredError
  
  @JSImport("@remix-run/router", "Action")
  @js.native
  object Action extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.remixRunRouter.distHistoryMod.Action & String] = js.native
    
    /* "POP" */ val Pop: typings.remixRunRouter.distHistoryMod.Action.Pop & String = js.native
    
    /* "PUSH" */ val Push: typings.remixRunRouter.distHistoryMod.Action.Push & String = js.native
    
    /* "REPLACE" */ val Replace: typings.remixRunRouter.distHistoryMod.Action.Replace & String = js.native
  }
  
  @JSImport("@remix-run/router", "ErrorResponse")
  @js.native
  open class ErrorResponse protected ()
    extends typings.remixRunRouter.distUtilsMod.ErrorResponse {
    def this(status: Double, statusText: String, data: Any) = this()
    def this(status: Double, statusText: Unit, data: Any) = this()
    def this(status: Double, statusText: String, data: Any, internal: Boolean) = this()
    def this(status: Double, statusText: Unit, data: Any, internal: Boolean) = this()
  }
  
  @JSImport("@remix-run/router", "IDLE_BLOCKER")
  @js.native
  val IDLE_BLOCKER: BlockerUnblocked = js.native
  
  object IDLE_FETCHER {
    
    @JSImport("@remix-run/router", "IDLE_FETCHER")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@remix-run/router", "IDLE_FETCHER.data")
    @js.native
    def data: js.UndefOr[Any] = js.native
    inline def data_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_FETCHER.formAction")
    @js.native
    def formAction: /* undefined */ Any = js.native
    inline def formAction_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formAction")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_FETCHER.formData")
    @js.native
    def formData: /* undefined */ Any = js.native
    inline def formData_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formData")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_FETCHER.formEncType")
    @js.native
    def formEncType: /* undefined */ Any = js.native
    inline def formEncType_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formEncType")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_FETCHER.formMethod")
    @js.native
    def formMethod: /* undefined */ Any = js.native
    inline def formMethod_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_FETCHER. _hasFetcherDoneAnything ")
    @js.native
    def hasFetcherDoneAnything: js.UndefOr[Boolean] = js.native
    
    inline def hasFetcherDoneAnything_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(" _hasFetcherDoneAnything ")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_FETCHER.json")
    @js.native
    def json: /* undefined */ Any = js.native
    inline def json_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_FETCHER.state")
    @js.native
    def state: idle = js.native
    inline def state_=(x: idle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("state")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_FETCHER.text")
    @js.native
    def text: /* undefined */ Any = js.native
    inline def text_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
  }
  
  object IDLE_NAVIGATION {
    
    @JSImport("@remix-run/router", "IDLE_NAVIGATION")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@remix-run/router", "IDLE_NAVIGATION.formAction")
    @js.native
    def formAction: /* undefined */ Any = js.native
    inline def formAction_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formAction")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_NAVIGATION.formData")
    @js.native
    def formData: /* undefined */ Any = js.native
    inline def formData_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formData")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_NAVIGATION.formEncType")
    @js.native
    def formEncType: /* undefined */ Any = js.native
    inline def formEncType_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formEncType")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_NAVIGATION.formMethod")
    @js.native
    def formMethod: /* undefined */ Any = js.native
    inline def formMethod_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_NAVIGATION.json")
    @js.native
    def json: /* undefined */ Any = js.native
    inline def json_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_NAVIGATION.location")
    @js.native
    def location: /* undefined */ Any = js.native
    inline def location_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("location")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_NAVIGATION.state")
    @js.native
    def state: idle = js.native
    inline def state_=(x: idle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("state")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_NAVIGATION.text")
    @js.native
    def text: /* undefined */ Any = js.native
    inline def text_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
  }
  
  inline def UNSAFEConvertRoutesToDataRoutes(routes: js.Array[AgnosticRouteObject], mapRouteProperties: MapRoutePropertiesFunction): js.Array[AgnosticDataRouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_convertRoutesToDataRoutes")(routes.asInstanceOf[js.Any], mapRouteProperties.asInstanceOf[js.Any])).asInstanceOf[js.Array[AgnosticDataRouteObject]]
  inline def UNSAFEConvertRoutesToDataRoutes(
    routes: js.Array[AgnosticRouteObject],
    mapRouteProperties: MapRoutePropertiesFunction,
    parentPath: js.Array[Double]
  ): js.Array[AgnosticDataRouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_convertRoutesToDataRoutes")(routes.asInstanceOf[js.Any], mapRouteProperties.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[AgnosticDataRouteObject]]
  inline def UNSAFEConvertRoutesToDataRoutes(
    routes: js.Array[AgnosticRouteObject],
    mapRouteProperties: MapRoutePropertiesFunction,
    parentPath: js.Array[Double],
    manifest: RouteManifest
  ): js.Array[AgnosticDataRouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_convertRoutesToDataRoutes")(routes.asInstanceOf[js.Any], mapRouteProperties.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any], manifest.asInstanceOf[js.Any])).asInstanceOf[js.Array[AgnosticDataRouteObject]]
  inline def UNSAFEConvertRoutesToDataRoutes(
    routes: js.Array[AgnosticRouteObject],
    mapRouteProperties: MapRoutePropertiesFunction,
    parentPath: Unit,
    manifest: RouteManifest
  ): js.Array[AgnosticDataRouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_convertRoutesToDataRoutes")(routes.asInstanceOf[js.Any], mapRouteProperties.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any], manifest.asInstanceOf[js.Any])).asInstanceOf[js.Array[AgnosticDataRouteObject]]
  
  @JSImport("@remix-run/router", "UNSAFE_DeferredData")
  @js.native
  open class UNSAFEDeferredData protected () extends DeferredData {
    def this(data: Record[String, Any]) = this()
    def this(data: Record[String, Any], responseInit: ResponseInit) = this()
  }
  
  inline def UNSAFEGetPathContributingMatches[T /* <: AgnosticRouteMatch[String, AgnosticRouteObject] */](matches: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_getPathContributingMatches")(matches.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def UNSAFEInvariant(value: Boolean): /* asserts value */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_invariant")(value.asInstanceOf[js.Any]).asInstanceOf[/* asserts value */ Boolean]
  inline def UNSAFEInvariant(value: Boolean, message: String): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_invariant")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
  inline def UNSAFEInvariant[T](): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_invariant")().asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  inline def UNSAFEInvariant[T](value: T): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_invariant")(value.asInstanceOf[js.Any]).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  inline def UNSAFEInvariant[T](value: T, message: String): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_invariant")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  inline def UNSAFEInvariant[T](value: Null, message: String): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_invariant")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  inline def UNSAFEInvariant[T](value: Unit, message: String): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_invariant")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  
  inline def UNSAFEWarning(cond: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_warning")(cond.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@remix-run/router", "UNSAFE_DEFERRED_SYMBOL")
  @js.native
  val UNSAFE_DEFERRED_SYMBOL: js.Symbol = js.native
  
  inline def createBrowserHistory(): BrowserHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserHistory")().asInstanceOf[BrowserHistory]
  inline def createBrowserHistory(options: BrowserHistoryOptions): BrowserHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserHistory")(options.asInstanceOf[js.Any]).asInstanceOf[BrowserHistory]
  
  inline def createHashHistory(): HashHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashHistory")().asInstanceOf[HashHistory]
  inline def createHashHistory(options: HashHistoryOptions): HashHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashHistory")(options.asInstanceOf[js.Any]).asInstanceOf[HashHistory]
  
  inline def createMemoryHistory(): MemoryHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryHistory")().asInstanceOf[MemoryHistory]
  inline def createMemoryHistory(options: MemoryHistoryOptions): MemoryHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryHistory")(options.asInstanceOf[js.Any]).asInstanceOf[MemoryHistory]
  
  inline def createPath(param0: PartialPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createRouter(init: RouterInit): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(init.asInstanceOf[js.Any]).asInstanceOf[Router]
  
  inline def createStaticHandler(routes: js.Array[AgnosticRouteObject]): StaticHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("createStaticHandler")(routes.asInstanceOf[js.Any]).asInstanceOf[StaticHandler]
  inline def createStaticHandler(routes: js.Array[AgnosticRouteObject], opts: CreateStaticHandlerOptions): StaticHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("createStaticHandler")(routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[StaticHandler]
  
  @JSImport("@remix-run/router", "defer")
  @js.native
  val defer: DeferFunction = js.native
  
  inline def generatePath[Path /* <: String */](originalPath: Path): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(originalPath.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generatePath[Path /* <: String */](
    originalPath: Path,
    params: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in @remix-run/router.@remix-run/router/dist/utils.PathParam<Path> ]: string | null} */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(originalPath.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getStaticContextFromError(routes: js.Array[AgnosticDataRouteObject], context: StaticHandlerContext, error: Any): StaticHandlerContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getStaticContextFromError")(routes.asInstanceOf[js.Any], context.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[StaticHandlerContext]
  
  inline def getToPathname(to: To): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToPathname")(to.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def isDeferredData(value: Any): /* is @remix-run/router.@remix-run/router/dist/utils.DeferredData */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeferredData")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @remix-run/router.@remix-run/router/dist/utils.DeferredData */ Boolean]
  
  inline def isRouteErrorResponse(error: Any): /* is @remix-run/router.@remix-run/router/dist/utils.ErrorResponse */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRouteErrorResponse")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @remix-run/router.@remix-run/router/dist/utils.ErrorResponse */ Boolean]
  
  inline def joinPaths(paths: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("joinPaths")(paths.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@remix-run/router", "json")
  @js.native
  val json: JsonFunction = js.native
  
  inline def matchPath[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: Path, pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]
  inline def matchPath[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: PathPattern[Path], pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]
  
  inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
  inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: String, basename: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
  inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: PartialLocation): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
  inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: PartialLocation, basename: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
  
  inline def normalizePathname(pathname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePathname")(pathname.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parsePath(path: String): PartialPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[PartialPath]
  
  @JSImport("@remix-run/router", "redirect")
  @js.native
  val redirect: RedirectFunction = js.native
  
  inline def resolvePath(to: To): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(to.asInstanceOf[js.Any]).asInstanceOf[Path]
  inline def resolvePath(to: To, fromPathname: String): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(to.asInstanceOf[js.Any], fromPathname.asInstanceOf[js.Any])).asInstanceOf[Path]
  
  inline def resolveTo(toArg: To, routePathnames: js.Array[String], locationPathname: String): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTo")(toArg.asInstanceOf[js.Any], routePathnames.asInstanceOf[js.Any], locationPathname.asInstanceOf[js.Any])).asInstanceOf[Path]
  inline def resolveTo(toArg: To, routePathnames: js.Array[String], locationPathname: String, isPathRelative: Boolean): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTo")(toArg.asInstanceOf[js.Any], routePathnames.asInstanceOf[js.Any], locationPathname.asInstanceOf[js.Any], isPathRelative.asInstanceOf[js.Any])).asInstanceOf[Path]
  
  inline def stripBasename(pathname: String, basename: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("stripBasename")(pathname.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
