package typings.socketcluster

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClientCount extends StObject {
    
    var clientCount: Any
    
    var httpRPM: Double
    
    var wsRPM: Double
  }
  object ClientCount {
    
    inline def apply(clientCount: Any, httpRPM: Double, wsRPM: Double): ClientCount = {
      val __obj = js.Dynamic.literal(clientCount = clientCount.asInstanceOf[js.Any], httpRPM = httpRPM.asInstanceOf[js.Any], wsRPM = wsRPM.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientCount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientCount] (val x: Self) extends AnyVal {
      
      inline def setClientCount(value: Any): Self = StObject.set(x, "clientCount", value.asInstanceOf[js.Any])
      
      inline def setHttpRPM(value: Double): Self = StObject.set(x, "httpRPM", value.asInstanceOf[js.Any])
      
      inline def setWsRPM(value: Double): Self = StObject.set(x, "wsRPM", value.asInstanceOf[js.Any])
    }
  }
}
