package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveMembershipsParameters extends ChannelMembersParameters {
  var channels: js.Array[String] = js.native
  var uuid: js.UndefOr[String] = js.native
}

object RemoveMembershipsParameters {
  @scala.inline
  def apply(channels: js.Array[String]): RemoveMembershipsParameters = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveMembershipsParameters]
  }
  @scala.inline
  implicit class RemoveMembershipsParametersOps[Self <: RemoveMembershipsParameters] (val x: Self) extends AnyVal {
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
    def setChannelsVarargs(value: String*): Self = this.set("channels", js.Array(value :_*))
    @scala.inline
    def setChannels(value: js.Array[String]): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
  
}

