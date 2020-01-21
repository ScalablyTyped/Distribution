package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalEvent extends js.Object {
  var channel: String
  var message: js.Any
  var publisher: String
  var subscription: String
  var timetoken: String
}

object SignalEvent {
  @scala.inline
  def apply(channel: String, message: js.Any, publisher: String, subscription: String, timetoken: String): SignalEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignalEvent]
  }
}

