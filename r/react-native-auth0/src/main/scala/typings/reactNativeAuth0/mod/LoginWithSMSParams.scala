package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginWithSMSParams extends StObject {
  
  var audience: js.UndefOr[String] = js.undefined
  
  var code: String
  
  var phoneNumber: String
  
  var scope: js.UndefOr[String] = js.undefined
}
object LoginWithSMSParams {
  
  inline def apply(code: String, phoneNumber: String): LoginWithSMSParams = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginWithSMSParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginWithSMSParams] (val x: Self) extends AnyVal {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
