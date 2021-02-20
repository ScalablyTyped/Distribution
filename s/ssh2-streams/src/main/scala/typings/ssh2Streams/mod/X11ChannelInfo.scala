package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.x11
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X11ChannelInfo extends ChannelOpenInfo {
  
  var data: X11ChannelData = js.native
  
  var packetSize: Double = js.native
  
  var sender: Double = js.native
  
  var `type`: x11 = js.native
  
  var window: Double = js.native
}
object X11ChannelInfo {
  
  @scala.inline
  def apply(data: X11ChannelData, packetSize: Double, sender: Double, `type`: x11, window: Double): X11ChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[X11ChannelInfo]
  }
  
  @scala.inline
  implicit class X11ChannelInfoMutableBuilder[Self <: X11ChannelInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: X11ChannelData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: Double): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: x11): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
