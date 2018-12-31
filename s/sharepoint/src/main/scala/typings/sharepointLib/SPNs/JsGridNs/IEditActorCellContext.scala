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

