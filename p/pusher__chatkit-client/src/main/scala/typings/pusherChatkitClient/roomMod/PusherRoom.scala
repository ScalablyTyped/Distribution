package typings.pusherChatkitClient.roomMod

import typings.pusherChatkitClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PusherRoom extends js.Object {
  var createdAt: String
  var createdByUserId: String
  var customData: js.UndefOr[js.Any] = js.undefined
  var id: String
  var isPrivate: Boolean
  var lastMessageAt: String
  var name: String
  var unreadCount: Double
  var updatedAt: String
  var users: js.Array[PusherUser]
}

object PusherRoom {
  @scala.inline
  def apply(
    createdAt: String,
    createdByUserId: String,
    id: String,
    isPrivate: Boolean,
    lastMessageAt: String,
    name: String,
    unreadCount: Double,
    updatedAt: String,
    users: js.Array[PusherUser],
    customData: js.Any = null
  ): PusherRoom = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], createdByUserId = createdByUserId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isPrivate = isPrivate.asInstanceOf[js.Any], lastMessageAt = lastMessageAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], unreadCount = unreadCount.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PusherRoom]
  }
}

