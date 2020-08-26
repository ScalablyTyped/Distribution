package typings.steamLogin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avatar extends js.Object {
  var avatar: String = js.native
  var avatarfull: String = js.native
  var avatarmedium: String = js.native
  var commentpermission: js.UndefOr[Double] = js.native
  var communityvisibilitystate: Double = js.native
  var gameextrainfo: js.UndefOr[String] = js.native
  var gameid: js.UndefOr[String] = js.native
  var gameserverip: js.UndefOr[String] = js.native
  var lastlogoff: Double = js.native
  var loccityid: js.UndefOr[Double] = js.native
  var loccountrycode: js.UndefOr[String] = js.native
  var locstatecode: js.UndefOr[String] = js.native
  var personaname: String = js.native
  var personastate: Double = js.native
  var primaryclanid: js.UndefOr[String] = js.native
  var profilestate: js.UndefOr[Double] = js.native
  var profileurl: String = js.native
  var realname: js.UndefOr[String] = js.native
  var steamid: String = js.native
  var timecreated: js.UndefOr[Double] = js.native
}

object Avatar {
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
    steamid: String
  ): Avatar = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], avatarfull = avatarfull.asInstanceOf[js.Any], avatarmedium = avatarmedium.asInstanceOf[js.Any], communityvisibilitystate = communityvisibilitystate.asInstanceOf[js.Any], lastlogoff = lastlogoff.asInstanceOf[js.Any], personaname = personaname.asInstanceOf[js.Any], personastate = personastate.asInstanceOf[js.Any], profileurl = profileurl.asInstanceOf[js.Any], steamid = steamid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
  @scala.inline
  implicit class AvatarOps[Self <: Avatar] (val x: Self) extends AnyVal {
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
    def setAvatar(value: String): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvatarfull(value: String): Self = this.set("avatarfull", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvatarmedium(value: String): Self = this.set("avatarmedium", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommunityvisibilitystate(value: Double): Self = this.set("communityvisibilitystate", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastlogoff(value: Double): Self = this.set("lastlogoff", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersonaname(value: String): Self = this.set("personaname", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersonastate(value: Double): Self = this.set("personastate", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfileurl(value: String): Self = this.set("profileurl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSteamid(value: String): Self = this.set("steamid", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommentpermission(value: Double): Self = this.set("commentpermission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommentpermission: Self = this.set("commentpermission", js.undefined)
    @scala.inline
    def setGameextrainfo(value: String): Self = this.set("gameextrainfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameextrainfo: Self = this.set("gameextrainfo", js.undefined)
    @scala.inline
    def setGameid(value: String): Self = this.set("gameid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameid: Self = this.set("gameid", js.undefined)
    @scala.inline
    def setGameserverip(value: String): Self = this.set("gameserverip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameserverip: Self = this.set("gameserverip", js.undefined)
    @scala.inline
    def setLoccityid(value: Double): Self = this.set("loccityid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoccityid: Self = this.set("loccityid", js.undefined)
    @scala.inline
    def setLoccountrycode(value: String): Self = this.set("loccountrycode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoccountrycode: Self = this.set("loccountrycode", js.undefined)
    @scala.inline
    def setLocstatecode(value: String): Self = this.set("locstatecode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocstatecode: Self = this.set("locstatecode", js.undefined)
    @scala.inline
    def setPrimaryclanid(value: String): Self = this.set("primaryclanid", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryclanid: Self = this.set("primaryclanid", js.undefined)
    @scala.inline
    def setProfilestate(value: Double): Self = this.set("profilestate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfilestate: Self = this.set("profilestate", js.undefined)
    @scala.inline
    def setRealname(value: String): Self = this.set("realname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealname: Self = this.set("realname", js.undefined)
    @scala.inline
    def setTimecreated(value: Double): Self = this.set("timecreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimecreated: Self = this.set("timecreated", js.undefined)
  }
  
}

