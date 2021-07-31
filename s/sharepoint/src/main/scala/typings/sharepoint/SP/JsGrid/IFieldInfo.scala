package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFieldInfo extends StObject {
  
  var dateOnly: js.UndefOr[Boolean] = js.undefined
  
  var defaultCellStyleId: js.UndefOr[js.Any] = js.undefined
  
  var editMode: js.UndefOr[EditMode] = js.undefined
  
  var fieldKey: String
  
  var hasDataValue: js.UndefOr[Boolean] = js.undefined
  
  var hasLocalizedValue: js.UndefOr[Boolean] = js.undefined
  
  var multiValue: js.UndefOr[Boolean] = js.undefined
  
  var propertyTypeId: String
  
  var textDirection: js.UndefOr[TextDirection] = js.undefined
}
object IFieldInfo {
  
  @scala.inline
  def apply(fieldKey: String, propertyTypeId: String): IFieldInfo = {
    val __obj = js.Dynamic.literal(fieldKey = fieldKey.asInstanceOf[js.Any], propertyTypeId = propertyTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldInfo]
  }
  
  @scala.inline
  implicit class IFieldInfoMutableBuilder[Self <: IFieldInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateOnly(value: Boolean): Self = StObject.set(x, "dateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateOnlyUndefined: Self = StObject.set(x, "dateOnly", js.undefined)
    
    @scala.inline
    def setDefaultCellStyleId(value: js.Any): Self = StObject.set(x, "defaultCellStyleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCellStyleIdUndefined: Self = StObject.set(x, "defaultCellStyleId", js.undefined)
    
    @scala.inline
    def setEditMode(value: EditMode): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditModeUndefined: Self = StObject.set(x, "editMode", js.undefined)
    
    @scala.inline
    def setFieldKey(value: String): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDataValue(value: Boolean): Self = StObject.set(x, "hasDataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDataValueUndefined: Self = StObject.set(x, "hasDataValue", js.undefined)
    
    @scala.inline
    def setHasLocalizedValue(value: Boolean): Self = StObject.set(x, "hasLocalizedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasLocalizedValueUndefined: Self = StObject.set(x, "hasLocalizedValue", js.undefined)
    
    @scala.inline
    def setMultiValue(value: Boolean): Self = StObject.set(x, "multiValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
    
    @scala.inline
    def setPropertyTypeId(value: String): Self = StObject.set(x, "propertyTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDirection(value: TextDirection): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
  }
}
