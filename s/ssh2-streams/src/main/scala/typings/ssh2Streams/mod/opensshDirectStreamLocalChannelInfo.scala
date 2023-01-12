package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`direct-streamlocal@opensshDotcom`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait opensshDirectStreamLocalChannelInfo
  extends StObject
     with ChannelOpenInfo {
  
  var data: SocketChannelData
  
  var packetSize: Double
  
  var sender: Double
  
  var `type`: `direct-streamlocal@opensshDotcom`
  
  var window: Double
}
object opensshDirectStreamLocalChannelInfo {
  
  inline def apply(data: SocketChannelData, packetSize: Double, sender: Double, window: Double): opensshDirectStreamLocalChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("direct-streamlocal@openssh.com")
    __obj.asInstanceOf[opensshDirectStreamLocalChannelInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: opensshDirectStreamLocalChannelInfo] (val x: Self) extends AnyVal {
    
    inline def setData(value: SocketChannelData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Double): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setType(value: `direct-streamlocal@opensshDotcom`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
