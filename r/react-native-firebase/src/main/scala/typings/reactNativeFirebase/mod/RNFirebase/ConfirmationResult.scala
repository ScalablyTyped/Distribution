package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmationResult extends StObject {
  
  def confirm(verificationCode: String): js.Promise[User | Null]
  
  var verificationId: String | Null
}
object ConfirmationResult {
  
  inline def apply(confirm: String => js.Promise[User | Null]): ConfirmationResult = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction1(confirm), verificationId = null)
    __obj.asInstanceOf[ConfirmationResult]
  }
  
  extension [Self <: ConfirmationResult](x: Self) {
    
    inline def setConfirm(value: String => js.Promise[User | Null]): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
    
    inline def setVerificationId(value: String): Self = StObject.set(x, "verificationId", value.asInstanceOf[js.Any])
    
    inline def setVerificationIdNull: Self = StObject.set(x, "verificationId", null)
  }
}
