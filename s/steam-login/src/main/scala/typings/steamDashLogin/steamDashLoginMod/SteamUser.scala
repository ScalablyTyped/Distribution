package typings.steamDashLogin.steamDashLoginMod

import typings.steamDashLogin.Anon_Avatar
import typings.steamDashLogin.Anon_Large
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SteamUser extends js.Object {
  var _json: Anon_Avatar
  var avatar: Anon_Large
  var name: String
  var profile: String
  var steamid: String
  var username: String
}

object SteamUser {
  @scala.inline
  def apply(
    _json: Anon_Avatar,
    avatar: Anon_Large,
    name: String,
    profile: String,
    steamid: String,
    username: String
  ): SteamUser = {
    val __obj = js.Dynamic.literal(_json = _json, avatar = avatar, name = name, profile = profile, steamid = steamid, username = username)
  
    __obj.asInstanceOf[SteamUser]
  }
}

