package typings.sharepoint.SP.JsGrid

import typings.microsoftDashAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEditControlGridContext extends IEditActorGridContext {
  def OnActivateActor(): Unit
  def OnDeactivateActor(): Unit
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
}

