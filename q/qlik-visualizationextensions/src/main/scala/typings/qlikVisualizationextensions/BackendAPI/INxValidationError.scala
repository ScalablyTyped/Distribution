package typings.qlikVisualizationextensions.BackendAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INxValidationError extends StObject {
  
  /**
    * Context related to the error, from the user app domain.
    * It can be the identifier of an object, a field name, a table name.
    * This parameter is optional.
    * String
    */
  var qContext: String
  
  /**
    * Error code.
    * This parameter is always displayed in case of error.
    * Integer
    */
  var qErrorCode: Double
  
  /**
    * Internal information from the server.
    * This parameter is optional.
    * String
    */
  var qExtendedMessage: String
}
object INxValidationError {
  
  inline def apply(qContext: String, qErrorCode: Double, qExtendedMessage: String): INxValidationError = {
    val __obj = js.Dynamic.literal(qContext = qContext.asInstanceOf[js.Any], qErrorCode = qErrorCode.asInstanceOf[js.Any], qExtendedMessage = qExtendedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxValidationError]
  }
  
  extension [Self <: INxValidationError](x: Self) {
    
    inline def setQContext(value: String): Self = StObject.set(x, "qContext", value.asInstanceOf[js.Any])
    
    inline def setQErrorCode(value: Double): Self = StObject.set(x, "qErrorCode", value.asInstanceOf[js.Any])
    
    inline def setQExtendedMessage(value: String): Self = StObject.set(x, "qExtendedMessage", value.asInstanceOf[js.Any])
  }
}
