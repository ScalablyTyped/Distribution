package typings.sharepoint.SP.JsGrid

import typings.sharepoint.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditActorCellContext extends js.Object {
  
  def SetCurrentValue(value: js.Any): Unit = js.native
  
  var cellExpandSpace: Bottom = js.native
  
  var column: ColumnInfo = js.native
  
  var field: GridField = js.native
  
  var fieldKey: String = js.native
  
  var originalValue: IValue = js.native
  
  var propType: IPropertyType = js.native
  
  var record: IRecord = js.native
}
object IEditActorCellContext {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IEditActorCellContextOps[Self <: IEditActorCellContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSetCurrentValue(value: js.Any => Unit): Self = this.set("SetCurrentValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCellExpandSpace(value: Bottom): Self = this.set("cellExpandSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: ColumnInfo): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: GridField): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldKey(value: String): Self = this.set("fieldKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalValue(value: IValue): Self = this.set("originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropType(value: IPropertyType): Self = this.set("propType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecord(value: IRecord): Self = this.set("record", value.asInstanceOf[js.Any])
  }
}
