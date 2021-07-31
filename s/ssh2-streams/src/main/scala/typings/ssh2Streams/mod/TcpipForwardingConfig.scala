package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TcpipForwardingConfig extends StObject {
  
  /**
    * Destination IP address of outgoing connection.
    */
  var destIP: String
  
  /**
    * Destination port of outgoing connection.
    */
  var destPort: Double
  
  /**
    * Source IP address of outgoing connection.
    */
  var srcIP: String
  
  /**
    * Source port of outgoing connection.
    */
  var srcPort: Double
}
object TcpipForwardingConfig {
  
  @scala.inline
  def apply(destIP: String, destPort: Double, srcIP: String, srcPort: Double): TcpipForwardingConfig = {
    val __obj = js.Dynamic.literal(destIP = destIP.asInstanceOf[js.Any], destPort = destPort.asInstanceOf[js.Any], srcIP = srcIP.asInstanceOf[js.Any], srcPort = srcPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpipForwardingConfig]
  }
  
  @scala.inline
  implicit class TcpipForwardingConfigMutableBuilder[Self <: TcpipForwardingConfig] (val x: Self) extends AnyVal {
    
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
