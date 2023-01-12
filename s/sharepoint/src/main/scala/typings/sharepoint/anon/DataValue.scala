package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataValue extends StObject {
  
  var dataValue: Any
  
  var isValid: Boolean
  
  var normalizedLocValue: String
}
object DataValue {
  
  inline def apply(dataValue: Any, isValid: Boolean, normalizedLocValue: String): DataValue = {
    val __obj = js.Dynamic.literal(dataValue = dataValue.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], normalizedLocValue = normalizedLocValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataValue] (val x: Self) extends AnyVal {
    
    inline def setDataValue(value: Any): Self = StObject.set(x, "dataValue", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setNormalizedLocValue(value: String): Self = StObject.set(x, "normalizedLocValue", value.asInstanceOf[js.Any])
  }
}
