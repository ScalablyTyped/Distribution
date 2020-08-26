package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageCountsParameters extends js.Object {
  var channelTimetokens: js.Array[Double | String] = js.native
  var channels: js.Array[String] = js.native
}

object MessageCountsParameters {
  @scala.inline
  def apply(channelTimetokens: js.Array[Double | String], channels: js.Array[String]): MessageCountsParameters = {
    val __obj = js.Dynamic.literal(channelTimetokens = channelTimetokens.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageCountsParameters]
  }
  @scala.inline
  implicit class MessageCountsParametersOps[Self <: MessageCountsParameters] (val x: Self) extends AnyVal {
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
    def setChannelTimetokensVarargs(value: (Double | String)*): Self = this.set("channelTimetokens", js.Array(value :_*))
    @scala.inline
    def setChannelTimetokens(value: js.Array[Double | String]): Self = this.set("channelTimetokens", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelsVarargs(value: String*): Self = this.set("channels", js.Array(value :_*))
    @scala.inline
    def setChannels(value: js.Array[String]): Self = this.set("channels", value.asInstanceOf[js.Any])
  }
  
}

