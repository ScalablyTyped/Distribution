package typings.steamUser.componentsChatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupInviteLinks extends StObject {
  
  var chat_id: String
  
  var invite_code: String
  
  var invite_url: String
  
  var steamid_creator: SteamID
  
  var time_expires: js.Date | Null
}
object GroupInviteLinks {
  
  inline def apply(chat_id: String, invite_code: String, invite_url: String, steamid_creator: SteamID): GroupInviteLinks = {
    val __obj = js.Dynamic.literal(chat_id = chat_id.asInstanceOf[js.Any], invite_code = invite_code.asInstanceOf[js.Any], invite_url = invite_url.asInstanceOf[js.Any], steamid_creator = steamid_creator.asInstanceOf[js.Any], time_expires = null)
    __obj.asInstanceOf[GroupInviteLinks]
  }
  
  extension [Self <: GroupInviteLinks](x: Self) {
    
    inline def setChat_id(value: String): Self = StObject.set(x, "chat_id", value.asInstanceOf[js.Any])
    
    inline def setInvite_code(value: String): Self = StObject.set(x, "invite_code", value.asInstanceOf[js.Any])
    
    inline def setInvite_url(value: String): Self = StObject.set(x, "invite_url", value.asInstanceOf[js.Any])
    
    inline def setSteamid_creator(value: SteamID): Self = StObject.set(x, "steamid_creator", value.asInstanceOf[js.Any])
    
    inline def setTime_expires(value: js.Date): Self = StObject.set(x, "time_expires", value.asInstanceOf[js.Any])
    
    inline def setTime_expiresNull: Self = StObject.set(x, "time_expires", null)
  }
}
