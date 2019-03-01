package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEditActorCellContext extends js.Object {
  var cellExpandSpace: sharepointLib.Anon_Bottom
  var column: ColumnInfo
  var field: GridField
  var fieldKey: java.lang.String
  var originalValue: IValue
  var propType: IPropertyType
  var record: IRecord
  def SetCurrentValue(value: js.Any): scala.Unit
}

object IEditActorCellContext {
  @scala.inline
  def apply(
    SetCurrentValue: js.Function1[js.Any, scala.Unit],
    cellExpandSpace: sharepointLib.Anon_Bottom,
    column: ColumnInfo,
    field: GridField,
    fieldKey: java.lang.String,
    originalValue: IValue,
    propType: IPropertyType,
    record: IRecord
  ): IEditActorCellContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SetCurrentValue")(SetCurrentValue)
    __obj.updateDynamic("cellExpandSpace")(cellExpandSpace)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("fieldKey")(fieldKey)
    __obj.updateDynamic("originalValue")(originalValue)
    __obj.updateDynamic("propType")(propType)
    __obj.updateDynamic("record")(record)
    __obj.asInstanceOf[IEditActorCellContext]
  }
}

