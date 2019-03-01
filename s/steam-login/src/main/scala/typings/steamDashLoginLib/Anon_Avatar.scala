package typings
package steamDashLoginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Avatar extends js.Object {
  var avatar: java.lang.String
  var avatarfull: java.lang.String
  var avatarmedium: java.lang.String
  var commentpermission: js.UndefOr[scala.Double] = js.undefined
  var communityvisibilitystate: scala.Double
  var gameextrainfo: js.UndefOr[java.lang.String] = js.undefined
  var gameid: js.UndefOr[java.lang.String] = js.undefined
  var gameserverip: js.UndefOr[java.lang.String] = js.undefined
  var lastlogoff: scala.Double
  var loccityid: js.UndefOr[scala.Double] = js.undefined
  var loccountrycode: js.UndefOr[java.lang.String] = js.undefined
  var locstatecode: js.UndefOr[java.lang.String] = js.undefined
  var personaname: java.lang.String
  var personastate: scala.Double
  var primaryclanid: js.UndefOr[java.lang.String] = js.undefined
  var profilestate: js.UndefOr[scala.Double] = js.undefined
  var profileurl: java.lang.String
  var realname: js.UndefOr[java.lang.String] = js.undefined
  var steamid: java.lang.String
  var timecreated: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Avatar {
  @scala.inline
  def apply(
    avatar: java.lang.String,
    avatarfull: java.lang.String,
    avatarmedium: java.lang.String,
    communityvisibilitystate: scala.Double,
    lastlogoff: scala.Double,
    personaname: java.lang.String,
    personastate: scala.Double,
    profileurl: java.lang.String,
    steamid: java.lang.String,
    commentpermission: scala.Int | scala.Double = null,
    gameextrainfo: java.lang.String = null,
    gameid: java.lang.String = null,
    gameserverip: java.lang.String = null,
    loccityid: scala.Int | scala.Double = null,
    loccountrycode: java.lang.String = null,
    locstatecode: java.lang.String = null,
    primaryclanid: java.lang.String = null,
    profilestate: scala.Int | scala.Double = null,
    realname: java.lang.String = null,
    timecreated: scala.Int | scala.Double = null
  ): Anon_Avatar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avatar")(avatar)
    __obj.updateDynamic("avatarfull")(avatarfull)
    __obj.updateDynamic("avatarmedium")(avatarmedium)
    __obj.updateDynamic("communityvisibilitystate")(communityvisibilitystate)
    __obj.updateDynamic("lastlogoff")(lastlogoff)
    __obj.updateDynamic("personaname")(personaname)
    __obj.updateDynamic("personastate")(personastate)
    __obj.updateDynamic("profileurl")(profileurl)
    __obj.updateDynamic("steamid")(steamid)
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

