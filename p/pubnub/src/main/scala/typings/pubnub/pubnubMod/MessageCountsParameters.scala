package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageCountsParameters extends js.Object {
  var channelTimetokens: js.Array[Double | String]
  var channels: js.Array[String]
}

object MessageCountsParameters {
  @scala.inline
  def apply(channelTimetokens: js.Array[Double | String], channels: js.Array[String]): MessageCountsParameters = {
    val __obj = js.Dynamic.literal(channelTimetokens = channelTimetokens, channels = channels)
  
    __obj.asInstanceOf[MessageCountsParameters]
  }
}

