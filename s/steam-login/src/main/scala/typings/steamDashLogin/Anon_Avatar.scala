package typings.steamDashLogin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Avatar extends js.Object {
  var avatar: String
  var avatarfull: String
  var avatarmedium: String
  var commentpermission: js.UndefOr[Double] = js.undefined
  var communityvisibilitystate: Double
  var gameextrainfo: js.UndefOr[String] = js.undefined
  var gameid: js.UndefOr[String] = js.undefined
  var gameserverip: js.UndefOr[String] = js.undefined
  var lastlogoff: Double
  var loccityid: js.UndefOr[Double] = js.undefined
  var loccountrycode: js.UndefOr[String] = js.undefined
  var locstatecode: js.UndefOr[String] = js.undefined
  var personaname: String
  var personastate: Double
  var primaryclanid: js.UndefOr[String] = js.undefined
  var profilestate: js.UndefOr[Double] = js.undefined
  var profileurl: String
  var realname: js.UndefOr[String] = js.undefined
  var steamid: String
  var timecreated: js.UndefOr[Double] = js.undefined
}

object Anon_Avatar {
  @scala.inline
  def apply(
    avatar: String,
    avatarfull: String,
    avatarmedium: String,
    communityvisibilitystate: Double,
    lastlogoff: Double,
    personaname: String,
    personastate: Double,
    profileurl: String,
    steamid: String,
    commentpermission: Int | Double = null,
    gameextrainfo: String = null,
    gameid: String = null,
    gameserverip: String = null,
    loccityid: Int | Double = null,
    loccountrycode: String = null,
    locstatecode: String = null,
    primaryclanid: String = null,
    profilestate: Int | Double = null,
    realname: String = null,
    timecreated: Int | Double = null
  ): Anon_Avatar = {
    val __obj = js.Dynamic.literal(avatar = avatar, avatarfull = avatarfull, avatarmedium = avatarmedium, communityvisibilitystate = communityvisibilitystate, lastlogoff = lastlogoff, personaname = personaname, personastate = personastate, profileurl = profileurl, steamid = steamid)
    if (commentpermission != null) __obj.updateDynamic("commentpermission")(commentpermission.asInstanceOf[js.Any])
    if (gameextrainfo != null) __obj.updateDynamic("gameextrainfo")(gameextrainfo)
    if (gameid != null) __obj.updateDynamic("gameid")(gameid)
    if (gameserverip != null) __obj.updateDynamic("gameserverip")(gameserverip)
    if (loccityid != null) __obj.updateDynamic("loccityid")(loccityid.asInstanceOf[js.Any])
    if (loccountrycode != null) __obj.updateDynamic("loccountrycode")(loccountrycode)
    if (locstatecode != null) __obj.updateDynamic("locstatecode")(locstatecode)
    if (primaryclanid != null) __obj.updateDynamic("primaryclanid")(primaryclanid)
    if (profilestate != null) __obj.updateDynamic("profilestate")(profilestate.asInstanceOf[js.Any])
    if (realname != null) __obj.updateDynamic("realname")(realname)
    if (timecreated != null) __obj.updateDynamic("timecreated")(timecreated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Avatar]
  }
}

