package typings.socketclusterClient.scclientsocketMod

import typings.scChannel.mod.ChannelState
import typings.scChannel.mod.SCChannelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeStateChangeData extends js.Object {
  var channel: String
  var newState: ChannelState
  var oldState: ChannelState
  var subscriptionOptions: SCChannelOptions
}

object SubscribeStateChangeData {
  @scala.inline
  def apply(
    channel: String,
    newState: ChannelState,
    oldState: ChannelState,
    subscriptionOptions: SCChannelOptions
  ): SubscribeStateChangeData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], subscriptionOptions = subscriptionOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscribeStateChangeData]
  }
}

