package typings.ssUtils.ssutils

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
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], heartbeatIntervalMs = heartbeatIntervalMs.asInstanceOf[js.Any], heartbeatUrl = heartbeatUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], idleTimeoutMs = idleTimeoutMs.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], unRegisterUrl = unRegisterUrl.asInstanceOf[js.Any], updateSubscriberUrl = updateSubscriberUrl.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSEConnect]
  }
}

