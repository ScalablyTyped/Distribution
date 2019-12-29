package typings.atPusherChatkitDashClient.messageMod

import typings.atPusherChatkitDashClient.roomMod.PusherRoom
import typings.atPusherChatkitDashClient.userMod.PusherUser
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PusherMessage extends js.Object {
  var createdAt: Date
  var id: Double
  var parts: js.Array[MessagePart]
  var room: PusherRoom
  var sender: PusherUser
  var updatedAt: Date
}

object PusherMessage {
  @scala.inline
  def apply(
    createdAt: Date,
    id: Double,
    parts: js.Array[MessagePart],
    room: PusherRoom,
    sender: PusherUser,
    updatedAt: Date
  ): PusherMessage = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PusherMessage]
  }
}

