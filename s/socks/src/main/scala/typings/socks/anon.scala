package typings.socks

import typings.socks.constantsMod.SocksProxyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Host extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var ipaddress: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var port: Double
    
    var `type`: SocksProxyType
    
    var userId: js.UndefOr[String] = js.undefined
  }
  object Host {
    
    inline def apply(port: Double, `type`: SocksProxyType): Host = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    extension [Self <: Host](x: Self) {
      
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
