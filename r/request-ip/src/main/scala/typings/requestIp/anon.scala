package typings.requestIp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RemoteAddress extends StObject {
    
    var remoteAddress: js.UndefOr[String] = js.undefined
  }
  object RemoteAddress {
    
    inline def apply(): RemoteAddress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoteAddress]
    }
    
    extension [Self <: RemoteAddress](x: Self) {
      
      inline def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddressUndefined: Self = StObject.set(x, "remoteAddress", js.undefined)
    }
  }
  
  trait Socket extends StObject {
    
    var remoteAddress: js.UndefOr[String] = js.undefined
    
    var socket: js.UndefOr[RemoteAddress] = js.undefined
  }
  object Socket {
    
    inline def apply(): Socket = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Socket]
    }
    
    extension [Self <: Socket](x: Self) {
      
      inline def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddressUndefined: Self = StObject.set(x, "remoteAddress", js.undefined)
      
      inline def setSocket(value: RemoteAddress): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    }
  }
}
