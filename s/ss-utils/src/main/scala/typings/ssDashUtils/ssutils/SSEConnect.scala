package typings.ssDashUtils.ssutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSEConnect extends SSECommand {
  var heartbeatIntervalMs: Double
  var heartbeatUrl: String
  var id: String
  var idleTimeoutMs: Double
  var unRegisterUrl: String
  var updateSubscriberUrl: String
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
    val __obj = js.Dynamic.literal(channels = channels, displayName = displayName, heartbeatIntervalMs = heartbeatIntervalMs, heartbeatUrl = heartbeatUrl, id = id, idleTimeoutMs = idleTimeoutMs, profileUrl = profileUrl, unRegisterUrl = unRegisterUrl, updateSubscriberUrl = updateSubscriberUrl, userId = userId)
  
    __obj.asInstanceOf[SSEConnect]
  }
}

