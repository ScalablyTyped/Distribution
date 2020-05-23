package typings.storybookClientApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelChannel extends js.Object {
  var channel: typings.storybookChannels.mod.Channel
}

object ChannelChannel {
  @scala.inline
  def apply(channel: typings.storybookChannels.mod.Channel): ChannelChannel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelChannel]
  }
}

