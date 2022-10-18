package typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldError extends StObject {
  
  var errors: js.Array[String]
  
  var name: InternalNamePath
  
  var warnings: js.Array[String]
}
object FieldError {
  
  inline def apply(errors: js.Array[String], name: InternalNamePath, warnings: js.Array[String]): FieldError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldError]
  }
  
  extension [Self <: FieldError](x: Self) {
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setName(value: InternalNamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
