package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.x11
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X11ChannelInfo
  extends StObject
     with ChannelOpenInfo {
  
  var data: X11ChannelData
  
  var packetSize: Double
  
  var sender: Double
  
  var `type`: x11
  
  var window: Double
}
object X11ChannelInfo {
  
  inline def apply(data: X11ChannelData, packetSize: Double, sender: Double, window: Double): X11ChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("x11")
    __obj.asInstanceOf[X11ChannelInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X11ChannelInfo] (val x: Self) extends AnyVal {
    
    inline def setData(value: X11ChannelData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Double): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setType(value: x11): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
