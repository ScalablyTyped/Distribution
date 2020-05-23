package typings.sharepoint.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowHeaderState extends js.Object {
  def GetId(): String
  def GetImg(): Image
  def GetOnClick(): js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit]
  def GetPriority(): RowHeaderStatePriorities
  def GetTooltip(): String
}

object RowHeaderState {
  @scala.inline
  def apply(
    GetId: () => String,
    GetImg: () => Image,
    GetOnClick: () => js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit],
    GetPriority: () => RowHeaderStatePriorities,
    GetTooltip: () => String
  ): RowHeaderState = {
    val __obj = js.Dynamic.literal(GetId = js.Any.fromFunction0(GetId), GetImg = js.Any.fromFunction0(GetImg), GetOnClick = js.Any.fromFunction0(GetOnClick), GetPriority = js.Any.fromFunction0(GetPriority), GetTooltip = js.Any.fromFunction0(GetTooltip))
    __obj.asInstanceOf[RowHeaderState]
  }
}

