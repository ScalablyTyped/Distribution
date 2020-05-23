package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordFactory extends js.Object {
  var gridFieldMap: js.Any
  /** Create a new record */
  def MakeRecord(dataPropMap: js.Any, localizedPropMap: js.Any, bKeepRawData: Boolean): IRecord
}

object RecordFactory {
  @scala.inline
  def apply(MakeRecord: (js.Any, js.Any, Boolean) => IRecord, gridFieldMap: js.Any): RecordFactory = {
    val __obj = js.Dynamic.literal(MakeRecord = js.Any.fromFunction3(MakeRecord), gridFieldMap = gridFieldMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordFactory]
  }
}

