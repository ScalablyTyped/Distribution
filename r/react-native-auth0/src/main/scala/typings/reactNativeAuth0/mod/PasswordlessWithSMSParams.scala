package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordlessWithSMSParams extends StObject {
  
  var phoneNumber: String = js.native
}
object PasswordlessWithSMSParams {
  
  @scala.inline
  def apply(phoneNumber: String): PasswordlessWithSMSParams = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordlessWithSMSParams]
  }
  
  @scala.inline
  implicit class PasswordlessWithSMSParamsMutableBuilder[Self <: PasswordlessWithSMSParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
