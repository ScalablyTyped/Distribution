package typings.sharepoint.global.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.RecordInserted")
@js.native
class RecordInserted protected ()
  extends typings.sharepoint.SP.JsGrid.EventArgs.RecordInserted {
  def this(recordKey: Double, recordIdx: Double, afterRecordKey: Double, changeKey: IChangeKey) = this()
  /* CompleteClass */
  override var afterRecordKey: Double = js.native
  /* CompleteClass */
  override var changeKey: IChangeKey = js.native
  /* CompleteClass */
  override var recordIdx: Double = js.native
  /* CompleteClass */
  override var recordKey: Double = js.native
}

