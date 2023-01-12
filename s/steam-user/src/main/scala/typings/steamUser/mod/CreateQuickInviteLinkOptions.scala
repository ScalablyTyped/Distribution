package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQuickInviteLinkOptions extends StObject {
  
  var inviteDuration: js.UndefOr[Double | Null] = js.undefined
  
  var inviteLimit: js.UndefOr[Double] = js.undefined
}
object CreateQuickInviteLinkOptions {
  
  inline def apply(): CreateQuickInviteLinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQuickInviteLinkOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateQuickInviteLinkOptions] (val x: Self) extends AnyVal {
    
    inline def setInviteDuration(value: Double): Self = StObject.set(x, "inviteDuration", value.asInstanceOf[js.Any])
    
    inline def setInviteDurationNull: Self = StObject.set(x, "inviteDuration", null)
    
    inline def setInviteDurationUndefined: Self = StObject.set(x, "inviteDuration", js.undefined)
    
    inline def setInviteLimit(value: Double): Self = StObject.set(x, "inviteLimit", value.asInstanceOf[js.Any])
    
    inline def setInviteLimitUndefined: Self = StObject.set(x, "inviteLimit", js.undefined)
  }
}
