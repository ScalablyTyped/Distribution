package typings.pubnub.mod

import typings.pubnub.anon.DataEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageActionEvent extends js.Object {
  var channel: String
  var message: DataEvent
  var publisher: String
  var subscription: js.UndefOr[String] = js.undefined
  var timetoken: String
}

object MessageActionEvent {
  @scala.inline
  def apply(
    channel: String,
    message: DataEvent,
    publisher: String,
    timetoken: String,
    subscription: String = null
  ): MessageActionEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageActionEvent]
  }
}

