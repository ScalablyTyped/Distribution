package typings.sharepoint.SP.JsGrid

import typings.sharepoint.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEditActorCellContext extends js.Object {
  var cellExpandSpace: Bottom
  var column: ColumnInfo
  var field: GridField
  var fieldKey: String
  var originalValue: IValue
  var propType: IPropertyType
  var record: IRecord
  def SetCurrentValue(value: js.Any): Unit
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
}

