package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.SubscribeData
import typings.socketclusterServer.serversocketMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionData extends SubscribeData {
  var socket: typings.socketclusterServer.serversocketMod.^ = js.native
}

object SubscriptionData {
  @scala.inline
  def apply(
    channel: String,
    socket: typings.socketclusterServer.serversocketMod.^,
    subscriptionOptions: SubscriptionOptions
  ): SubscriptionData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], subscriptionOptions = subscriptionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionData]
  }
  @scala.inline
  implicit class SubscriptionDataOps[Self <: SubscriptionData] (val x: Self) extends AnyVal {
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
    def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = this.set("socket", value.asInstanceOf[js.Any])
  }
  
}

