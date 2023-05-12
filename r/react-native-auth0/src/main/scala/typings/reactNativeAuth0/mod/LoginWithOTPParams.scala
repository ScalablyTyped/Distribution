package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginWithOTPParams extends StObject {
  
  var mfaToken: String
  
  var otp: String
}
object LoginWithOTPParams {
  
  inline def apply(mfaToken: String, otp: String): LoginWithOTPParams = {
    val __obj = js.Dynamic.literal(mfaToken = mfaToken.asInstanceOf[js.Any], otp = otp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginWithOTPParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginWithOTPParams] (val x: Self) extends AnyVal {
    
    inline def setMfaToken(value: String): Self = StObject.set(x, "mfaToken", value.asInstanceOf[js.Any])
    
    inline def setOtp(value: String): Self = StObject.set(x, "otp", value.asInstanceOf[js.Any])
  }
}
