package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TcpipChannelData extends StObject {
  
  var destIP: String
  
  var destPort: Double
  
  var srcIP: String
  
  var srcPort: Double
}
object TcpipChannelData {
  
  @scala.inline
  def apply(destIP: String, destPort: Double, srcIP: String, srcPort: Double): TcpipChannelData = {
    val __obj = js.Dynamic.literal(destIP = destIP.asInstanceOf[js.Any], destPort = destPort.asInstanceOf[js.Any], srcIP = srcIP.asInstanceOf[js.Any], srcPort = srcPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpipChannelData]
  }
  
  @scala.inline
  implicit class TcpipChannelDataMutableBuilder[Self <: TcpipChannelData] (val x: Self) extends AnyVal {
    
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
