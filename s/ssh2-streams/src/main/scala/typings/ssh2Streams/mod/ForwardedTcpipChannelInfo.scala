package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`forwarded-tcpip`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardedTcpipChannelInfo
  extends StObject
     with ChannelOpenInfo {
  
  var data: TcpipChannelData
  
  var packetSize: Double
  
  var sender: Double
  
  var `type`: `forwarded-tcpip`
  
  var window: Double
}
object ForwardedTcpipChannelInfo {
  
  inline def apply(data: TcpipChannelData, packetSize: Double, sender: Double, window: Double): ForwardedTcpipChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("forwarded-tcpip")
    __obj.asInstanceOf[ForwardedTcpipChannelInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForwardedTcpipChannelInfo] (val x: Self) extends AnyVal {
    
    inline def setData(value: TcpipChannelData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Double): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setType(value: `forwarded-tcpip`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
