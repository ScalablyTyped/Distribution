package typings.sharepoint.global.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.OnEntryRecordCommitted")
@js.native
class OnEntryRecordCommitted protected ()
  extends typings.sharepoint.SP.JsGrid.EventArgs.OnEntryRecordCommitted {
  def this(origRecKey: String, recordKey: Double, changeKey: IChangeKey) = this()
  /* CompleteClass */
  override var changeKey: IChangeKey = js.native
  /* CompleteClass */
  override var originalRecordKey: Double = js.native
  /* CompleteClass */
  override var recordKey: Double = js.native
}

