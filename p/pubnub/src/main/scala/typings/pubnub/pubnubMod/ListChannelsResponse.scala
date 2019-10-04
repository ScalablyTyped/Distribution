package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListChannelsResponse extends js.Object {
  var channels: js.Array[String]
}

object ListChannelsResponse {
  @scala.inline
  def apply(channels: js.Array[String]): ListChannelsResponse = {
    val __obj = js.Dynamic.literal(channels = channels)
  
    __obj.asInstanceOf[ListChannelsResponse]
  }
}

