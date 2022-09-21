package typings.socks

import typings.node.bufferMod.global.Buffer
import typings.socks.constantsMod.SocksProxyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Customauthmethod extends StObject {
    
    var custom_auth_method: js.UndefOr[Double] = js.undefined
    
    var custom_auth_request_handler: js.UndefOr[js.Function0[js.Promise[Buffer]]] = js.undefined
    
    var custom_auth_response_handler: js.UndefOr[js.Function1[/* data */ Buffer, js.Promise[Boolean]]] = js.undefined
    
    var custom_auth_response_size: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var ipaddress: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var port: Double
    
    var `type`: SocksProxyType
    
    var userId: js.UndefOr[String] = js.undefined
  }
  object Customauthmethod {
    
    inline def apply(port: Double, `type`: SocksProxyType): Customauthmethod = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Customauthmethod]
    }
    
    extension [Self <: Customauthmethod](x: Self) {
      
      inline def setCustom_auth_method(value: Double): Self = StObject.set(x, "custom_auth_method", value.asInstanceOf[js.Any])
      
      inline def setCustom_auth_methodUndefined: Self = StObject.set(x, "custom_auth_method", js.undefined)
      
      inline def setCustom_auth_request_handler(value: () => js.Promise[Buffer]): Self = StObject.set(x, "custom_auth_request_handler", js.Any.fromFunction0(value))
      
      inline def setCustom_auth_request_handlerUndefined: Self = StObject.set(x, "custom_auth_request_handler", js.undefined)
      
      inline def setCustom_auth_response_handler(value: /* data */ Buffer => js.Promise[Boolean]): Self = StObject.set(x, "custom_auth_response_handler", js.Any.fromFunction1(value))
      
      inline def setCustom_auth_response_handlerUndefined: Self = StObject.set(x, "custom_auth_response_handler", js.undefined)
      
      inline def setCustom_auth_response_size(value: Double): Self = StObject.set(x, "custom_auth_response_size", value.asInstanceOf[js.Any])
      
      inline def setCustom_auth_response_sizeUndefined: Self = StObject.set(x, "custom_auth_response_size", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIpaddress(value: String): Self = StObject.set(x, "ipaddress", value.asInstanceOf[js.Any])
      
      inline def setIpaddressUndefined: Self = StObject.set(x, "ipaddress", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setType(value: SocksProxyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
}
