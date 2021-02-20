package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxValidationError extends StObject {
  
  var qContext: String = js.native
  
  var qErrorCode: Double = js.native
  
  var qExtendedMessage: String = js.native
}
object NxValidationError {
  
  @scala.inline
  def apply(qContext: String, qErrorCode: Double, qExtendedMessage: String): NxValidationError = {
    val __obj = js.Dynamic.literal(qContext = qContext.asInstanceOf[js.Any], qErrorCode = qErrorCode.asInstanceOf[js.Any], qExtendedMessage = qExtendedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxValidationError]
  }
  
  @scala.inline
  implicit class NxValidationErrorMutableBuilder[Self <: NxValidationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQContext(value: String): Self = StObject.set(x, "qContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQErrorCode(value: Double): Self = StObject.set(x, "qErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQExtendedMessage(value: String): Self = StObject.set(x, "qExtendedMessage", value.asInstanceOf[js.Any])
  }
}
