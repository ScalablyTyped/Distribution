package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataValue extends StObject {
  
  var dataValue: js.Any
  
  var isValid: Boolean
  
  var normalizedLocValue: String
}
object DataValue {
  
  @scala.inline
  def apply(dataValue: js.Any, isValid: Boolean, normalizedLocValue: String): DataValue = {
    val __obj = js.Dynamic.literal(dataValue = dataValue.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], normalizedLocValue = normalizedLocValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValue]
  }
  
  @scala.inline
  implicit class DataValueMutableBuilder[Self <: DataValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataValue(value: js.Any): Self = StObject.set(x, "dataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedLocValue(value: String): Self = StObject.set(x, "normalizedLocValue", value.asInstanceOf[js.Any])
  }
}
