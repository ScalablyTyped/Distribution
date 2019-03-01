package typings
package steamDashLoginLib.steamDashLoginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SteamUser extends js.Object {
  var _json: steamDashLoginLib.Anon_Avatar
  var avatar: steamDashLoginLib.Anon_Large
  var name: java.lang.String
  var profile: java.lang.String
  var steamid: java.lang.String
  var username: java.lang.String
}

object SteamUser {
  @scala.inline
  def apply(
    _json: steamDashLoginLib.Anon_Avatar,
    avatar: steamDashLoginLib.Anon_Large,
    name: java.lang.String,
    profile: java.lang.String,
    steamid: java.lang.String,
    username: java.lang.String
  ): SteamUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_json")(_json)
    __obj.updateDynamic("avatar")(avatar)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("profile")(profile)
    __obj.updateDynamic("steamid")(steamid)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[SteamUser]
  }
}

