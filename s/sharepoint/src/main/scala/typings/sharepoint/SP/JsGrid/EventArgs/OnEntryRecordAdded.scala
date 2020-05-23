package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnEntryRecordAdded extends IEventArgs {
  var recordKey: Double
}

object OnEntryRecordAdded {
  @scala.inline
  def apply(recordKey: Double): OnEntryRecordAdded = {
    val __obj = js.Dynamic.literal(recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEntryRecordAdded]
  }
}

