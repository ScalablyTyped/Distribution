package typings.steamapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerSummary
  extends StObject
     with Player {
  
  var avatar: Avatar
  
  var cityID: js.UndefOr[Double] = js.undefined
  
  var commentPermission: js.UndefOr[Double] = js.undefined
  
  var countryCode: js.UndefOr[String] = js.undefined
  
  var created: js.UndefOr[Double] = js.undefined
  
  /**
    *  Date when this player's account was created.
    */
  val createdAt: js.Date
  
  var gameExtraInfo: js.UndefOr[String] = js.undefined
  
  var gameID: js.UndefOr[String] = js.undefined
  
  var gameServerIP: js.UndefOr[String] = js.undefined
  
  var gameServerSteamID: js.UndefOr[String] = js.undefined
  
  var lastLogOff: js.UndefOr[Double] = js.undefined
  
  /**
    * Date when this player last logged off.
    */
  val lastLogOffAt: js.Date
  
  var nickname: String
  
  var personaState: Double
  
  var personaStateFlags: js.UndefOr[Double] = js.undefined
  
  var primaryGroupID: js.UndefOr[String] = js.undefined
  
  var realName: js.UndefOr[String] = js.undefined
  
  var stateCode: js.UndefOr[String] = js.undefined
  
  var steamID: String
  
  var url: String
  
  var visibilityState: Double
}
object PlayerSummary {
  
  inline def apply(
    avatar: Avatar,
    createdAt: js.Date,
    lastLogOffAt: js.Date,
    nickname: String,
    personaState: Double,
    profileUrl: String,
    steamID: String,
    url: String,
    visibilityState: Double
  ): PlayerSummary = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], lastLogOffAt = lastLogOffAt.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], personaState = personaState.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], steamID = steamID.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], visibilityState = visibilityState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerSummary]
  }
  
  extension [Self <: PlayerSummary](x: Self) {
    
    inline def setAvatar(value: Avatar): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setCityID(value: Double): Self = StObject.set(x, "cityID", value.asInstanceOf[js.Any])
    
    inline def setCityIDUndefined: Self = StObject.set(x, "cityID", js.undefined)
    
    inline def setCommentPermission(value: Double): Self = StObject.set(x, "commentPermission", value.asInstanceOf[js.Any])
    
    inline def setCommentPermissionUndefined: Self = StObject.set(x, "commentPermission", js.undefined)
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setGameExtraInfo(value: String): Self = StObject.set(x, "gameExtraInfo", value.asInstanceOf[js.Any])
    
    inline def setGameExtraInfoUndefined: Self = StObject.set(x, "gameExtraInfo", js.undefined)
    
    inline def setGameID(value: String): Self = StObject.set(x, "gameID", value.asInstanceOf[js.Any])
    
    inline def setGameIDUndefined: Self = StObject.set(x, "gameID", js.undefined)
    
    inline def setGameServerIP(value: String): Self = StObject.set(x, "gameServerIP", value.asInstanceOf[js.Any])
    
    inline def setGameServerIPUndefined: Self = StObject.set(x, "gameServerIP", js.undefined)
    
    inline def setGameServerSteamID(value: String): Self = StObject.set(x, "gameServerSteamID", value.asInstanceOf[js.Any])
    
    inline def setGameServerSteamIDUndefined: Self = StObject.set(x, "gameServerSteamID", js.undefined)
    
    inline def setLastLogOff(value: Double): Self = StObject.set(x, "lastLogOff", value.asInstanceOf[js.Any])
    
    inline def setLastLogOffAt(value: js.Date): Self = StObject.set(x, "lastLogOffAt", value.asInstanceOf[js.Any])
    
    inline def setLastLogOffUndefined: Self = StObject.set(x, "lastLogOff", js.undefined)
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setPersonaState(value: Double): Self = StObject.set(x, "personaState", value.asInstanceOf[js.Any])
    
    inline def setPersonaStateFlags(value: Double): Self = StObject.set(x, "personaStateFlags", value.asInstanceOf[js.Any])
    
    inline def setPersonaStateFlagsUndefined: Self = StObject.set(x, "personaStateFlags", js.undefined)
    
    inline def setPrimaryGroupID(value: String): Self = StObject.set(x, "primaryGroupID", value.asInstanceOf[js.Any])
    
    inline def setPrimaryGroupIDUndefined: Self = StObject.set(x, "primaryGroupID", js.undefined)
    
    inline def setRealName(value: String): Self = StObject.set(x, "realName", value.asInstanceOf[js.Any])
    
    inline def setRealNameUndefined: Self = StObject.set(x, "realName", js.undefined)
    
    inline def setStateCode(value: String): Self = StObject.set(x, "stateCode", value.asInstanceOf[js.Any])
    
    inline def setStateCodeUndefined: Self = StObject.set(x, "stateCode", js.undefined)
    
    inline def setSteamID(value: String): Self = StObject.set(x, "steamID", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVisibilityState(value: Double): Self = StObject.set(x, "visibilityState", value.asInstanceOf[js.Any])
  }
}
