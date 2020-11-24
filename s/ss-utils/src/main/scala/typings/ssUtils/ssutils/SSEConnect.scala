package typings.ssUtils.ssutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSEConnect extends SSECommand {
  
  var heartbeatIntervalMs: Double = js.native
  
  var heartbeatUrl: String = js.native
  
  var id: String = js.native
  
  var idleTimeoutMs: Double = js.native
  
  var unRegisterUrl: String = js.native
  
  var updateSubscriberUrl: String = js.native
}
object SSEConnect {
  
  @scala.inline
  def apply(
    channels: String,
    displayName: String,
    heartbeatIntervalMs: Double,
    heartbeatUrl: String,
    id: String,
    idleTimeoutMs: Double,
    profileUrl: String,
    unRegisterUrl: String,
    updateSubscriberUrl: String,
    userId: String
  ): SSEConnect = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], heartbeatIntervalMs = heartbeatIntervalMs.asInstanceOf[js.Any], heartbeatUrl = heartbeatUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], idleTimeoutMs = idleTimeoutMs.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], unRegisterUrl = unRegisterUrl.asInstanceOf[js.Any], updateSubscriberUrl = updateSubscriberUrl.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSEConnect]
  }
  
  @scala.inline
  implicit class SSEConnectOps[Self <: SSEConnect] (val x: Self) extends AnyVal {
    
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
    def setHeartbeatIntervalMs(value: Double): Self = this.set("heartbeatIntervalMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeartbeatUrl(value: String): Self = this.set("heartbeatUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleTimeoutMs(value: Double): Self = this.set("idleTimeoutMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnRegisterUrl(value: String): Self = this.set("unRegisterUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSubscriberUrl(value: String): Self = this.set("updateSubscriberUrl", value.asInstanceOf[js.Any])
  }
}
