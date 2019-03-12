package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEditControlGridContext extends IEditActorGridContext {
  def OnActivateActor(): scala.Unit
  def OnDeactivateActor(): scala.Unit
}

object IEditControlGridContext {
  @scala.inline
  def apply(
    OnActivateActor: () => scala.Unit,
    OnDeactivateActor: () => scala.Unit,
    OnKeyDown: microsoftDashAjaxLib.SysNs.UINs.DomEvent => scala.Unit,
    RTL: js.Any,
    bLightFocus: scala.Boolean,
    emptyValue: js.Any,
    jsGridObj: JsGridControl,
    parentNode: stdLib.HTMLElement,
    styleManager: IStyleManager
  ): IEditControlGridContext = {
    val __obj = js.Dynamic.literal(OnActivateActor = js.Any.fromFunction0(OnActivateActor), OnDeactivateActor = js.Any.fromFunction0(OnDeactivateActor), OnKeyDown = js.Any.fromFunction1(OnKeyDown), RTL = RTL, bLightFocus = bLightFocus, emptyValue = emptyValue, jsGridObj = jsGridObj, parentNode = parentNode, styleManager = styleManager)
  
    __obj.asInstanceOf[IEditControlGridContext]
  }
}

