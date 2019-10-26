package typings.pubnub.pubnubMod

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
    val __obj = js.Dynamic.literal(channel = channel, message = message, publisher = publisher, subscription = subscription, timetoken = timetoken)
  
    __obj.asInstanceOf[SignalEvent]
  }
}

