package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountLimitations extends StObject {
  
  var canInviteFriends: Boolean
  
  var communityBanned: Boolean
  
  var limited: Boolean
  
  var locked: Boolean
}
object AccountLimitations {
  
  inline def apply(canInviteFriends: Boolean, communityBanned: Boolean, limited: Boolean, locked: Boolean): AccountLimitations = {
    val __obj = js.Dynamic.literal(canInviteFriends = canInviteFriends.asInstanceOf[js.Any], communityBanned = communityBanned.asInstanceOf[js.Any], limited = limited.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountLimitations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountLimitations] (val x: Self) extends AnyVal {
    
    inline def setCanInviteFriends(value: Boolean): Self = StObject.set(x, "canInviteFriends", value.asInstanceOf[js.Any])
    
    inline def setCommunityBanned(value: Boolean): Self = StObject.set(x, "communityBanned", value.asInstanceOf[js.Any])
    
    inline def setLimited(value: Boolean): Self = StObject.set(x, "limited", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
  }
}
