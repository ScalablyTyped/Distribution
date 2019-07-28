package typings.sharepoint.SPNs.JsGridNs.EventArgsNs

import typings.sharepoint.SPNs.JsGridNs.IChangeKey
import typings.sharepoint.SPNs.JsGridNs.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.OnEntryRecordCommitted")
@js.native
class OnEntryRecordCommitted protected () extends IEventArgs {
  def this(origRecKey: String, recordKey: Double, changeKey: IChangeKey) = this()
  var changeKey: IChangeKey = js.native
  var originalRecordKey: Double = js.native
  var recordKey: Double = js.native
}

