package typings.smallweiAvue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateError extends StObject {
  
  var field: js.UndefOr[String] = js.undefined
  
  var fieldValue: js.UndefOr[Value] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object ValidateError {
  
  inline def apply(): ValidateError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateError] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFieldValue(value: Value): Self = StObject.set(x, "fieldValue", value.asInstanceOf[js.Any])
    
    inline def setFieldValueUndefined: Self = StObject.set(x, "fieldValue", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
