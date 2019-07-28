package typings.socketclusterDashClient.libScclientsocketMod

import typings.scDashChannel.scDashChannelMod.ChannelState
import typings.scDashChannel.scDashChannelMod.SCChannelOptions
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
    val __obj = js.Dynamic.literal(channel = channel, newState = newState, oldState = oldState, subscriptionOptions = subscriptionOptions)
  
    __obj.asInstanceOf[SubscribeStateChangeData]
  }
}

