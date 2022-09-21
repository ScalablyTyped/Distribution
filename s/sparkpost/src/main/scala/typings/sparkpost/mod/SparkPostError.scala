package typings.sparkpost.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkPostError
  extends StObject
     with Error {
  
  var errors: js.Array[ErrorWithDescription | ErrorWithParam]
  
  @JSName("name")
  var name_SparkPostError: typings.sparkpost.sparkpostStrings.SparkPostError
  
  var statusCode: Double
}
object SparkPostError {
  
  inline def apply(errors: js.Array[ErrorWithDescription | ErrorWithParam], message: String, statusCode: Double): SparkPostError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = "SparkPostError", statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkPostError]
  }
  
  extension [Self <: SparkPostError](x: Self) {
    
    inline def setErrors(value: js.Array[ErrorWithDescription | ErrorWithParam]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: (ErrorWithDescription | ErrorWithParam)*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setName(value: typings.sparkpost.sparkpostStrings.SparkPostError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
