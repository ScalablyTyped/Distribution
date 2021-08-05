package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TcpipForwardGlobalRequest
  extends StObject
     with _GlobalRequest {
  
  /**
    * The IP address to start/stop binding to.
    */
  var bindAddr: String
  
  /**
    * The port to start/stop binding to.
    */
  var bindPort: Double
}
object TcpipForwardGlobalRequest {
  
  inline def apply(bindAddr: String, bindPort: Double): TcpipForwardGlobalRequest = {
    val __obj = js.Dynamic.literal(bindAddr = bindAddr.asInstanceOf[js.Any], bindPort = bindPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpipForwardGlobalRequest]
  }
  
  extension [Self <: TcpipForwardGlobalRequest](x: Self) {
    
    inline def setBindAddr(value: String): Self = StObject.set(x, "bindAddr", value.asInstanceOf[js.Any])
    
    inline def setBindPort(value: Double): Self = StObject.set(x, "bindPort", value.asInstanceOf[js.Any])
  }
}
