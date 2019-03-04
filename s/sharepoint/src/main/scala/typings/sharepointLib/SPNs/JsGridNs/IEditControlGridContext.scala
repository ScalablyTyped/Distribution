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
    OnActivateActor: js.Function0[scala.Unit],
    OnDeactivateActor: js.Function0[scala.Unit],
    OnKeyDown: js.Function1[microsoftDashAjaxLib.SysNs.UINs.DomEvent, scala.Unit],
    RTL: js.Any,
    bLightFocus: scala.Boolean,
    emptyValue: js.Any,
    jsGridObj: JsGridControl,
    parentNode: stdLib.HTMLElement,
    styleManager: IStyleManager
  ): IEditControlGridContext = {
    val __obj = js.Dynamic.literal(OnActivateActor = OnActivateActor, OnDeactivateActor = OnDeactivateActor, OnKeyDown = OnKeyDown, RTL = RTL, bLightFocus = bLightFocus, emptyValue = emptyValue, jsGridObj = jsGridObj, parentNode = parentNode, styleManager = styleManager)
  
    __obj.asInstanceOf[IEditControlGridContext]
  }
}

