package typings.sharepoint.SPNs.JsGridNs

import typings.microsoftDashAjax.SysNs.UINs.DomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEditActorGridContext extends js.Object {
  var RTL: js.Any
  var bLightFocus: Boolean
  var emptyValue: js.Any
  var jsGridObj: JsGridControl
  var parentNode: HTMLElement
  var styleManager: IStyleManager
  def OnKeyDown(domEvent: DomEvent): Unit
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
    val __obj = js.Dynamic.literal(OnKeyDown = js.Any.fromFunction1(OnKeyDown), RTL = RTL, bLightFocus = bLightFocus, emptyValue = emptyValue, jsGridObj = jsGridObj, parentNode = parentNode, styleManager = styleManager)
  
    __obj.asInstanceOf[IEditActorGridContext]
  }
}

