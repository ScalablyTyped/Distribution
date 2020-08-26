package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// hereNow
@js.native
trait HereNowParameters extends js.Object {
  var channelGroups: js.UndefOr[js.Array[String]] = js.native
  var channels: js.UndefOr[js.Array[String]] = js.native
  var includeState: js.UndefOr[Boolean] = js.native
  var includeUUIDs: js.UndefOr[Boolean] = js.native
}

object HereNowParameters {
  @scala.inline
  def apply(): HereNowParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HereNowParameters]
  }
  @scala.inline
  implicit class HereNowParametersOps[Self <: HereNowParameters] (val x: Self) extends AnyVal {
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
    def setChannelGroupsVarargs(value: String*): Self = this.set("channelGroups", js.Array(value :_*))
    @scala.inline
    def setChannelGroups(value: js.Array[String]): Self = this.set("channelGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelGroups: Self = this.set("channelGroups", js.undefined)
    @scala.inline
    def setChannelsVarargs(value: String*): Self = this.set("channels", js.Array(value :_*))
    @scala.inline
    def setChannels(value: js.Array[String]): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    @scala.inline
    def setIncludeState(value: Boolean): Self = this.set("includeState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeState: Self = this.set("includeState", js.undefined)
    @scala.inline
    def setIncludeUUIDs(value: Boolean): Self = this.set("includeUUIDs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeUUIDs: Self = this.set("includeUUIDs", js.undefined)
  }
  
}

