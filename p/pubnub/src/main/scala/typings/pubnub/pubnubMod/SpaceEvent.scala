package typings.pubnub.pubnubMod

import typings.pubnub.Anon_DataEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpaceEvent extends js.Object {
  var channel: String
  var message: Anon_DataEvent
  var publisher: String
  var subscription: String
  var timetoken: String
}

object SpaceEvent {
  @scala.inline
  def apply(
    channel: String,
    message: Anon_DataEvent,
    publisher: String,
    subscription: String,
    timetoken: String
  ): SpaceEvent = {
    val __obj = js.Dynamic.literal(channel = channel, message = message, publisher = publisher, subscription = subscription, timetoken = timetoken)
  
    __obj.asInstanceOf[SpaceEvent]
  }
}

