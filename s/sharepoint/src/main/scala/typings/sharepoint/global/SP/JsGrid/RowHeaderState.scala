package typings.sharepoint.global.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.RowHeaderState")
@js.native
class RowHeaderState protected ()
  extends typings.sharepoint.SP.JsGrid.RowHeaderState {
  def this(
    id: String,
    img: typings.sharepoint.SP.JsGrid.Image,
    priority: typings.sharepoint.SP.JsGrid.RowHeaderStatePriorities,
    tooltip: String,
    fnOnClick: js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit]
  ) = this()
}

