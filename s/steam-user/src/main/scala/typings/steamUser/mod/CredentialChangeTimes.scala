package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialChangeTimes extends StObject {
  
  var timestampLastEmailChange: js.Date | Null
  
  var timestampLastPasswordChange: js.Date | Null
  
  var timestampLastPasswordReset: js.Date | Null
}
object CredentialChangeTimes {
  
  inline def apply(): CredentialChangeTimes = {
    val __obj = js.Dynamic.literal(timestampLastEmailChange = null, timestampLastPasswordChange = null, timestampLastPasswordReset = null)
    __obj.asInstanceOf[CredentialChangeTimes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CredentialChangeTimes] (val x: Self) extends AnyVal {
    
    inline def setTimestampLastEmailChange(value: js.Date): Self = StObject.set(x, "timestampLastEmailChange", value.asInstanceOf[js.Any])
    
    inline def setTimestampLastEmailChangeNull: Self = StObject.set(x, "timestampLastEmailChange", null)
    
    inline def setTimestampLastPasswordChange(value: js.Date): Self = StObject.set(x, "timestampLastPasswordChange", value.asInstanceOf[js.Any])
    
    inline def setTimestampLastPasswordChangeNull: Self = StObject.set(x, "timestampLastPasswordChange", null)
    
    inline def setTimestampLastPasswordReset(value: js.Date): Self = StObject.set(x, "timestampLastPasswordReset", value.asInstanceOf[js.Any])
    
    inline def setTimestampLastPasswordResetNull: Self = StObject.set(x, "timestampLastPasswordReset", null)
  }
}
