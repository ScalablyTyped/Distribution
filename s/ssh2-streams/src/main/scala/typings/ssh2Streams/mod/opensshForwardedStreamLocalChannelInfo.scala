package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`forwarded-streamlocal@opensshDotcom`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait opensshForwardedStreamLocalChannelInfo extends ChannelOpenInfo {
  
  var data: SocketChannelData = js.native
  
  var packetSize: Double = js.native
  
  var sender: Double = js.native
  
  var `type`: `forwarded-streamlocal@opensshDotcom` = js.native
  
  var window: Double = js.native
}
object opensshForwardedStreamLocalChannelInfo {
  
  @scala.inline
  def apply(
    data: SocketChannelData,
    packetSize: Double,
    sender: Double,
    `type`: `forwarded-streamlocal@opensshDotcom`,
    window: Double
  ): opensshForwardedStreamLocalChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[opensshForwardedStreamLocalChannelInfo]
  }
  
  @scala.inline
  implicit class opensshForwardedStreamLocalChannelInfoMutableBuilder[Self <: opensshForwardedStreamLocalChannelInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: SocketChannelData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: Double): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `forwarded-streamlocal@opensshDotcom`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
