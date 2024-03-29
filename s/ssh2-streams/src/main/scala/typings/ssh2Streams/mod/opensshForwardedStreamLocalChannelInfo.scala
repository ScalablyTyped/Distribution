package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`forwarded-streamlocal@opensshDotcom`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait opensshForwardedStreamLocalChannelInfo
  extends StObject
     with ChannelOpenInfo {
  
  var data: SocketChannelData
  
  var packetSize: Double
  
  var sender: Double
  
  var `type`: `forwarded-streamlocal@opensshDotcom`
  
  var window: Double
}
object opensshForwardedStreamLocalChannelInfo {
  
  inline def apply(data: SocketChannelData, packetSize: Double, sender: Double, window: Double): opensshForwardedStreamLocalChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("forwarded-streamlocal@openssh.com")
    __obj.asInstanceOf[opensshForwardedStreamLocalChannelInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: opensshForwardedStreamLocalChannelInfo] (val x: Self) extends AnyVal {
    
    inline def setData(value: SocketChannelData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Double): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setType(value: `forwarded-streamlocal@opensshDotcom`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
