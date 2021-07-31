package typings.reactNativeSquareInAppPayments.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppPaymentsException extends StObject {
  
  /** The enumerated error types */
  var code: SQIPErrorCodes
  
  /** Information about error state */
  var debugCode: String
  
  /** A description of the error state */
  var debugMessage: String
  
  /** A description of the usage error */
  var message: String
}
object InAppPaymentsException {
  
  @scala.inline
  def apply(code: SQIPErrorCodes, debugCode: String, debugMessage: String, message: String): InAppPaymentsException = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], debugCode = debugCode.asInstanceOf[js.Any], debugMessage = debugMessage.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InAppPaymentsException]
  }
  
  @scala.inline
  implicit class InAppPaymentsExceptionMutableBuilder[Self <: InAppPaymentsException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: SQIPErrorCodes): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugCode(value: String): Self = StObject.set(x, "debugCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugMessage(value: String): Self = StObject.set(x, "debugMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
