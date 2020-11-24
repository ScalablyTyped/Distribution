package typings.sharepoint.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowHeaderState extends js.Object {
  
  def GetId(): String = js.native
  
  def GetImg(): Image = js.native
  
  def GetOnClick(): js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit] = js.native
  
  def GetPriority(): RowHeaderStatePriorities = js.native
  
  def GetTooltip(): String = js.native
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
  
  @scala.inline
  implicit class RowHeaderStateOps[Self <: RowHeaderState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetId(value: () => String): Self = this.set("GetId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetImg(value: () => Image): Self = this.set("GetImg", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOnClick(value: () => js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit]): Self = this.set("GetOnClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPriority(value: () => RowHeaderStatePriorities): Self = this.set("GetPriority", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTooltip(value: () => String): Self = this.set("GetTooltip", js.Any.fromFunction0(value))
  }
}
