package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// getState
@js.native
trait GetStateParameters extends js.Object {
  var channelGroups: js.UndefOr[js.Array[String]] = js.native
  var channels: js.UndefOr[js.Array[String]] = js.native
  var uuid: js.UndefOr[String] = js.native
}

object GetStateParameters {
  @scala.inline
  def apply(): GetStateParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStateParameters]
  }
  @scala.inline
  implicit class GetStateParametersOps[Self <: GetStateParameters] (val x: Self) extends AnyVal {
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
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
  
}

