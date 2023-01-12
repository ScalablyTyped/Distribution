package typings.reactRouterGuard

import typings.history.mod.History
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.LazyExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.reactRouter.distLibComponentsMod.RouteProps
import typings.reactRouter.distLibComponentsMod.RouterProps
import typings.reactRouterDom.mod.BrowserRouterProps
import typings.reactRouterDom.mod.LinkProps
import typings.reactRouterDom.mod.NavLinkProps
import typings.reactRouterGuard.anon.Default
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-router-guard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BrowserRouter(param0: BrowserRouterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BrowserRouter")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-router-guard", "Link")
  @js.native
  val Link: ForwardRefExoticComponent[LinkProps & RefAttributes[HTMLAnchorElement]] = js.native
  
  @JSImport("react-router-guard", "NavLink")
  @js.native
  val NavLink: ForwardRefExoticComponent[NavLinkProps & RefAttributes[HTMLAnchorElement]] = js.native
  
  inline def Route(_props: RouteProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(_props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def Router(param0: RouterProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  @JSImport("react-router-guard", "RouterGuard")
  @js.native
  open class RouterGuard[T] protected () extends Component[RouterGuardProps, Any, Any] {
    def this(props: RouterGuardProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RouterGuardProps, context: Any) = this()
  }
  
  @JSImport("react-router-guard", "history")
  @js.native
  val history: History = js.native
  
  inline def `lazy`[T /* <: ComponentType[Any] */](factory: js.Function0[js.Promise[Default[T]]]): LazyExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(factory.asInstanceOf[js.Any]).asInstanceOf[LazyExoticComponent[T]]
  
  trait RouterGuardConfigProps extends StObject {
    
    var canActivate: js.UndefOr[js.Array[js.Function0[js.Promise[Any]]]] = js.undefined
    
    var component: LazyExoticComponent[Any]
    
    var exact: js.UndefOr[Boolean] = js.undefined
    
    var path: String
    
    var redirect: js.UndefOr[String] = js.undefined
    
    var routes: js.UndefOr[js.Array[RouterGuardConfigProps]] = js.undefined
  }
  object RouterGuardConfigProps {
    
    inline def apply(component: LazyExoticComponent[Any], path: String): RouterGuardConfigProps = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterGuardConfigProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouterGuardConfigProps] (val x: Self) extends AnyVal {
      
      inline def setCanActivate(value: js.Array[js.Function0[js.Promise[Any]]]): Self = StObject.set(x, "canActivate", value.asInstanceOf[js.Any])
      
      inline def setCanActivateUndefined: Self = StObject.set(x, "canActivate", js.undefined)
      
      inline def setCanActivateVarargs(value: js.Function0[js.Promise[Any]]*): Self = StObject.set(x, "canActivate", js.Array(value*))
      
      inline def setComponent(value: LazyExoticComponent[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setRoutes(value: js.Array[RouterGuardConfigProps]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setRoutesVarargs(value: RouterGuardConfigProps*): Self = StObject.set(x, "routes", js.Array(value*))
    }
  }
  
  trait RouterGuardProps extends StObject {
    
    var config: js.Array[RouterGuardConfigProps]
    
    var history: js.UndefOr[History] = js.undefined
    
    var loading: js.UndefOr[Boolean | ReactElement] = js.undefined
  }
  object RouterGuardProps {
    
    inline def apply(config: js.Array[RouterGuardConfigProps]): RouterGuardProps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterGuardProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouterGuardProps] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: js.Array[RouterGuardConfigProps]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigVarargs(value: RouterGuardConfigProps*): Self = StObject.set(x, "config", js.Array(value*))
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setLoading(value: Boolean | ReactElement): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    }
  }
}
