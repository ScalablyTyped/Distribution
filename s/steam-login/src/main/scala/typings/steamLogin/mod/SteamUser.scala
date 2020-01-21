package typings.steamLogin.mod

import typings.steamLogin.AnonAvatar
import typings.steamLogin.AnonLarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SteamUser extends js.Object {
  var _json: AnonAvatar
  var avatar: AnonLarge
  var name: String
  var profile: String
  var steamid: String
  var username: String
}

object SteamUser {
  @scala.inline
  def apply(
    _json: AnonAvatar,
    avatar: AnonLarge,
    name: String,
    profile: String,
    steamid: String,
    username: String
  ): SteamUser = {
    val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], steamid = steamid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SteamUser]
  }
}

