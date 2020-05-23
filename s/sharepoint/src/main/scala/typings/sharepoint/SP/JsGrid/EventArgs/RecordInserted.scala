package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordInserted extends IEventArgs {
  var afterRecordKey: Double
  var changeKey: IChangeKey
  var recordIdx: Double
  var recordKey: Double
}

object RecordInserted {
  @scala.inline
  def apply(afterRecordKey: Double, changeKey: IChangeKey, recordIdx: Double, recordKey: Double): RecordInserted = {
    val __obj = js.Dynamic.literal(afterRecordKey = afterRecordKey.asInstanceOf[js.Any], changeKey = changeKey.asInstanceOf[js.Any], recordIdx = recordIdx.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordInserted]
  }
}

