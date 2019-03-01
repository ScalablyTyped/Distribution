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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channels")(channels)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("heartbeatIntervalMs")(heartbeatIntervalMs)
    __obj.updateDynamic("heartbeatUrl")(heartbeatUrl)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("idleTimeoutMs")(idleTimeoutMs)
    __obj.updateDynamic("profileUrl")(profileUrl)
    __obj.updateDynamic("unRegisterUrl")(unRegisterUrl)
    __obj.updateDynamic("updateSubscriberUrl")(updateSubscriberUrl)
    __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[SSEConnect]
  }
}

