package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresenceEvent extends js.Object {
  var action: pubnubLib.pubnubLibStrings.join | pubnubLib.pubnubLibStrings.leave | pubnubLib.pubnubLibStrings.`state-change` | pubnubLib.pubnubLibStrings.timeout
  /**
    * @deprecated
    */
  var actualChannel: java.lang.String
  var channel: java.lang.String
  var occupancy: scala.Double
  var state: js.UndefOr[js.Any] = js.undefined
  /**
    * @deprecated
    */
  var subscribedChannel: java.lang.String
  var subscription: java.lang.String
  var timestamp: scala.Double
  var timetoken: java.lang.String
  var uuid: java.lang.String
}

object PresenceEvent {
  @scala.inline
  def apply(
    action: pubnubLib.pubnubLibStrings.join | pubnubLib.pubnubLibStrings.leave | pubnubLib.pubnubLibStrings.`state-change` | pubnubLib.pubnubLibStrings.timeout,
    actualChannel: java.lang.String,
    channel: java.lang.String,
    occupancy: scala.Double,
    subscribedChannel: java.lang.String,
    subscription: java.lang.String,
    timestamp: scala.Double,
    timetoken: java.lang.String,
    uuid: java.lang.String,
    state: js.Any = null
  ): PresenceEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("actualChannel")(actualChannel)
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("occupancy")(occupancy)
    __obj.updateDynamic("subscribedChannel")(subscribedChannel)
    __obj.updateDynamic("subscription")(subscription)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("timetoken")(timetoken)
    __obj.updateDynamic("uuid")(uuid)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[PresenceEvent]
  }
}

