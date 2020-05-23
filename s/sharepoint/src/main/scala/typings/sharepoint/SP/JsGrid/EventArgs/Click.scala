package typings.sharepoint.SP.JsGrid.EventArgs

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.sharepoint.SP.JsGrid.ClickContext
import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Click extends IEventArgs {
  var context: ClickContext
  var eventInfo: DomEvent
  var fieldKey: String
  var recordKey: Double
}

object Click {
  @scala.inline
  def apply(context: ClickContext, eventInfo: DomEvent, fieldKey: String, recordKey: Double): Click = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], eventInfo = eventInfo.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Click]
  }
}

