package typings.pusherChatkitClient.roomMod

import typings.pusherChatkitClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PusherReadCursor extends js.Object {
  var position: Double
  var room: PusherRoom
  var `type`: Double
  var updatedAt: String
  var user: PusherUser
}

object PusherReadCursor {
  @scala.inline
  def apply(position: Double, room: PusherRoom, `type`: Double, updatedAt: String, user: PusherUser): PusherReadCursor = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PusherReadCursor]
  }
}

