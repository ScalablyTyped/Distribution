package typings.steamLogin.mod

import typings.steamLogin.anon.Avatar
import typings.steamLogin.anon.Large
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SteamUser extends js.Object {
  var _json: Avatar
  var avatar: Large
  var name: String
  var profile: String
  var steamid: String
  var username: String
}

object SteamUser {
  @scala.inline
  def apply(_json: Avatar, avatar: Large, name: String, profile: String, steamid: String, username: String): SteamUser = {
    val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], steamid = steamid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SteamUser]
  }
}

