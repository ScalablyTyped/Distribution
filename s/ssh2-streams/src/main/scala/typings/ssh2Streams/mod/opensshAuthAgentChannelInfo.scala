package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`auth-agent@opensshDotcom`
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
  implicit class opensshAuthAgentChannelInfoOps[Self <: opensshAuthAgentChannelInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPacketSize(value: Double): Self = this.set("packetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: Double): Self = this.set("sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `auth-agent@opensshDotcom`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: Double): Self = this.set("window", value.asInstanceOf[js.Any])
  }
}
