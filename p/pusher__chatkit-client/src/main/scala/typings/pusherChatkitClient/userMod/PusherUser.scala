package typings.pusherChatkitClient.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PusherUser extends js.Object {
  var avatarURL: js.UndefOr[String] = js.native
  var createdAt: String = js.native
  var customData: js.UndefOr[js.Any] = js.native
  var id: String = js.native
  var name: String = js.native
  var presence: PusherUserPresence = js.native
  var updatedAt: String = js.native
}

object PusherUser {
  @scala.inline
  def apply(createdAt: String, id: String, name: String, presence: PusherUserPresence, updatedAt: String): PusherUser = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PusherUser]
  }
  @scala.inline
  implicit class PusherUserOps[Self <: PusherUser] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPresence(value: PusherUserPresence): Self = this.set("presence", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedAt(value: String): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvatarURL(value: String): Self = this.set("avatarURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatarURL: Self = this.set("avatarURL", js.undefined)
    @scala.inline
    def setCustomData(value: js.Any): Self = this.set("customData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
  }
  
}

