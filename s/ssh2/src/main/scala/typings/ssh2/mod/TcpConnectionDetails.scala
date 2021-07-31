package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TcpConnectionDetails extends StObject {
  
  /** The remote IP the connection was received on (given in earlier call to `forwardIn()`). */
  var destIP: String
  
  /** The remote port the connection was received on (given in earlier call to `forwardIn()`). */
  var destPort: Double
  
  /** The originating IP of the connection. */
  var srcIP: String
  
  /** The originating port of the connection. */
  var srcPort: Double
}
object TcpConnectionDetails {
  
  @scala.inline
  def apply(destIP: String, destPort: Double, srcIP: String, srcPort: Double): TcpConnectionDetails = {
    val __obj = js.Dynamic.literal(destIP = destIP.asInstanceOf[js.Any], destPort = destPort.asInstanceOf[js.Any], srcIP = srcIP.asInstanceOf[js.Any], srcPort = srcPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpConnectionDetails]
  }
  
  @scala.inline
  implicit class TcpConnectionDetailsMutableBuilder[Self <: TcpConnectionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestIP(value: String): Self = StObject.set(x, "destIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestPort(value: Double): Self = StObject.set(x, "destPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcIP(value: String): Self = StObject.set(x, "srcIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcPort(value: Double): Self = StObject.set(x, "srcPort", value.asInstanceOf[js.Any])
  }
}
