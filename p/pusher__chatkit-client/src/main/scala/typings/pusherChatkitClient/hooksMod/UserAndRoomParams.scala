package typings.pusherChatkitClient.hooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAndRoomParams extends RoomParams {
  var userId: String
}

object UserAndRoomParams {
  @scala.inline
  def apply(roomId: String, userId: String): UserAndRoomParams = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAndRoomParams]
  }
}

