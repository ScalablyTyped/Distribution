package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuickInviteLink extends StObject {
  
  var invite_duration: Double | Null
  
  var invite_limit: Double
  
  var invite_link: String
  
  var invite_token: String
  
  var time_created: js.Date
  
  var valid: Boolean
}
object QuickInviteLink {
  
  inline def apply(
    invite_limit: Double,
    invite_link: String,
    invite_token: String,
    time_created: js.Date,
    valid: Boolean
  ): QuickInviteLink = {
    val __obj = js.Dynamic.literal(invite_limit = invite_limit.asInstanceOf[js.Any], invite_link = invite_link.asInstanceOf[js.Any], invite_token = invite_token.asInstanceOf[js.Any], time_created = time_created.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], invite_duration = null)
    __obj.asInstanceOf[QuickInviteLink]
  }
  
  extension [Self <: QuickInviteLink](x: Self) {
    
    inline def setInvite_duration(value: Double): Self = StObject.set(x, "invite_duration", value.asInstanceOf[js.Any])
    
    inline def setInvite_durationNull: Self = StObject.set(x, "invite_duration", null)
    
    inline def setInvite_limit(value: Double): Self = StObject.set(x, "invite_limit", value.asInstanceOf[js.Any])
    
    inline def setInvite_link(value: String): Self = StObject.set(x, "invite_link", value.asInstanceOf[js.Any])
    
    inline def setInvite_token(value: String): Self = StObject.set(x, "invite_token", value.asInstanceOf[js.Any])
    
    inline def setTime_created(value: js.Date): Self = StObject.set(x, "time_created", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
