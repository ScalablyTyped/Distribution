package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddChannelParameters extends js.Object {
  var channelGroup: String
  var channels: js.Array[String]
}

object AddChannelParameters {
  @scala.inline
  def apply(channelGroup: String, channels: js.Array[String]): AddChannelParameters = {
    val __obj = js.Dynamic.literal(channelGroup = channelGroup.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddChannelParameters]
  }
}

