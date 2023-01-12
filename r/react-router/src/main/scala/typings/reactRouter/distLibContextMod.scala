package typings.reactRouter

import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactRouter.anon.Children
import typings.reactRouter.reactRouterBooleans.`false`
import typings.reactRouter.reactRouterBooleans.`true`
import typings.remixRunRouter.anon.ActionResult
import typings.remixRunRouter.distHistoryMod.Action
import typings.remixRunRouter.distHistoryMod.Location
import typings.remixRunRouter.distHistoryMod.To
import typings.remixRunRouter.distRouterMod.Router
import typings.remixRunRouter.distRouterMod.RouterState
import typings.remixRunRouter.distRouterMod.StaticHandlerContext
import typings.remixRunRouter.distUtilsMod.ActionFunction
import typings.remixRunRouter.distUtilsMod.ActionFunctionArgs
import typings.remixRunRouter.distUtilsMod.AgnosticRouteMatch
import typings.remixRunRouter.distUtilsMod.LoaderFunction
import typings.remixRunRouter.distUtilsMod.LoaderFunctionArgs
import typings.remixRunRouter.distUtilsMod.ShouldRevalidateFunction
import typings.remixRunRouter.distUtilsMod.TrackedPromise
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibContextMod {
  
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
  
  type DataRouteObject = RouteObject & Children
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataRouterContextObject] (val x: Self) extends AnyVal {
      
      inline def setRouter(value: Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
  
  trait IndexRouteObject
    extends StObject
       with RouteObject {
    
    var action: js.UndefOr[ActionFunction] = js.undefined
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var children: Unit
    
    var element: js.UndefOr[ReactNode | Null] = js.undefined
    
    var errorElement: js.UndefOr[ReactNode | Null] = js.undefined
    
    var handle: js.UndefOr[Any] = js.undefined
    
    var hasErrorBoundary: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var index: `true`
    
    var loader: js.UndefOr[LoaderFunction] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var shouldRevalidate: js.UndefOr[ShouldRevalidateFunction] = js.undefined
  }
  object IndexRouteObject {
    
    inline def apply(children: Unit): IndexRouteObject = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], index = true)
      __obj.asInstanceOf[IndexRouteObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndexRouteObject] (val x: Self) extends AnyVal {
      
      inline def setAction(value: /* args */ ActionFunctionArgs => (js.Promise[Any | Response]) | Response | Any): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setChildren(value: Unit): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setElement(value: ReactNode): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setErrorElement(value: ReactNode): Self = StObject.set(x, "errorElement", value.asInstanceOf[js.Any])
      
      inline def setErrorElementNull: Self = StObject.set(x, "errorElement", null)
      
      inline def setErrorElementUndefined: Self = StObject.set(x, "errorElement", js.undefined)
      
      inline def setHandle(value: Any): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setHasErrorBoundary(value: Boolean): Self = StObject.set(x, "hasErrorBoundary", value.asInstanceOf[js.Any])
      
      inline def setHasErrorBoundaryUndefined: Self = StObject.set(x, "hasErrorBoundary", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: `true`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLoader(value: /* args */ LoaderFunctionArgs => (js.Promise[Any | Response]) | Response | Any): Self = StObject.set(x, "loader", js.Any.fromFunction1(value))
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setShouldRevalidate(value: /* args */ ActionResult => Boolean): Self = StObject.set(x, "shouldRevalidate", js.Any.fromFunction1(value))
      
      inline def setShouldRevalidateUndefined: Self = StObject.set(x, "shouldRevalidate", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocationContextObject] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigateOptions] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationContextObject] (val x: Self) extends AnyVal {
      
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
  
  trait NonIndexRouteObject
    extends StObject
       with RouteObject {
    
    var action: js.UndefOr[ActionFunction] = js.undefined
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[js.Array[RouteObject]] = js.undefined
    
    var element: js.UndefOr[ReactNode | Null] = js.undefined
    
    var errorElement: js.UndefOr[ReactNode | Null] = js.undefined
    
    var handle: js.UndefOr[Any] = js.undefined
    
    var hasErrorBoundary: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var index: js.UndefOr[`false`] = js.undefined
    
    var loader: js.UndefOr[LoaderFunction] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var shouldRevalidate: js.UndefOr[ShouldRevalidateFunction] = js.undefined
  }
  object NonIndexRouteObject {
    
    inline def apply(): NonIndexRouteObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NonIndexRouteObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NonIndexRouteObject] (val x: Self) extends AnyVal {
      
      inline def setAction(value: /* args */ ActionFunctionArgs => (js.Promise[Any | Response]) | Response | Any): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setChildren(value: js.Array[RouteObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: RouteObject*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setElement(value: ReactNode): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setErrorElement(value: ReactNode): Self = StObject.set(x, "errorElement", value.asInstanceOf[js.Any])
      
      inline def setErrorElementNull: Self = StObject.set(x, "errorElement", null)
      
      inline def setErrorElementUndefined: Self = StObject.set(x, "errorElement", js.undefined)
      
      inline def setHandle(value: Any): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setHasErrorBoundary(value: Boolean): Self = StObject.set(x, "hasErrorBoundary", value.asInstanceOf[js.Any])
      
      inline def setHasErrorBoundaryUndefined: Self = StObject.set(x, "hasErrorBoundary", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: `false`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setLoader(value: /* args */ LoaderFunctionArgs => (js.Promise[Any | Response]) | Response | Any): Self = StObject.set(x, "loader", js.Any.fromFunction1(value))
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setShouldRevalidate(value: /* args */ ActionResult => Boolean): Self = StObject.set(x, "shouldRevalidate", js.Any.fromFunction1(value))
      
      inline def setShouldRevalidateUndefined: Self = StObject.set(x, "shouldRevalidate", js.undefined)
    }
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteContextObject] (val x: Self) extends AnyVal {
      
      inline def setMatches(value: js.Array[RouteMatch[String, RouteObject]]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesVarargs(value: (RouteMatch[String, RouteObject])*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setOutlet(value: ReactElement): Self = StObject.set(x, "outlet", value.asInstanceOf[js.Any])
      
      inline def setOutletNull: Self = StObject.set(x, "outlet", null)
    }
  }
  
  type RouteMatch[ParamKey /* <: String */, RouteObjectType /* <: RouteObject */] = AgnosticRouteMatch[ParamKey, RouteObjectType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactRouter.distLibContextMod.IndexRouteObject
    - typings.reactRouter.distLibContextMod.NonIndexRouteObject
  */
  trait RouteObject extends StObject
  object RouteObject {
    
    inline def IndexRouteObject(children: Unit): typings.reactRouter.distLibContextMod.IndexRouteObject = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], index = true)
      __obj.asInstanceOf[typings.reactRouter.distLibContextMod.IndexRouteObject]
    }
    
    inline def NonIndexRouteObject(): typings.reactRouter.distLibContextMod.NonIndexRouteObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactRouter.distLibContextMod.NonIndexRouteObject]
    }
  }
}
