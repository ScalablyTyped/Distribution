package typings.socketclusterClient.clientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeData extends js.Object {
  var channel: String
  var subscriptionOptions: SubscribeOptions
}

object SubscribeData {
  @scala.inline
  def apply(channel: String, subscriptionOptions: SubscribeOptions): SubscribeData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], subscriptionOptions = subscriptionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeData]
  }
}

