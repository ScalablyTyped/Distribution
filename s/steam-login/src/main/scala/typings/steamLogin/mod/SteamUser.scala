package typings.steamLogin.mod

import typings.steamLogin.anon.Avatar
import typings.steamLogin.anon.Large
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SteamUser extends js.Object {
  var _json: Avatar = js.native
  var avatar: Large = js.native
  var name: String = js.native
  var profile: String = js.native
  var steamid: String = js.native
  var username: String = js.native
}

object SteamUser {
  @scala.inline
  def apply(_json: Avatar, avatar: Large, name: String, profile: String, steamid: String, username: String): SteamUser = {
    val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], steamid = steamid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SteamUser]
  }
  @scala.inline
  implicit class SteamUserOps[Self <: SteamUser] (val x: Self) extends AnyVal {
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
    def set_json(value: Avatar): Self = this.set("_json", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvatar(value: Large): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def setSteamid(value: String): Self = this.set("steamid", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}

