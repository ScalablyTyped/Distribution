package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordDeleted extends IEventArgs {
  var changeKey: IChangeKey
  var recordIdx: Double
  var recordKey: Double
}

object RecordDeleted {
  @scala.inline
  def apply(changeKey: IChangeKey, recordIdx: Double, recordKey: Double): RecordDeleted = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any], recordIdx = recordIdx.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordDeleted]
  }
}

