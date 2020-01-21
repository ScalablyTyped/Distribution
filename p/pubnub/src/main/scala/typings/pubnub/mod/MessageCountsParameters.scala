package typings.pubnub.mod

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
    val __obj = js.Dynamic.literal(channelTimetokens = channelTimetokens.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageCountsParameters]
  }
}

