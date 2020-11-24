package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelMax extends js.Object {
  
  var channelMax: Double = js.native
  
  var connection_timeout: Double = js.native
  
  var heartbeat: Double = js.native
}
object ChannelMax {
  
  @scala.inline
  def apply(channelMax: Double, connection_timeout: Double, heartbeat: Double): ChannelMax = {
    val __obj = js.Dynamic.literal(channelMax = channelMax.asInstanceOf[js.Any], connection_timeout = connection_timeout.asInstanceOf[js.Any], heartbeat = heartbeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMax]
  }
  
  @scala.inline
  implicit class ChannelMaxOps[Self <: ChannelMax] (val x: Self) extends AnyVal {
    
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
    def setChannelMax(value: Double): Self = this.set("channelMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_timeout(value: Double): Self = this.set("connection_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeartbeat(value: Double): Self = this.set("heartbeat", value.asInstanceOf[js.Any])
  }
}
