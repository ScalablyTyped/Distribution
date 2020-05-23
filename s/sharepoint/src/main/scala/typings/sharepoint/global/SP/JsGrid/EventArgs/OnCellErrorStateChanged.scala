package typings.sharepoint.global.SP.JsGrid.EventArgs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.OnCellErrorStateChanged")
@js.native
class OnCellErrorStateChanged protected ()
  extends typings.sharepoint.SP.JsGrid.EventArgs.OnCellErrorStateChanged {
  def this(
    recordKey: Double,
    fieldKey: String,
    bAddingError: Boolean,
    bCellCurrentlyHasError: Boolean,
    bCellHadError: Boolean,
    errorId: Double
  ) = this()
  /* CompleteClass */
  override var bAddingError: Boolean = js.native
  /* CompleteClass */
  override var bCellCurrentlyHasError: Boolean = js.native
  /* CompleteClass */
  override var bCellHadError: Boolean = js.native
  /* CompleteClass */
  override var errorId: Double = js.native
  /* CompleteClass */
  override var fieldKey: String = js.native
  /* CompleteClass */
  override var recordKey: Double = js.native
}

