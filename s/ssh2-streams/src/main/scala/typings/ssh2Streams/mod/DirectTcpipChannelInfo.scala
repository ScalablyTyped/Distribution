package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`direct-tcpip`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectTcpipChannelInfo
  extends StObject
     with ChannelOpenInfo {
  
  var data: TcpipChannelData
  
  var packetSize: Double
  
  var sender: Double
  
  var `type`: `direct-tcpip`
  
  var window: Double
}
object DirectTcpipChannelInfo {
  
  inline def apply(data: TcpipChannelData, packetSize: Double, sender: Double, window: Double): DirectTcpipChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("direct-tcpip")
    __obj.asInstanceOf[DirectTcpipChannelInfo]
  }
  
  extension [Self <: DirectTcpipChannelInfo](x: Self) {
    
    inline def setData(value: TcpipChannelData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Double): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setType(value: `direct-tcpip`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
