package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "General Interfaces"
//#region "Response Interfaces"
trait QuickInviteLinkValidity extends StObject {
  
  var invite_duration: Double | Null
  
  var steamid: typings.steamid.mod.^
  
  var valid: Boolean
}
object QuickInviteLinkValidity {
  
  inline def apply(steamid: typings.steamid.mod.^, valid: Boolean): QuickInviteLinkValidity = {
    val __obj = js.Dynamic.literal(steamid = steamid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], invite_duration = null)
    __obj.asInstanceOf[QuickInviteLinkValidity]
  }
  
  extension [Self <: QuickInviteLinkValidity](x: Self) {
    
    inline def setInvite_duration(value: Double): Self = StObject.set(x, "invite_duration", value.asInstanceOf[js.Any])
    
    inline def setInvite_durationNull: Self = StObject.set(x, "invite_duration", null)
    
    inline def setSteamid(value: typings.steamid.mod.^): Self = StObject.set(x, "steamid", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
