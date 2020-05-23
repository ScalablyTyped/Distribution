package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnEntryRecordCommitted extends IEventArgs {
  var changeKey: IChangeKey
  var originalRecordKey: Double
  var recordKey: Double
}

object OnEntryRecordCommitted {
  @scala.inline
  def apply(changeKey: IChangeKey, originalRecordKey: Double, recordKey: Double): OnEntryRecordCommitted = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any], originalRecordKey = originalRecordKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEntryRecordCommitted]
  }
}

