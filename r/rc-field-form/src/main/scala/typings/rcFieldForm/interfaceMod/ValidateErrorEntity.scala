package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.anon.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateErrorEntity[Values] extends StObject {
  
  var errorFields: js.Array[Errors]
  
  var outOfDate: Boolean
  
  var values: Values
}
object ValidateErrorEntity {
  
  inline def apply[Values](errorFields: js.Array[Errors], outOfDate: Boolean, values: Values): ValidateErrorEntity[Values] = {
    val __obj = js.Dynamic.literal(errorFields = errorFields.asInstanceOf[js.Any], outOfDate = outOfDate.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateErrorEntity[Values]]
  }
  
  extension [Self <: ValidateErrorEntity[?], Values](x: Self & ValidateErrorEntity[Values]) {
    
    inline def setErrorFields(value: js.Array[Errors]): Self = StObject.set(x, "errorFields", value.asInstanceOf[js.Any])
    
    inline def setErrorFieldsVarargs(value: Errors*): Self = StObject.set(x, "errorFields", js.Array(value*))
    
    inline def setOutOfDate(value: Boolean): Self = StObject.set(x, "outOfDate", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Values): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
