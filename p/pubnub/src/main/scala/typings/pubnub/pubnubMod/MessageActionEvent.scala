package typings.pubnub.pubnubMod

import typings.pubnub.Anon_DataEventMessageAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageActionEvent extends js.Object {
  var channel: String
  var message: Anon_DataEventMessageAction
  var publisher: String
  var subscription: js.UndefOr[String] = js.undefined
  var timetoken: String
}

object MessageActionEvent {
  @scala.inline
  def apply(
    channel: String,
    message: Anon_DataEventMessageAction,
    publisher: String,
    timetoken: String,
    subscription: String = null
  ): MessageActionEvent = {
    val __obj = js.Dynamic.literal(channel = channel, message = message, publisher = publisher, timetoken = timetoken)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    __obj.asInstanceOf[MessageActionEvent]
  }
}

