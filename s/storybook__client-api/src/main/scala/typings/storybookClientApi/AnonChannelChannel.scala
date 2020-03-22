package typings.storybookClientApi

import typings.storybookChannels.mod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannelChannel extends js.Object {
  var channel: Channel
}

object AnonChannelChannel {
  @scala.inline
  def apply(channel: Channel): AnonChannelChannel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChannelChannel]
  }
}

