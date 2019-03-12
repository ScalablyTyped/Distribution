package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEditActorGridContext extends js.Object {
  var RTL: js.Any
  var bLightFocus: scala.Boolean
  var emptyValue: js.Any
  var jsGridObj: JsGridControl
  var parentNode: stdLib.HTMLElement
  var styleManager: IStyleManager
  def OnKeyDown(domEvent: microsoftDashAjaxLib.SysNs.UINs.DomEvent): scala.Unit
}

object IEditActorGridContext {
  @scala.inline
  def apply(
    OnKeyDown: microsoftDashAjaxLib.SysNs.UINs.DomEvent => scala.Unit,
    RTL: js.Any,
    bLightFocus: scala.Boolean,
    emptyValue: js.Any,
    jsGridObj: JsGridControl,
    parentNode: stdLib.HTMLElement,
    styleManager: IStyleManager
  ): IEditActorGridContext = {
    val __obj = js.Dynamic.literal(OnKeyDown = js.Any.fromFunction1(OnKeyDown), RTL = RTL, bLightFocus = bLightFocus, emptyValue = emptyValue, jsGridObj = jsGridObj, parentNode = parentNode, styleManager = styleManager)
  
    __obj.asInstanceOf[IEditActorGridContext]
  }
}

