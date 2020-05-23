package typings.sharepoint.global.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.OnRecordsReordered")
@js.native
class OnRecordsReordered protected ()
  extends typings.sharepoint.SP.JsGrid.EventArgs.OnRecordsReordered {
  def this(recordKeys: js.Array[String], changeKey: IChangeKey) = this()
  /* CompleteClass */
  override var changeKey: IChangeKey = js.native
  /* CompleteClass */
  override var reorderedKeys: js.Array[String] = js.native
}

