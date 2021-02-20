package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`auth-agent@opensshDotcom`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait opensshAuthAgentChannelInfo extends ChannelOpenInfo {
  
  var packetSize: Double = js.native
  
  var sender: Double = js.native
  
  var `type`: `auth-agent@opensshDotcom` = js.native
  
  var window: Double = js.native
}
object opensshAuthAgentChannelInfo {
  
  @scala.inline
  def apply(packetSize: Double, sender: Double, `type`: `auth-agent@opensshDotcom`, window: Double): opensshAuthAgentChannelInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[opensshAuthAgentChannelInfo]
  }
  
  @scala.inline
  implicit class opensshAuthAgentChannelInfoMutableBuilder[Self <: opensshAuthAgentChannelInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: Double): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `auth-agent@opensshDotcom`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
