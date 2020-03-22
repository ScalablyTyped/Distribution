package typings.pubnub.mod

import typings.pubnub.AnonEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpaceEvent extends js.Object {
  var channel: String
  var message: AnonEvent
  var publisher: String
  var subscription: String
  var timetoken: String
}

object SpaceEvent {
  @scala.inline
  def apply(channel: String, message: AnonEvent, publisher: String, subscription: String, timetoken: String): SpaceEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpaceEvent]
  }
}

