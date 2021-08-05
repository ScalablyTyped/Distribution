package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardedTcpip extends StObject {
  
  var bindAddr: String
  
  var bindPort: Double
  
  var remoteAddr: String
  
  var remotePort: Double
}
object ForwardedTcpip {
  
  inline def apply(bindAddr: String, bindPort: Double, remoteAddr: String, remotePort: Double): ForwardedTcpip = {
    val __obj = js.Dynamic.literal(bindAddr = bindAddr.asInstanceOf[js.Any], bindPort = bindPort.asInstanceOf[js.Any], remoteAddr = remoteAddr.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardedTcpip]
  }
  
  extension [Self <: ForwardedTcpip](x: Self) {
    
    inline def setBindAddr(value: String): Self = StObject.set(x, "bindAddr", value.asInstanceOf[js.Any])
    
    inline def setBindPort(value: Double): Self = StObject.set(x, "bindPort", value.asInstanceOf[js.Any])
    
    inline def setRemoteAddr(value: String): Self = StObject.set(x, "remoteAddr", value.asInstanceOf[js.Any])
    
    inline def setRemotePort(value: Double): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
  }
}
