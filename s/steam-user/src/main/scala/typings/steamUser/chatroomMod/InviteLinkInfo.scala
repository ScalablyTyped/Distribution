package typings.steamUser.chatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InviteLinkInfo extends StObject {
  
  var banned: Boolean
  
  var group_summary: ChatRoomGroupSummary
  
  var invite_code: String
  
  var steamid_sender: SteamID
  
  var time_expires: js.Date | Null
  
  var time_kick_expire: js.Date | Null
}
object InviteLinkInfo {
  
  inline def apply(banned: Boolean, group_summary: ChatRoomGroupSummary, invite_code: String, steamid_sender: SteamID): InviteLinkInfo = {
    val __obj = js.Dynamic.literal(banned = banned.asInstanceOf[js.Any], group_summary = group_summary.asInstanceOf[js.Any], invite_code = invite_code.asInstanceOf[js.Any], steamid_sender = steamid_sender.asInstanceOf[js.Any], time_expires = null, time_kick_expire = null)
    __obj.asInstanceOf[InviteLinkInfo]
  }
  
  extension [Self <: InviteLinkInfo](x: Self) {
    
    inline def setBanned(value: Boolean): Self = StObject.set(x, "banned", value.asInstanceOf[js.Any])
    
    inline def setGroup_summary(value: ChatRoomGroupSummary): Self = StObject.set(x, "group_summary", value.asInstanceOf[js.Any])
    
    inline def setInvite_code(value: String): Self = StObject.set(x, "invite_code", value.asInstanceOf[js.Any])
    
    inline def setSteamid_sender(value: SteamID): Self = StObject.set(x, "steamid_sender", value.asInstanceOf[js.Any])
    
    inline def setTime_expires(value: js.Date): Self = StObject.set(x, "time_expires", value.asInstanceOf[js.Any])
    
    inline def setTime_expiresNull: Self = StObject.set(x, "time_expires", null)
    
    inline def setTime_kick_expire(value: js.Date): Self = StObject.set(x, "time_kick_expire", value.asInstanceOf[js.Any])
    
    inline def setTime_kick_expireNull: Self = StObject.set(x, "time_kick_expire", null)
  }
}
