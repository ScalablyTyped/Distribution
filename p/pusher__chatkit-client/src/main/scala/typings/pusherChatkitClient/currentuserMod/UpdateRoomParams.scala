package typings.pusherChatkitClient.currentuserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoomParams extends js.Object {
  var customData: js.UndefOr[js.Any] = js.native
  var name: js.UndefOr[String] = js.native
  var `private`: js.UndefOr[Boolean] = js.native
  var roomId: String = js.native
}

object UpdateRoomParams {
  @scala.inline
  def apply(roomId: String): UpdateRoomParams = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoomParams]
  }
  @scala.inline
  implicit class UpdateRoomParamsOps[Self <: UpdateRoomParams] (val x: Self) extends AnyVal {
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
    def setRoomId(value: String): Self = this.set("roomId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomData(value: js.Any): Self = this.set("customData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
  }
  
}

