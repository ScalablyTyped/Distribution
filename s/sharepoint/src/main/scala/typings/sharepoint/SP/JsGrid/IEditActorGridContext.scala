package typings.sharepoint.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditActorGridContext extends js.Object {
  
  def OnKeyDown(domEvent: DomEvent): Unit = js.native
  
  var RTL: js.Any = js.native
  
  var bLightFocus: Boolean = js.native
  
  var emptyValue: js.Any = js.native
  
  var jsGridObj: JsGridControl = js.native
  
  var parentNode: HTMLElement = js.native
  
  var styleManager: IStyleManager = js.native
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
  implicit class IEditActorGridContextOps[Self <: IEditActorGridContext] (val x: Self) extends AnyVal {
    
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
    def setOnKeyDown(value: DomEvent => Unit): Self = this.set("OnKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRTL(value: js.Any): Self = this.set("RTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBLightFocus(value: Boolean): Self = this.set("bLightFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyValue(value: js.Any): Self = this.set("emptyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsGridObj(value: JsGridControl): Self = this.set("jsGridObj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNode(value: HTMLElement): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleManager(value: IStyleManager): Self = this.set("styleManager", value.asInstanceOf[js.Any])
  }
}
