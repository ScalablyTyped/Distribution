package typings.sharepoint.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowHeaderState extends StObject {
  
  def GetId(): String
  
  def GetImg(): Image
  
  def GetOnClick(): js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit]
  
  def GetPriority(): RowHeaderStatePriorities
  
  def GetTooltip(): String
}
object RowHeaderState {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: RowHeaderState] (val x: Self) extends AnyVal {
    
    inline def setGetId(value: () => String): Self = StObject.set(x, "GetId", js.Any.fromFunction0(value))
    
    inline def setGetImg(value: () => Image): Self = StObject.set(x, "GetImg", js.Any.fromFunction0(value))
    
    inline def setGetOnClick(value: () => js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit]): Self = StObject.set(x, "GetOnClick", js.Any.fromFunction0(value))
    
    inline def setGetPriority(value: () => RowHeaderStatePriorities): Self = StObject.set(x, "GetPriority", js.Any.fromFunction0(value))
    
    inline def setGetTooltip(value: () => String): Self = StObject.set(x, "GetTooltip", js.Any.fromFunction0(value))
  }
}
