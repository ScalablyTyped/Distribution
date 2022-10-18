package typings.reactRouter

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactRouter.anon.Data
import typings.reactRouter.anon.Error
import typings.reactRouter.anon.Location
import typings.reactRouter.anon.PartialLocation
import typings.reactRouter.anon.Relative
import typings.reactRouter.anon.Revalidate
import typings.reactRouter.distLibContextMod.NavigateOptions
import typings.reactRouter.distLibContextMod.RouteMatch
import typings.reactRouter.distLibContextMod.RouteObject
import typings.remixRunRouter.distHistoryMod.Action
import typings.remixRunRouter.distHistoryMod.Path
import typings.remixRunRouter.distHistoryMod.To
import typings.remixRunRouter.distRouterMod.Navigation
import typings.remixRunRouter.distUtilsMod.ParamParseKey
import typings.remixRunRouter.distUtilsMod.PathMatch
import typings.remixRunRouter.distUtilsMod.PathPattern
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibHooksMod {
  
  @JSImport("react-router/dist/lib/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-router/dist/lib/hooks", "RenderErrorBoundary")
  @js.native
  open class RenderErrorBoundary protected () extends Component[RenderErrorBoundaryProps, RenderErrorBoundaryState, Any] {
    def this(props: RenderErrorBoundaryProps) = this()
    
    @JSName("componentDidCatch")
    def componentDidCatch_MRenderErrorBoundary(error: Any, errorInfo: Any): Unit = js.native
  }
  /* static members */
  object RenderErrorBoundary {
    
    @JSImport("react-router/dist/lib/hooks", "RenderErrorBoundary")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromError(error: Any): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromError")(error.asInstanceOf[js.Any]).asInstanceOf[Error]
    
    inline def getDerivedStateFromProps(props: RenderErrorBoundaryProps, state: RenderErrorBoundaryState): Location = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Location]
  }
  
  inline def renderMatches(): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("_renderMatches")().asInstanceOf[ReactElement | Null]
  inline def renderMatches(matches: js.Array[RouteMatch[String, RouteObject]]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("_renderMatches")(matches.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def renderMatches(
    matches: js.Array[RouteMatch[String, RouteObject]],
    parentMatches: js.Array[RouteMatch[String, RouteObject]]
  ): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_renderMatches")(matches.asInstanceOf[js.Any], parentMatches.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  inline def renderMatches(matches: Null, parentMatches: js.Array[RouteMatch[String, RouteObject]]): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_renderMatches")(matches.asInstanceOf[js.Any], parentMatches.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  inline def renderMatches_state(
    matches: js.Array[RouteMatch[String, RouteObject]],
    parentMatches: js.Array[RouteMatch[String, RouteObject]],
    dataRouterState: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/router.Router['state'] */ js.Any
  ): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_renderMatches")(matches.asInstanceOf[js.Any], parentMatches.asInstanceOf[js.Any], dataRouterState.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  inline def renderMatches_state(
    matches: js.Array[RouteMatch[String, RouteObject]],
    parentMatches: Unit,
    dataRouterState: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/router.Router['state'] */ js.Any
  ): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_renderMatches")(matches.asInstanceOf[js.Any], parentMatches.asInstanceOf[js.Any], dataRouterState.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  inline def renderMatches_state(
    matches: Null,
    parentMatches: js.Array[RouteMatch[String, RouteObject]],
    dataRouterState: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/router.Router['state'] */ js.Any
  ): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_renderMatches")(matches.asInstanceOf[js.Any], parentMatches.asInstanceOf[js.Any], dataRouterState.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  inline def renderMatches_state(
    matches: Null,
    parentMatches: Unit,
    dataRouterState: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/router.Router['state'] */ js.Any
  ): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_renderMatches")(matches.asInstanceOf[js.Any], parentMatches.asInstanceOf[js.Any], dataRouterState.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  inline def useActionData(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useActionData")().asInstanceOf[Any]
  
  inline def useAsyncError(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncError")().asInstanceOf[Any]
  
  inline def useAsyncValue(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncValue")().asInstanceOf[Any]
  
  inline def useHref(to: To): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useHref")(to.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def useHref(to: To, hasRelative: Relative): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useHref")(to.asInstanceOf[js.Any], hasRelative.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useInRouterContext(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useInRouterContext")().asInstanceOf[Boolean]
  
  inline def useLoaderData(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useLoaderData")().asInstanceOf[Any]
  
  inline def useLocation(): typings.remixRunRouter.distHistoryMod.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[typings.remixRunRouter.distHistoryMod.Location]
  
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
  inline def useResolvedPath(to: To, hasRelative: Relative): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("useResolvedPath")(to.asInstanceOf[js.Any], hasRelative.asInstanceOf[js.Any])).asInstanceOf[Path]
  
  inline def useRevalidator(): Revalidate = ^.asInstanceOf[js.Dynamic].applyDynamic("useRevalidator")().asInstanceOf[Revalidate]
  
  inline def useRouteError(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteError")().asInstanceOf[Any]
  
  inline def useRouteLoaderData(routeId: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteLoaderData")(routeId.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useRoutes(routes: js.Array[RouteObject]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def useRoutes(routes: js.Array[RouteObject], locationArg: String): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  inline def useRoutes(routes: js.Array[RouteObject], locationArg: PartialLocation): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @js.native
  trait NavigateFunction extends StObject {
    
    def apply(delta: Double): Unit = js.native
    def apply(to: To): Unit = js.native
    def apply(to: To, options: NavigateOptions): Unit = js.native
  }
  
  /* Inlined react.react.PropsWithChildren<{  location :@remix-run/router.@remix-run/router.Location,   error :any,   component :react.react.ReactNode}> */
  trait RenderErrorBoundaryProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var component: ReactNode
    
    var error: Any
    
    var location: typings.remixRunRouter.distHistoryMod.Location
  }
  object RenderErrorBoundaryProps {
    
    inline def apply(error: Any, location: typings.remixRunRouter.distHistoryMod.Location): RenderErrorBoundaryProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderErrorBoundaryProps]
    }
    
    extension [Self <: RenderErrorBoundaryProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponent(value: ReactNode): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: typings.remixRunRouter.distHistoryMod.Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenderErrorBoundaryState extends StObject {
    
    var error: Any
    
    var location: typings.remixRunRouter.distHistoryMod.Location
  }
  object RenderErrorBoundaryState {
    
    inline def apply(error: Any, location: typings.remixRunRouter.distHistoryMod.Location): RenderErrorBoundaryState = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderErrorBoundaryState]
    }
    
    extension [Self <: RenderErrorBoundaryState](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: typings.remixRunRouter.distHistoryMod.Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
}
