package typings.pubnub.mod

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
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], actualChannel = actualChannel.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], occupancy = occupancy.asInstanceOf[js.Any], subscribedChannel = subscribedChannel.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresenceEvent]
  }
}

