package typings.steamUser.chatroomMod

import typings.steamUser.steamUserStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ban extends StObject {
  
  var ban_reason: _empty
  
  var steamid: SteamID
  
  var steamid_actor: SteamID
  
  var time_banned: js.Date
}
object Ban {
  
  inline def apply(steamid: SteamID, steamid_actor: SteamID, time_banned: js.Date): Ban = {
    val __obj = js.Dynamic.literal(ban_reason = "", steamid = steamid.asInstanceOf[js.Any], steamid_actor = steamid_actor.asInstanceOf[js.Any], time_banned = time_banned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ban]
  }
  
  extension [Self <: Ban](x: Self) {
    
    inline def setBan_reason(value: _empty): Self = StObject.set(x, "ban_reason", value.asInstanceOf[js.Any])
    
    inline def setSteamid(value: SteamID): Self = StObject.set(x, "steamid", value.asInstanceOf[js.Any])
    
    inline def setSteamid_actor(value: SteamID): Self = StObject.set(x, "steamid_actor", value.asInstanceOf[js.Any])
    
    inline def setTime_banned(value: js.Date): Self = StObject.set(x, "time_banned", value.asInstanceOf[js.Any])
  }
}
