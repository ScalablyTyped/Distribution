package typings.reactRouterDom

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactRouter.distLibContextMod.RouteObject
import typings.reactRouterDom.anon.PartialLocation
import typings.remixRunRouter.distRouterMod.Router
import typings.remixRunRouter.distRouterMod.StaticHandler
import typings.remixRunRouter.distRouterMod.StaticHandlerContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerMod {
  
  @JSImport("react-router-dom/dist/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def StaticRouter(param0: StaticRouterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StaticRouter")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def StaticRouterProvider(param0: StaticRouterProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StaticRouterProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createStaticHandler(routes: js.Array[RouteObject]): StaticHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("createStaticHandler")(routes.asInstanceOf[js.Any]).asInstanceOf[StaticHandler]
  inline def createStaticHandler(routes: js.Array[RouteObject], opts: CreateStaticHandlerOptions): StaticHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("createStaticHandler")(routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[StaticHandler]
  
  inline def createStaticRouter(routes: js.Array[RouteObject], context: StaticHandlerContext): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("createStaticRouter")(routes.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Router]
  
  /* Inlined std.Omit<@remix-run/router.@remix-run/router.CreateStaticHandlerOptions, 'detectErrorBoundary' | 'mapRouteProperties'> */
  trait CreateStaticHandlerOptions extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
  }
  object CreateStaticHandlerOptions {
    
    inline def apply(): CreateStaticHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateStaticHandlerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateStaticHandlerOptions] (val x: Self) extends AnyVal {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
    }
  }
  
  trait StaticRouterProps extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var location: PartialLocation | String
  }
  object StaticRouterProps {
    
    inline def apply(location: PartialLocation | String): StaticRouterProps = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticRouterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StaticRouterProps] (val x: Self) extends AnyVal {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLocation(value: PartialLocation | String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait StaticRouterProviderProps extends StObject {
    
    var context: StaticHandlerContext
    
    var hydrate: js.UndefOr[Boolean] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var router: Router
  }
  object StaticRouterProviderProps {
    
    inline def apply(context: StaticHandlerContext, router: Router): StaticRouterProviderProps = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticRouterProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StaticRouterProviderProps] (val x: Self) extends AnyVal {
      
      inline def setContext(value: StaticHandlerContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setHydrate(value: Boolean): Self = StObject.set(x, "hydrate", value.asInstanceOf[js.Any])
      
      inline def setHydrateUndefined: Self = StObject.set(x, "hydrate", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setRouter(value: Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
}
