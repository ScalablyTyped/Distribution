package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFieldInfo extends StObject {
  
  var dateOnly: js.UndefOr[Boolean] = js.undefined
  
  var defaultCellStyleId: js.UndefOr[Any] = js.undefined
  
  var editMode: js.UndefOr[EditMode] = js.undefined
  
  var fieldKey: String
  
  var hasDataValue: js.UndefOr[Boolean] = js.undefined
  
  var hasLocalizedValue: js.UndefOr[Boolean] = js.undefined
  
  var multiValue: js.UndefOr[Boolean] = js.undefined
  
  var propertyTypeId: String
  
  var textDirection: js.UndefOr[TextDirection] = js.undefined
}
object IFieldInfo {
  
  inline def apply(fieldKey: String, propertyTypeId: String): IFieldInfo = {
    val __obj = js.Dynamic.literal(fieldKey = fieldKey.asInstanceOf[js.Any], propertyTypeId = propertyTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldInfo]
  }
  
  extension [Self <: IFieldInfo](x: Self) {
    
    inline def setDateOnly(value: Boolean): Self = StObject.set(x, "dateOnly", value.asInstanceOf[js.Any])
    
    inline def setDateOnlyUndefined: Self = StObject.set(x, "dateOnly", js.undefined)
    
    inline def setDefaultCellStyleId(value: Any): Self = StObject.set(x, "defaultCellStyleId", value.asInstanceOf[js.Any])
    
    inline def setDefaultCellStyleIdUndefined: Self = StObject.set(x, "defaultCellStyleId", js.undefined)
    
    inline def setEditMode(value: EditMode): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
    
    inline def setEditModeUndefined: Self = StObject.set(x, "editMode", js.undefined)
    
    inline def setFieldKey(value: String): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
    
    inline def setHasDataValue(value: Boolean): Self = StObject.set(x, "hasDataValue", value.asInstanceOf[js.Any])
    
    inline def setHasDataValueUndefined: Self = StObject.set(x, "hasDataValue", js.undefined)
    
    inline def setHasLocalizedValue(value: Boolean): Self = StObject.set(x, "hasLocalizedValue", value.asInstanceOf[js.Any])
    
    inline def setHasLocalizedValueUndefined: Self = StObject.set(x, "hasLocalizedValue", js.undefined)
    
    inline def setMultiValue(value: Boolean): Self = StObject.set(x, "multiValue", value.asInstanceOf[js.Any])
    
    inline def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
    
    inline def setPropertyTypeId(value: String): Self = StObject.set(x, "propertyTypeId", value.asInstanceOf[js.Any])
    
    inline def setTextDirection(value: TextDirection): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    
    inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
  }
}
