package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TcpipRequestInfo extends StObject {
  
  /** Destination IP address of outgoing connection. */
  var destIP: String
  
  /** Destination port of outgoing connection. */
  var destPort: Double
  
  /** Source IP address of outgoing connection. */
  var srcIP: String
  
  /** Source port of outgoing connection. */
  var srcPort: Double
}
object TcpipRequestInfo {
  
  inline def apply(destIP: String, destPort: Double, srcIP: String, srcPort: Double): TcpipRequestInfo = {
    val __obj = js.Dynamic.literal(destIP = destIP.asInstanceOf[js.Any], destPort = destPort.asInstanceOf[js.Any], srcIP = srcIP.asInstanceOf[js.Any], srcPort = srcPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpipRequestInfo]
  }
  
  extension [Self <: TcpipRequestInfo](x: Self) {
    
    inline def setDestIP(value: String): Self = StObject.set(x, "destIP", value.asInstanceOf[js.Any])
    
    inline def setDestPort(value: Double): Self = StObject.set(x, "destPort", value.asInstanceOf[js.Any])
    
    inline def setSrcIP(value: String): Self = StObject.set(x, "srcIP", value.asInstanceOf[js.Any])
    
    inline def setSrcPort(value: Double): Self = StObject.set(x, "srcPort", value.asInstanceOf[js.Any])
  }
}
