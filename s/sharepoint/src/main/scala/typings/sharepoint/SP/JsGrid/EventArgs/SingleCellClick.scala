package typings.sharepoint.SP.JsGrid.EventArgs

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleCellClick extends IEventArgs {
  var eventInfo: DomEvent
  var fieldKey: String
  var recordKey: Double
}

object SingleCellClick {
  @scala.inline
  def apply(eventInfo: DomEvent, fieldKey: String, recordKey: Double): SingleCellClick = {
    val __obj = js.Dynamic.literal(eventInfo = eventInfo.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleCellClick]
  }
}

