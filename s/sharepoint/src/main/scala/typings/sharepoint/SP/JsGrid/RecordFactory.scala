package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.RecordFactory")
@js.native
class RecordFactory protected () extends js.Object {
  def this(gridFieldMap: js.Any, keyColumnName: String, fnGetPropType: js.Any) = this()
  var gridFieldMap: js.Any = js.native
  /** Create a new record */
  def MakeRecord(dataPropMap: js.Any, localizedPropMap: js.Any, bKeepRawData: Boolean): IRecord = js.native
}

