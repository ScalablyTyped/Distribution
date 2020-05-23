package typings.sharepoint.global.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.CellEditCompleted")
@js.native
class CellEditCompleted protected ()
  extends typings.sharepoint.SP.JsGrid.EventArgs.CellEditCompleted {
  def this(recordKey: Double, fieldKey: String, changeKey: IChangeKey, bCancelled: Boolean) = this()
  /* CompleteClass */
  override var bCancelled: Boolean = js.native
  /* CompleteClass */
  override var changeKey: IChangeKey = js.native
  /* CompleteClass */
  override var fieldKey: String = js.native
  /* CompleteClass */
  override var recordKey: Double = js.native
}

