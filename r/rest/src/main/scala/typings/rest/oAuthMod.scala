package typings.rest

import org.scalablytyped.runtime.Shortcut
import typings.rest.mod.Interceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oAuthMod extends Shortcut {
  
  @JSImport("rest/interceptor/oAuth", JSImport.Namespace)
  @js.native
  val ^ : Interceptor[Config] = js.native
  
  @js.native
  trait Config extends StObject {
    
    var authorizationUrl: js.UndefOr[String] = js.native
    
    var clientId: js.UndefOr[String] = js.native
    
    var oAuthCallback: js.UndefOr[js.Function1[/* hash */ String, Unit]] = js.native
    
    var oAuthCallbackName: js.UndefOr[String] = js.native
    
    var redirectUrl: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[String] = js.native
    
    var token: js.UndefOr[String] = js.native
    
    var windowStrategy: js.UndefOr[js.Function1[/* url */ String, DismissWindow]] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationUrlUndefined: Self = StObject.set(x, "authorizationUrl", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setOAuthCallback(value: /* hash */ String => Unit): Self = StObject.set(x, "oAuthCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOAuthCallbackName(value: String): Self = StObject.set(x, "oAuthCallbackName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAuthCallbackNameUndefined: Self = StObject.set(x, "oAuthCallbackName", js.undefined)
      
      @scala.inline
      def setOAuthCallbackUndefined: Self = StObject.set(x, "oAuthCallback", js.undefined)
      
      @scala.inline
      def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      @scala.inline
      def setWindowStrategy(value: /* url */ String => DismissWindow): Self = StObject.set(x, "windowStrategy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWindowStrategyUndefined: Self = StObject.set(x, "windowStrategy", js.undefined)
    }
  }
  
  type DismissWindow = js.Function0[Unit]
  
  type _To = Interceptor[Config]
  
  /* This means you don't have to write `^`, but can instead just say `oAuthMod.foo` */
  override def _to: Interceptor[Config] = ^
}
