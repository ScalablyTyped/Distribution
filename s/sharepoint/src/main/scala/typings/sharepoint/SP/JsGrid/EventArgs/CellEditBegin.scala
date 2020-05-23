package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellEditBegin extends IEventArgs {
  var fieldKey: String
  var recordKey: Double
}

object CellEditBegin {
  @scala.inline
  def apply(fieldKey: String, recordKey: Double): CellEditBegin = {
    val __obj = js.Dynamic.literal(fieldKey = fieldKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellEditBegin]
  }
}

