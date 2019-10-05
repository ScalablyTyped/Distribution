package typings.sharepoint.SP.JsGrid

import typings.microsoftDashAjax.Sys.UI.DomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.RowHeaderState")
@js.native
class RowHeaderState protected () extends js.Object {
  def this(
    id: String,
    img: Image,
    priority: RowHeaderStatePriorities,
    tooltip: String,
    fnOnClick: js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit]
  ) = this()
  def GetId(): String = js.native
  def GetImg(): Image = js.native
  def GetOnClick(): js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit] = js.native
  def GetPriority(): RowHeaderStatePriorities = js.native
  def GetTooltip(): String = js.native
}

