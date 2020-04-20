package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListChannelsParameters extends js.Object {
  var channelGroup: String
}

object ListChannelsParameters {
  @scala.inline
  def apply(channelGroup: String): ListChannelsParameters = {
    val __obj = js.Dynamic.literal(channelGroup = channelGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelsParameters]
  }
}

