package typings.sharepoint.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditActorGridContext extends StObject {
  
  def OnKeyDown(domEvent: DomEvent): Unit
  
  var RTL: js.Any
  
  var bLightFocus: Boolean
  
  var emptyValue: js.Any
  
  var jsGridObj: JsGridControl
  
  var parentNode: HTMLElement
  
  var styleManager: IStyleManager
}
object IEditActorGridContext {
  
  @scala.inline
  def apply(
    OnKeyDown: DomEvent => Unit,
    RTL: js.Any,
    bLightFocus: Boolean,
    emptyValue: js.Any,
    jsGridObj: JsGridControl,
    parentNode: HTMLElement,
    styleManager: IStyleManager
  ): IEditActorGridContext = {
    val __obj = js.Dynamic.literal(OnKeyDown = js.Any.fromFunction1(OnKeyDown), RTL = RTL.asInstanceOf[js.Any], bLightFocus = bLightFocus.asInstanceOf[js.Any], emptyValue = emptyValue.asInstanceOf[js.Any], jsGridObj = jsGridObj.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], styleManager = styleManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditActorGridContext]
  }
  
  @scala.inline
  implicit class IEditActorGridContextMutableBuilder[Self <: IEditActorGridContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBLightFocus(value: Boolean): Self = StObject.set(x, "bLightFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyValue(value: js.Any): Self = StObject.set(x, "emptyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsGridObj(value: JsGridControl): Self = StObject.set(x, "jsGridObj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyDown(value: DomEvent => Unit): Self = StObject.set(x, "OnKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParentNode(value: HTMLElement): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRTL(value: js.Any): Self = StObject.set(x, "RTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleManager(value: IStyleManager): Self = StObject.set(x, "styleManager", value.asInstanceOf[js.Any])
  }
}
