package typings.socketclusterClient.clientsocketMod

import typings.agChannel.mod.ChannelState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeStateChangeData extends SubscribeData {
  var newChannelState: ChannelState
  var oldChannelState: ChannelState
}

object SubscribeStateChangeData {
  @scala.inline
  def apply(
    channel: String,
    newChannelState: ChannelState,
    oldChannelState: ChannelState,
    subscriptionOptions: SubscribeOptions
  ): SubscribeStateChangeData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], newChannelState = newChannelState.asInstanceOf[js.Any], oldChannelState = oldChannelState.asInstanceOf[js.Any], subscriptionOptions = subscriptionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeStateChangeData]
  }
}

