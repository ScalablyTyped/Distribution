package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import typings.sharepoint.SP.JsGrid.IPropertyType
import typings.sharepoint.SP.JsGrid.Internal.PropertyUpdate
import typings.sharepoint.SP.JsGrid.ValidationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyChanged
  extends StObject
     with IEventArgs {
  
  var changeKey: IChangeKey
  
  var fieldKey: String
  
  var newProp: PropertyUpdate
  
  var oldProp: PropertyUpdate
  
  var propType: IPropertyType
  
  var recordKey: Double
  
  var validationState: ValidationState
}
object PropertyChanged {
  
  inline def apply(
    changeKey: IChangeKey,
    fieldKey: String,
    newProp: PropertyUpdate,
    oldProp: PropertyUpdate,
    propType: IPropertyType,
    recordKey: Double,
    validationState: ValidationState
  ): PropertyChanged = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], newProp = newProp.asInstanceOf[js.Any], oldProp = oldProp.asInstanceOf[js.Any], propType = propType.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any], validationState = validationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyChanged]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyChanged] (val x: Self) extends AnyVal {
    
    inline def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
    
    inline def setFieldKey(value: String): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
    
    inline def setNewProp(value: PropertyUpdate): Self = StObject.set(x, "newProp", value.asInstanceOf[js.Any])
    
    inline def setOldProp(value: PropertyUpdate): Self = StObject.set(x, "oldProp", value.asInstanceOf[js.Any])
    
    inline def setPropType(value: IPropertyType): Self = StObject.set(x, "propType", value.asInstanceOf[js.Any])
    
    inline def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
    
    inline def setValidationState(value: ValidationState): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
  }
}
