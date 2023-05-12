package typings.recurlyRecurlyJs.libApplePayNativeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplePayError extends StObject {
  
  /**
    * The error code for this instance.
    */
  var code: ApplePayErrorCode
  
  /**
    * The field name that contains the error on the payment sheet.
    */
  var contactField: js.UndefOr[ApplePayErrorContactField] = js.undefined
  
  /**
    * A localized, user-facing string that describes the error.
    */
  var message: String
}
object ApplePayError {
  
  inline def apply(code: ApplePayErrorCode, message: String): ApplePayError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: ApplePayErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setContactField(value: ApplePayErrorContactField): Self = StObject.set(x, "contactField", value.asInstanceOf[js.Any])
    
    inline def setContactFieldUndefined: Self = StObject.set(x, "contactField", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
