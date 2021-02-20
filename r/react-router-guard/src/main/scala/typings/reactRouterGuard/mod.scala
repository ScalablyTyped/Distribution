package typings.reactRouterGuard

import typings.history.mod.History
import typings.history.mod.LocationState
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.LazyExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactRouter.mod.RedirectProps
import typings.reactRouter.mod.RouteProps
import typings.reactRouter.mod.RouterProps
import typings.reactRouter.mod.SwitchProps
import typings.reactRouterDom.anon.ReadonlyRouterProps
import typings.reactRouterDom.anon.ReadonlySwitchProps
import typings.reactRouterDom.mod.BrowserRouterProps
import typings.reactRouterDom.mod.NavLinkProps
import typings.reactRouterGuard.anon.Default
import typings.reactRouterGuard.anon.ReadonlyBrowserRouterProp
import typings.reactRouterGuard.anon.ReadonlyRedirectProps
import typings.std.HTMLAnchorElement
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-router-guard", "BrowserRouter")
  @js.native
  class BrowserRouter protected ()
    extends typings.reactRouterDom.mod.BrowserRouter {
    def this(props: BrowserRouterProps) = this()
    def this(props: ReadonlyBrowserRouterProp) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BrowserRouterProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-guard", "Link")
  @js.native
  def Link[S](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<Link<S>> is not an array type */ params: Parameters[typings.reactRouterDom.mod.Link[S]]
  ): ReturnType[typings.reactRouterDom.mod.Link[S]] = js.native
  
  @JSImport("react-router-guard", "NavLink")
  @js.native
  def NavLink[S](
    // TODO: Define this as ...params: Parameters<NavLink<S>> when only TypeScript >= 3.1 support is needed.
  props: PropsWithoutRef[NavLinkProps[S]] with RefAttributes[HTMLAnchorElement]
  ): ReturnType[typings.reactRouterDom.mod.NavLink[S]] = js.native
  
  @JSImport("react-router-guard", "Redirect")
  @js.native
  class Redirect protected ()
    extends typings.reactRouter.mod.Redirect {
    def this(props: RedirectProps) = this()
    def this(props: ReadonlyRedirectProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RedirectProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-guard", "Route")
  @js.native
  class Route[T /* <: RouteProps */] protected ()
    extends typings.reactRouterDom.mod.Route[T] {
    def this(props: T) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: T, context: js.Any) = this()
  }
  
  @JSImport("react-router-guard", "Router")
  @js.native
  class Router protected ()
    extends typings.reactRouterDom.mod.Router {
    def this(props: RouterProps) = this()
    def this(props: ReadonlyRouterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RouterProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-guard", "RouterGuard")
  @js.native
  class RouterGuard[T] protected ()
    extends Component[RouterGuardProps, js.Any, js.Any] {
    def this(props: RouterGuardProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RouterGuardProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-guard", "Switch")
  @js.native
  class Switch protected ()
    extends typings.reactRouterDom.mod.Switch {
    def this(props: SwitchProps) = this()
    def this(props: ReadonlySwitchProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SwitchProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-guard", "history")
  @js.native
  val history: History[LocationState] = js.native
  
  @js.native
  trait RouterGuardConfigProps extends StObject {
    
    var canActivate: js.UndefOr[js.Array[js.Function0[js.Promise[_]]]] = js.native
    
    var component: LazyExoticComponent[_] = js.native
    
    var exact: js.UndefOr[Boolean] = js.native
    
    var path: String = js.native
    
    var redirect: js.UndefOr[String] = js.native
    
    var routes: js.UndefOr[js.Array[RouterGuardConfigProps]] = js.native
  }
  object RouterGuardConfigProps {
    
    @scala.inline
    def apply(component: LazyExoticComponent[_], path: String): RouterGuardConfigProps = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterGuardConfigProps]
    }
    
    @scala.inline
    implicit class RouterGuardConfigPropsMutableBuilder[Self <: RouterGuardConfigProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanActivate(value: js.Array[js.Function0[js.Promise[_]]]): Self = StObject.set(x, "canActivate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanActivateUndefined: Self = StObject.set(x, "canActivate", js.undefined)
      
      @scala.inline
      def setCanActivateVarargs(value: js.Function0[js.Promise[js.Any]]*): Self = StObject.set(x, "canActivate", js.Array(value :_*))
      
      @scala.inline
      def setComponent(value: LazyExoticComponent[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setRoutes(value: js.Array[RouterGuardConfigProps]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      @scala.inline
      def setRoutesVarargs(value: RouterGuardConfigProps*): Self = StObject.set(x, "routes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RouterGuardProps extends StObject {
    
    var config: js.Array[RouterGuardConfigProps] = js.native
    
    var history: js.UndefOr[History[LocationState]] = js.native
    
    var loading: js.UndefOr[Boolean | ReactElement] = js.native
  }
  object RouterGuardProps {
    
    @scala.inline
    def apply(config: js.Array[RouterGuardConfigProps]): RouterGuardProps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterGuardProps]
    }
    
    @scala.inline
    implicit class RouterGuardPropsMutableBuilder[Self <: RouterGuardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: js.Array[RouterGuardConfigProps]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigVarargs(value: RouterGuardConfigProps*): Self = StObject.set(x, "config", js.Array(value :_*))
      
      @scala.inline
      def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean | ReactElement): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    }
  }
  
  @JSImport("react-router-guard", "lazy")
  @js.native
  def `lazy`[T /* <: ComponentType[_] */](factory: js.Function0[js.Promise[Default[T]]]): LazyExoticComponent[T] = js.native
}
