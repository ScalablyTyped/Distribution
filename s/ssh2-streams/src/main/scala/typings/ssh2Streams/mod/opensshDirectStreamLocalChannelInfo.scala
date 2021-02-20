package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`direct-streamlocal@opensshDotcom`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait opensshDirectStreamLocalChannelInfo extends ChannelOpenInfo {
  
  var data: SocketChannelData = js.native
  
  var packetSize: Double = js.native
  
  var sender: Double = js.native
  
  var `type`: `direct-streamlocal@opensshDotcom` = js.native
  
  var window: Double = js.native
}
object opensshDirectStreamLocalChannelInfo {
  
  @scala.inline
  def apply(
    data: SocketChannelData,
    packetSize: Double,
    sender: Double,
    `type`: `direct-streamlocal@opensshDotcom`,
    window: Double
  ): opensshDirectStreamLocalChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[opensshDirectStreamLocalChannelInfo]
  }
  
  @scala.inline
  implicit class opensshDirectStreamLocalChannelInfoMutableBuilder[Self <: opensshDirectStreamLocalChannelInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: SocketChannelData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: Double): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `direct-streamlocal@opensshDotcom`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
