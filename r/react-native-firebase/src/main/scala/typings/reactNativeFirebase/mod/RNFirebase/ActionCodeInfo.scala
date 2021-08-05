package typings.reactNativeFirebase.mod.RNFirebase

import typings.reactNativeFirebase.anon.Email
import typings.reactNativeFirebase.reactNativeFirebaseStrings.EMAIL_SIGNIN
import typings.reactNativeFirebase.reactNativeFirebaseStrings.ERROR
import typings.reactNativeFirebase.reactNativeFirebaseStrings.PASSWORD_RESET
import typings.reactNativeFirebase.reactNativeFirebaseStrings.RECOVER_EMAIL
import typings.reactNativeFirebase.reactNativeFirebaseStrings.VERIFY_EMAIL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionCodeInfo extends StObject {
  
  var data: Email
  
  var operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR
}
object ActionCodeInfo {
  
  inline def apply(data: Email, operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR): ActionCodeInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeInfo]
  }
  
  extension [Self <: ActionCodeInfo](x: Self) {
    
    inline def setData(value: Email): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
