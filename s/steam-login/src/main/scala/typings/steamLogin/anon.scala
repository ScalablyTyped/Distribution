package typings.steamLogin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Avatar extends StObject {
    
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
    implicit class AvatarMutableBuilder[Self <: Avatar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarfull(value: String): Self = StObject.set(x, "avatarfull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarmedium(value: String): Self = StObject.set(x, "avatarmedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentpermission(value: Double): Self = StObject.set(x, "commentpermission", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentpermissionUndefined: Self = StObject.set(x, "commentpermission", js.undefined)
      
      @scala.inline
      def setCommunityvisibilitystate(value: Double): Self = StObject.set(x, "communityvisibilitystate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameextrainfo(value: String): Self = StObject.set(x, "gameextrainfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameextrainfoUndefined: Self = StObject.set(x, "gameextrainfo", js.undefined)
      
      @scala.inline
      def setGameid(value: String): Self = StObject.set(x, "gameid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameidUndefined: Self = StObject.set(x, "gameid", js.undefined)
      
      @scala.inline
      def setGameserverip(value: String): Self = StObject.set(x, "gameserverip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameserveripUndefined: Self = StObject.set(x, "gameserverip", js.undefined)
      
      @scala.inline
      def setLastlogoff(value: Double): Self = StObject.set(x, "lastlogoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoccityid(value: Double): Self = StObject.set(x, "loccityid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoccityidUndefined: Self = StObject.set(x, "loccityid", js.undefined)
      
      @scala.inline
      def setLoccountrycode(value: String): Self = StObject.set(x, "loccountrycode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoccountrycodeUndefined: Self = StObject.set(x, "loccountrycode", js.undefined)
      
      @scala.inline
      def setLocstatecode(value: String): Self = StObject.set(x, "locstatecode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocstatecodeUndefined: Self = StObject.set(x, "locstatecode", js.undefined)
      
      @scala.inline
      def setPersonaname(value: String): Self = StObject.set(x, "personaname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonastate(value: Double): Self = StObject.set(x, "personastate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryclanid(value: String): Self = StObject.set(x, "primaryclanid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryclanidUndefined: Self = StObject.set(x, "primaryclanid", js.undefined)
      
      @scala.inline
      def setProfilestate(value: Double): Self = StObject.set(x, "profilestate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfilestateUndefined: Self = StObject.set(x, "profilestate", js.undefined)
      
      @scala.inline
      def setProfileurl(value: String): Self = StObject.set(x, "profileurl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealname(value: String): Self = StObject.set(x, "realname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealnameUndefined: Self = StObject.set(x, "realname", js.undefined)
      
      @scala.inline
      def setSteamid(value: String): Self = StObject.set(x, "steamid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimecreated(value: Double): Self = StObject.set(x, "timecreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimecreatedUndefined: Self = StObject.set(x, "timecreated", js.undefined)
    }
  }
  
  trait Large extends StObject {
    
    var large: String
    
    var medium: String
    
    var small: String
  }
  object Large {
    
    @scala.inline
    def apply(large: String, medium: String, small: String): Large = {
      val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
      __obj.asInstanceOf[Large]
    }
    
    @scala.inline
    implicit class LargeMutableBuilder[Self <: Large] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLarge(value: String): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    }
  }
}
