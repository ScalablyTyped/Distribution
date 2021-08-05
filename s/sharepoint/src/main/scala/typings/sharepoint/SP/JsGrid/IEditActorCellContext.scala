package typings.sharepoint.SP.JsGrid

import typings.sharepoint.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditActorCellContext extends StObject {
  
  def SetCurrentValue(value: js.Any): Unit
  
  var cellExpandSpace: Bottom
  
  var column: ColumnInfo
  
  var field: GridField
  
  var fieldKey: String
  
  var originalValue: IValue
  
  var propType: IPropertyType
  
  var record: IRecord
}
object IEditActorCellContext {
  
  inline def apply(
    SetCurrentValue: js.Any => Unit,
    cellExpandSpace: Bottom,
    column: ColumnInfo,
    field: GridField,
    fieldKey: String,
    originalValue: IValue,
    propType: IPropertyType,
    record: IRecord
  ): IEditActorCellContext = {
    val __obj = js.Dynamic.literal(SetCurrentValue = js.Any.fromFunction1(SetCurrentValue), cellExpandSpace = cellExpandSpace.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], propType = propType.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditActorCellContext]
  }
  
  extension [Self <: IEditActorCellContext](x: Self) {
    
    inline def setCellExpandSpace(value: Bottom): Self = StObject.set(x, "cellExpandSpace", value.asInstanceOf[js.Any])
    
    inline def setColumn(value: ColumnInfo): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setField(value: GridField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldKey(value: String): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
    
    inline def setOriginalValue(value: IValue): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setPropType(value: IPropertyType): Self = StObject.set(x, "propType", value.asInstanceOf[js.Any])
    
    inline def setRecord(value: IRecord): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    inline def setSetCurrentValue(value: js.Any => Unit): Self = StObject.set(x, "SetCurrentValue", js.Any.fromFunction1(value))
  }
}
