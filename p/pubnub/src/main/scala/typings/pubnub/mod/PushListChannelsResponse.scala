package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushListChannelsResponse extends js.Object {
  var channels: js.Array[String]
}

object PushListChannelsResponse {
  @scala.inline
  def apply(channels: js.Array[String]): PushListChannelsResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushListChannelsResponse]
  }
}

