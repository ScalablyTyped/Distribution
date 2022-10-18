package typings.rest

import org.scalablytyped.runtime.Shortcut
import typings.rest.mod.Interceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interceptorOAuthMod extends Shortcut {
  
  @JSImport("rest/interceptor/oAuth", JSImport.Namespace)
  @js.native
  val ^ : Interceptor[Config] = js.native
  
  trait Config extends StObject {
    
    var authorizationUrl: js.UndefOr[String] = js.undefined
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var oAuthCallback: js.UndefOr[js.Function1[/* hash */ String, Unit]] = js.undefined
    
    var oAuthCallbackName: js.UndefOr[String] = js.undefined
    
    var redirectUrl: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var windowStrategy: js.UndefOr[js.Function1[/* url */ String, DismissWindow]] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationUrlUndefined: Self = StObject.set(x, "authorizationUrl", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setOAuthCallback(value: /* hash */ String => Unit): Self = StObject.set(x, "oAuthCallback", js.Any.fromFunction1(value))
      
      inline def setOAuthCallbackName(value: String): Self = StObject.set(x, "oAuthCallbackName", value.asInstanceOf[js.Any])
      
      inline def setOAuthCallbackNameUndefined: Self = StObject.set(x, "oAuthCallbackName", js.undefined)
      
      inline def setOAuthCallbackUndefined: Self = StObject.set(x, "oAuthCallback", js.undefined)
      
      inline def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
      
      inline def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setWindowStrategy(value: /* url */ String => DismissWindow): Self = StObject.set(x, "windowStrategy", js.Any.fromFunction1(value))
      
      inline def setWindowStrategyUndefined: Self = StObject.set(x, "windowStrategy", js.undefined)
    }
  }
  
  type DismissWindow = js.Function0[Unit]
  
  type _To = Interceptor[Config]
  
  /* This means you don't have to write `^`, but can instead just say `interceptorOAuthMod.foo` */
  override def _to: Interceptor[Config] = ^
}
