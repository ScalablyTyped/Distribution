package typings.sharepoint.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditControlGridContext
  extends StObject
     with IEditActorGridContext {
  
  def OnActivateActor(): Unit
  
  def OnDeactivateActor(): Unit
}
object IEditControlGridContext {
  
  inline def apply(
    OnActivateActor: () => Unit,
    OnDeactivateActor: () => Unit,
    OnKeyDown: DomEvent => Unit,
    RTL: Any,
    bLightFocus: Boolean,
    emptyValue: Any,
    jsGridObj: JsGridControl,
    parentNode: HTMLElement,
    styleManager: IStyleManager
  ): IEditControlGridContext = {
    val __obj = js.Dynamic.literal(OnActivateActor = js.Any.fromFunction0(OnActivateActor), OnDeactivateActor = js.Any.fromFunction0(OnDeactivateActor), OnKeyDown = js.Any.fromFunction1(OnKeyDown), RTL = RTL.asInstanceOf[js.Any], bLightFocus = bLightFocus.asInstanceOf[js.Any], emptyValue = emptyValue.asInstanceOf[js.Any], jsGridObj = jsGridObj.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], styleManager = styleManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditControlGridContext]
  }
  
  extension [Self <: IEditControlGridContext](x: Self) {
    
    inline def setOnActivateActor(value: () => Unit): Self = StObject.set(x, "OnActivateActor", js.Any.fromFunction0(value))
    
    inline def setOnDeactivateActor(value: () => Unit): Self = StObject.set(x, "OnDeactivateActor", js.Any.fromFunction0(value))
  }
}
