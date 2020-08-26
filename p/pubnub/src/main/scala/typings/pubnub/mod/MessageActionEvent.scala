package typings.pubnub.mod

import typings.pubnub.anon.DataEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageActionEvent extends js.Object {
  var channel: String = js.native
  var message: DataEvent = js.native
  var publisher: String = js.native
  var subscription: js.UndefOr[String] = js.native
  var timetoken: String = js.native
}

object MessageActionEvent {
  @scala.inline
  def apply(channel: String, message: DataEvent, publisher: String, timetoken: String): MessageActionEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageActionEvent]
  }
  @scala.inline
  implicit class MessageActionEventOps[Self <: MessageActionEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: DataEvent): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimetoken(value: String): Self = this.set("timetoken", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
  }
  
}

