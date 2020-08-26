package typings.socketclusterClient.clientsocketMod

import typings.agChannel.mod.ChannelState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeStateChangeData extends SubscribeData {
  var newChannelState: ChannelState = js.native
  var oldChannelState: ChannelState = js.native
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
  @scala.inline
  implicit class SubscribeStateChangeDataOps[Self <: SubscribeStateChangeData] (val x: Self) extends AnyVal {
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
    def setNewChannelState(value: ChannelState): Self = this.set("newChannelState", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldChannelState(value: ChannelState): Self = this.set("oldChannelState", value.asInstanceOf[js.Any])
  }
  
}

