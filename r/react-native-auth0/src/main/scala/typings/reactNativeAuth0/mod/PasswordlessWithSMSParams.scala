package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordlessWithSMSParams extends StObject {
  
  var phoneNumber: String
}
object PasswordlessWithSMSParams {
  
  inline def apply(phoneNumber: String): PasswordlessWithSMSParams = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordlessWithSMSParams]
  }
  
  extension [Self <: PasswordlessWithSMSParams](x: Self) {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
