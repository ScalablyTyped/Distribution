package typings.pubnub.pubnubMod

import typings.pubnub.pubnubStrings.`state-change`
import typings.pubnub.pubnubStrings.join
import typings.pubnub.pubnubStrings.leave
import typings.pubnub.pubnubStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresenceEvent extends js.Object {
  var action: join | leave | `state-change` | timeout
  /**
    * @deprecated
    */
  var actualChannel: String
  var channel: String
  var occupancy: Double
  var state: js.UndefOr[js.Any] = js.undefined
  /**
    * @deprecated
    */
  var subscribedChannel: String
  var subscription: String
  var timestamp: Double
  var timetoken: String
  var uuid: String
}

object PresenceEvent {
  @scala.inline
  def apply(
    action: join | leave | `state-change` | timeout,
    actualChannel: String,
    channel: String,
    occupancy: Double,
    subscribedChannel: String,
    subscription: String,
    timestamp: Double,
    timetoken: String,
    uuid: String,
    state: js.Any = null
  ): PresenceEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], actualChannel = actualChannel, channel = channel, occupancy = occupancy, subscribedChannel = subscribedChannel, subscription = subscription, timestamp = timestamp, timetoken = timetoken, uuid = uuid)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[PresenceEvent]
  }
}

