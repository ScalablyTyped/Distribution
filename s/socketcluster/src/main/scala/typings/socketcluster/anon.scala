package typings.socketcluster

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ClientCount extends StObject {
    
    var clientCount: js.Any = js.native
    
    var httpRPM: Double = js.native
    
    var wsRPM: Double = js.native
  }
  object ClientCount {
    
    @scala.inline
    def apply(clientCount: js.Any, httpRPM: Double, wsRPM: Double): ClientCount = {
      val __obj = js.Dynamic.literal(clientCount = clientCount.asInstanceOf[js.Any], httpRPM = httpRPM.asInstanceOf[js.Any], wsRPM = wsRPM.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientCount]
    }
    
    @scala.inline
    implicit class ClientCountMutableBuilder[Self <: ClientCount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientCount(value: js.Any): Self = StObject.set(x, "clientCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpRPM(value: Double): Self = StObject.set(x, "httpRPM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsRPM(value: Double): Self = StObject.set(x, "wsRPM", value.asInstanceOf[js.Any])
    }
  }
}
