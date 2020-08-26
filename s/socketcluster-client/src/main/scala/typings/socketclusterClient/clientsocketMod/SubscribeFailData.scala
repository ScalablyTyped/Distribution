package typings.socketclusterClient.clientsocketMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeFailData extends js.Object {
  var channel: String = js.native
  var error: Error = js.native
  var subscriptionOptions: SubscribeOptions = js.native
}

object SubscribeFailData {
  @scala.inline
  def apply(channel: String, error: Error, subscriptionOptions: SubscribeOptions): SubscribeFailData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], subscriptionOptions = subscriptionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeFailData]
  }
  @scala.inline
  implicit class SubscribeFailDataOps[Self <: SubscribeFailData] (val x: Self) extends AnyVal {
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
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionOptions(value: SubscribeOptions): Self = this.set("subscriptionOptions", value.asInstanceOf[js.Any])
  }
  
}

