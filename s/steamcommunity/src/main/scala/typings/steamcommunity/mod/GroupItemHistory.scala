package typings.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupItemHistory extends StObject {
  
  /** Not present on all history types. This is the user who performed the action if user is the receipient of the action. */
  var actor: Any
  
  /** A Date object containing the date and time when this action took place. Since the history page doesn't display any years, the year could possibly be incorrect.. */
  var date: js.Date
  
  /** A string containing the item history type. This is the type displayed on the history page, without spaces. For example, NewMember, InviteSent, etc.. */
  var `type`: String
  
  /**
    * A SteamID object containing the SteamID of the user who either performed or received this action.
    * For example, on NewMember this is the new group member, on InviteSent this is the invite recipient, on NewAnnouncement, this is the author.
    */
  var user: SteamID
}
object GroupItemHistory {
  
  inline def apply(actor: Any, date: js.Date, `type`: String, user: SteamID): GroupItemHistory = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupItemHistory]
  }
  
  extension [Self <: GroupItemHistory](x: Self) {
    
    inline def setActor(value: Any): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUser(value: SteamID): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
