package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.SubscribeData
import typings.socketclusterServer.serversocketMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionData extends SubscribeData {
  var socket: typings.socketclusterServer.serversocketMod.^
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
}

