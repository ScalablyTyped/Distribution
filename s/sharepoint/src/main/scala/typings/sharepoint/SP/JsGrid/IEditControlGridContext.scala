package typings.sharepoint.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IEditControlGridContext extends IEditActorGridContext {
  def OnActivateActor(): Unit = js.native
  def OnDeactivateActor(): Unit = js.native
}

object IEditControlGridContext {
  @scala.inline
  def apply(
    OnActivateActor: () => Unit,
    OnDeactivateActor: () => Unit,
    OnKeyDown: DomEvent => Unit,
    RTL: js.Any,
    bLightFocus: Boolean,
    emptyValue: js.Any,
    jsGridObj: JsGridControl,
    parentNode: HTMLElement,
    styleManager: IStyleManager
  ): IEditControlGridContext = {
    val __obj = js.Dynamic.literal(OnActivateActor = js.Any.fromFunction0(OnActivateActor), OnDeactivateActor = js.Any.fromFunction0(OnDeactivateActor), OnKeyDown = js.Any.fromFunction1(OnKeyDown), RTL = RTL.asInstanceOf[js.Any], bLightFocus = bLightFocus.asInstanceOf[js.Any], emptyValue = emptyValue.asInstanceOf[js.Any], jsGridObj = jsGridObj.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], styleManager = styleManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditControlGridContext]
  }
  @scala.inline
  implicit class IEditControlGridContextOps[Self <: IEditControlGridContext] (val x: Self) extends AnyVal {
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
    def setOnActivateActor(value: () => Unit): Self = this.set("OnActivateActor", js.Any.fromFunction0(value))
    @scala.inline
    def setOnDeactivateActor(value: () => Unit): Self = this.set("OnDeactivateActor", js.Any.fromFunction0(value))
  }
  
}

