package typings.rcFieldForm.interfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleError extends StObject {
  
  var errors: js.Array[String]
  
  var rule: RuleObject
}
object RuleError {
  
  inline def apply(errors: js.Array[String], rule: RuleObject): RuleError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleError]
  }
  
  extension [Self <: RuleError](x: Self) {
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setRule(value: RuleObject): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
