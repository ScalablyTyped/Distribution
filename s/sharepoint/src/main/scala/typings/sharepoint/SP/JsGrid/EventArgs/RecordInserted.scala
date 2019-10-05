package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.RecordInserted")
@js.native
class RecordInserted protected () extends IEventArgs {
  def this(recordKey: Double, recordIdx: Double, afterRecordKey: Double, changeKey: IChangeKey) = this()
  var afterRecordKey: Double = js.native
  var changeKey: IChangeKey = js.native
  var recordIdx: Double = js.native
  var recordKey: Double = js.native
}

