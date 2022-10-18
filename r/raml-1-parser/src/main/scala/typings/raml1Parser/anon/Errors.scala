package typings.raml1Parser.anon

import typings.raml1Parser.distParserHighLevelASTMod.ValidationIssue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  var errors: js.Array[ValidationIssue]
  
  var value: Any
}
object Errors {
  
  inline def apply(errors: js.Array[ValidationIssue], value: Any): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  
  extension [Self <: Errors](x: Self) {
    
    inline def setErrors(value: js.Array[ValidationIssue]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: ValidationIssue*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
