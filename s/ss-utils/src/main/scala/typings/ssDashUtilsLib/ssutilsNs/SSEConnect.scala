package typings
package ssDashUtilsLib.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSEConnect extends SSECommand {
  var heartbeatIntervalMs: scala.Double
  var heartbeatUrl: java.lang.String
  var id: java.lang.String
  var idleTimeoutMs: scala.Double
  var unRegisterUrl: java.lang.String
  var updateSubscriberUrl: java.lang.String
}

object SSEConnect {
  @scala.inline
  def apply(
    channels: java.lang.String,
    displayName: java.lang.String,
    heartbeatIntervalMs: scala.Double,
    heartbeatUrl: java.lang.String,
    id: java.lang.String,
    idleTimeoutMs: scala.Double,
    profileUrl: java.lang.String,
    unRegisterUrl: java.lang.String,
    updateSubscriberUrl: java.lang.String,
    userId: java.lang.String
  ): SSEConnect = {
    val __obj = js.Dynamic.literal(channels = channels, displayName = displayName, heartbeatIntervalMs = heartbeatIntervalMs, heartbeatUrl = heartbeatUrl, id = id, idleTimeoutMs = idleTimeoutMs, profileUrl = profileUrl, unRegisterUrl = unRegisterUrl, updateSubscriberUrl = updateSubscriberUrl, userId = userId)
  
    __obj.asInstanceOf[SSEConnect]
  }
}

