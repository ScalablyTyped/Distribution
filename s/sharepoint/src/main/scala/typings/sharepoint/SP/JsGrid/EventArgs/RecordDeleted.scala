package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.RecordDeleted")
@js.native
class RecordDeleted protected () extends IEventArgs {
  def this(recordKey: Double, recordIdx: Double, changeKey: IChangeKey) = this()
  var changeKey: IChangeKey = js.native
  var recordIdx: Double = js.native
  var recordKey: Double = js.native
}

