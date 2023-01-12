package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationResult extends StObject {
  
  var message: String
  
  var severity: ValidationResultSeverity
}
object ValidationResult {
  
  inline def apply(message: String, severity: ValidationResultSeverity): ValidationResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidationResult] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: ValidationResultSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
  }
}
