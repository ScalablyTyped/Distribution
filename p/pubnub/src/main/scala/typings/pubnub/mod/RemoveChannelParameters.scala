package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveChannelParameters extends js.Object {
  var channelGroup: String
  var channels: js.Array[String]
}

object RemoveChannelParameters {
  @scala.inline
  def apply(channelGroup: String, channels: js.Array[String]): RemoveChannelParameters = {
    val __obj = js.Dynamic.literal(channelGroup = channelGroup.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveChannelParameters]
  }
}

