package typings.pusherChatkitClient.roomMod

import typings.pusherChatkitClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PusherReadCursor extends js.Object {
  var position: Double = js.native
  var room: PusherRoom = js.native
  var `type`: Double = js.native
  var updatedAt: String = js.native
  var user: PusherUser = js.native
}

object PusherReadCursor {
  @scala.inline
  def apply(position: Double, room: PusherRoom, `type`: Double, updatedAt: String, user: PusherUser): PusherReadCursor = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PusherReadCursor]
  }
  @scala.inline
  implicit class PusherReadCursorOps[Self <: PusherReadCursor] (val x: Self) extends AnyVal {
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
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoom(value: PusherRoom): Self = this.set("room", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedAt(value: String): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: PusherUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

