package typings.reactRouter

import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.remixRunRouter.historyMod.Action
import typings.remixRunRouter.historyMod.Location
import typings.remixRunRouter.historyMod.To
import typings.remixRunRouter.routerMod.Router
import typings.remixRunRouter.routerMod.RouterState
import typings.remixRunRouter.routerMod.StaticHandlerContext
import typings.remixRunRouter.utilsMod.AgnosticRouteMatch
import typings.remixRunRouter.utilsMod.AgnosticRouteObject
import typings.remixRunRouter.utilsMod.TrackedPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("react-router/dist/lib/context", "AwaitContext")
  @js.native
  val AwaitContext: Context[TrackedPromise | Null] = js.native
  
  @JSImport("react-router/dist/lib/context", "DataRouterContext")
  @js.native
  val DataRouterContext: Context[DataRouterContextObject | Null] = js.native
  
  @JSImport("react-router/dist/lib/context", "DataRouterStateContext")
  @js.native
  val DataRouterStateContext: Context[RouterState | Null] = js.native
  
  @JSImport("react-router/dist/lib/context", "DataStaticRouterContext")
  @js.native
  val DataStaticRouterContext: Context[StaticHandlerContext | Null] = js.native
  
  @JSImport("react-router/dist/lib/context", "LocationContext")
  @js.native
  val LocationContext: Context[LocationContextObject] = js.native
  
  @JSImport("react-router/dist/lib/context", "NavigationContext")
  @js.native
  val NavigationContext: Context[NavigationContextObject] = js.native
  
  @JSImport("react-router/dist/lib/context", "RouteContext")
  @js.native
  val RouteContext: Context[RouteContextObject] = js.native
  
  @JSImport("react-router/dist/lib/context", "RouteErrorContext")
  @js.native
  val RouteErrorContext: Context[Any] = js.native
  
  type DataRouteMatch = RouteMatch[String, DataRouteObject]
  
  trait DataRouteObject
    extends StObject
       with RouteObject {
    
    @JSName("children")
    var children_DataRouteObject: js.UndefOr[js.Array[DataRouteObject]] = js.undefined
    
    @JSName("id")
    var id_DataRouteObject: String
  }
  object DataRouteObject {
    
    inline def apply(id: String): DataRouteObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataRouteObject]
    }
    
    extension [Self <: DataRouteObject](x: Self) {
      
      inline def setChildren(value: js.Array[DataRouteObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: DataRouteObject*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataRouterContextObject
    extends StObject
       with NavigationContextObject {
    
    var router: Router
  }
  object DataRouterContextObject {
    
    inline def apply(basename: String, navigator: Navigator, router: Router, static: Boolean): DataRouterContextObject = {
      val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataRouterContextObject]
    }
    
    extension [Self <: DataRouterContextObject](x: Self) {
      
      inline def setRouter(value: Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocationContextObject extends StObject {
    
    var location: Location
    
    var navigationType: Action
  }
  object LocationContextObject {
    
    inline def apply(location: Location, navigationType: Action): LocationContextObject = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigationType = navigationType.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationContextObject]
    }
    
    extension [Self <: LocationContextObject](x: Self) {
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setNavigationType(value: Action): Self = StObject.set(x, "navigationType", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigateOptions extends StObject {
    
    var preventScrollReset: js.UndefOr[Boolean] = js.undefined
    
    var relative: js.UndefOr[RelativeRoutingType] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
  }
  object NavigateOptions {
    
    inline def apply(): NavigateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigateOptions]
    }
    
    extension [Self <: NavigateOptions](x: Self) {
      
      inline def setPreventScrollReset(value: Boolean): Self = StObject.set(x, "preventScrollReset", value.asInstanceOf[js.Any])
      
      inline def setPreventScrollResetUndefined: Self = StObject.set(x, "preventScrollReset", js.undefined)
      
      inline def setRelative(value: RelativeRoutingType): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait NavigationContextObject extends StObject {
    
    var basename: String
    
    var navigator: Navigator
    
    var static: Boolean
  }
  object NavigationContextObject {
    
    inline def apply(basename: String, navigator: Navigator, static: Boolean): NavigationContextObject = {
      val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationContextObject]
    }
    
    extension [Self <: NavigationContextObject](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setNavigator(value: Navigator): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
      
      inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Navigator extends StObject {
    
    var createHref: js.Function1[/* to */ To, String] = js.native
    
    var go: js.Function1[/* delta */ Double, Unit] = js.native
    
    def push(to: To): Unit = js.native
    def push(to: To, state: Any): Unit = js.native
    def push(to: To, state: Any, opts: NavigateOptions): Unit = js.native
    def push(to: To, state: Unit, opts: NavigateOptions): Unit = js.native
    
    def replace(to: To): Unit = js.native
    def replace(to: To, state: Any): Unit = js.native
    def replace(to: To, state: Any, opts: NavigateOptions): Unit = js.native
    def replace(to: To, state: Unit, opts: NavigateOptions): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactRouter.reactRouterStrings.route
    - typings.reactRouter.reactRouterStrings.path
  */
  trait RelativeRoutingType extends StObject
  object RelativeRoutingType {
    
    inline def path: typings.reactRouter.reactRouterStrings.path = "path".asInstanceOf[typings.reactRouter.reactRouterStrings.path]
    
    inline def route: typings.reactRouter.reactRouterStrings.route = "route".asInstanceOf[typings.reactRouter.reactRouterStrings.route]
  }
  
  trait RouteContextObject extends StObject {
    
    var matches: js.Array[RouteMatch[String, RouteObject]]
    
    var outlet: ReactElement | Null
  }
  object RouteContextObject {
    
    inline def apply(matches: js.Array[RouteMatch[String, RouteObject]]): RouteContextObject = {
      val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], outlet = null)
      __obj.asInstanceOf[RouteContextObject]
    }
    
    extension [Self <: RouteContextObject](x: Self) {
      
      inline def setMatches(value: js.Array[RouteMatch[String, RouteObject]]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesVarargs(value: (RouteMatch[String, RouteObject])*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setOutlet(value: ReactElement): Self = StObject.set(x, "outlet", value.asInstanceOf[js.Any])
      
      inline def setOutletNull: Self = StObject.set(x, "outlet", null)
    }
  }
  
  type RouteMatch[ParamKey /* <: String */, RouteObjectType /* <: RouteObject */] = AgnosticRouteMatch[ParamKey, RouteObjectType]
  
  trait RouteObject
    extends StObject
       with AgnosticRouteObject {
    
    @JSName("children")
    var children_RouteObject: js.UndefOr[js.Array[RouteObject]] = js.undefined
    
    var element: js.UndefOr[ReactNode | Null] = js.undefined
    
    var errorElement: js.UndefOr[ReactNode | Null] = js.undefined
  }
  object RouteObject {
    
    inline def apply(): RouteObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteObject]
    }
    
    extension [Self <: RouteObject](x: Self) {
      
      inline def setChildren(value: js.Array[RouteObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: RouteObject*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setElement(value: ReactNode): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setErrorElement(value: ReactNode): Self = StObject.set(x, "errorElement", value.asInstanceOf[js.Any])
      
      inline def setErrorElementNull: Self = StObject.set(x, "errorElement", null)
      
      inline def setErrorElementUndefined: Self = StObject.set(x, "errorElement", js.undefined)
    }
  }
}
