package typings.sharepoint.global.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.JsGrid.RowHeaderState")
@js.native
class RowHeaderState protected ()
  extends StObject
     with typings.sharepoint.SP.JsGrid.RowHeaderState {
  def this(
    id: String,
    img: typings.sharepoint.SP.JsGrid.Image,
    priority: typings.sharepoint.SP.JsGrid.RowHeaderStatePriorities,
    tooltip: String,
    fnOnClick: js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit]
  ) = this()
  
  /* CompleteClass */
  override def GetId(): String = js.native
  
  /* CompleteClass */
  override def GetImg(): typings.sharepoint.SP.JsGrid.Image = js.native
  
  /* CompleteClass */
  override def GetOnClick(): js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit] = js.native
  
  /* CompleteClass */
  override def GetPriority(): typings.sharepoint.SP.JsGrid.RowHeaderStatePriorities = js.native
  
  /* CompleteClass */
  override def GetTooltip(): String = js.native
}
