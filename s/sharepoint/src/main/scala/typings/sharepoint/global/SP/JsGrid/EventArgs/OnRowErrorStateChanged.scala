package typings.sharepoint.global.SP.JsGrid.EventArgs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.OnRowErrorStateChanged")
@js.native
class OnRowErrorStateChanged protected ()
  extends typings.sharepoint.SP.JsGrid.EventArgs.OnRowErrorStateChanged {
  def this(
    recordKey: Double,
    bAddingError: Boolean,
    bErrorCurrentlyInRow: Boolean,
    bRowHadError: Boolean,
    errorId: Double,
    message: String
  ) = this()
  /* CompleteClass */
  override var bAddingError: Boolean = js.native
  /* CompleteClass */
  override var bErrorCurrentlyInRow: Boolean = js.native
  /* CompleteClass */
  override var bRowHadError: Boolean = js.native
  /* CompleteClass */
  override var errorId: Double = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var recordKey: Double = js.native
}

