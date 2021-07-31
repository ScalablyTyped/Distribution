package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneAuthError extends StObject {
  
  var code: String | Null
  
  var message: String | Null
  
  var stack: String | Null
  
  var verificationId: String
}
object PhoneAuthError {
  
  @scala.inline
  def apply(verificationId: String): PhoneAuthError = {
    val __obj = js.Dynamic.literal(verificationId = verificationId.asInstanceOf[js.Any], code = null, message = null, stack = null)
    __obj.asInstanceOf[PhoneAuthError]
  }
  
  @scala.inline
  implicit class PhoneAuthErrorMutableBuilder[Self <: PhoneAuthError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeNull: Self = StObject.set(x, "code", null)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageNull: Self = StObject.set(x, "message", null)
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackNull: Self = StObject.set(x, "stack", null)
    
    @scala.inline
    def setVerificationId(value: String): Self = StObject.set(x, "verificationId", value.asInstanceOf[js.Any])
  }
}
