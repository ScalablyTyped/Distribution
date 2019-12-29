package typings.atPusherChatkitDashClient.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PusherUser extends js.Object {
  var avatarURL: js.UndefOr[String] = js.undefined
  var createdAt: String
  var customData: js.UndefOr[js.Any] = js.undefined
  var id: String
  var name: String
  var presence: PusherUserPresence
  var updatedAt: String
}

object PusherUser {
  @scala.inline
  def apply(
    createdAt: String,
    id: String,
    name: String,
    presence: PusherUserPresence,
    updatedAt: String,
    avatarURL: String = null,
    customData: js.Any = null
  ): PusherUser = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    if (avatarURL != null) __obj.updateDynamic("avatarURL")(avatarURL.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PusherUser]
  }
}

