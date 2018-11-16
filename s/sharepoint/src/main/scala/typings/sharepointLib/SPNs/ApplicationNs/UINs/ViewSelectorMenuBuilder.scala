package typings
package sharepointLib.SPNs.ApplicationNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Application.UI.ViewSelectorMenuBuilder")
@js.native
class ViewSelectorMenuBuilder () extends js.Object

@JSGlobal("SP.Application.UI.ViewSelectorMenuBuilder")
@js.native
object ViewSelectorMenuBuilder extends js.Object {
  def getViewInformation(
    requestor: sharepointLib.SPNs.ApplicationNs.UINs.ViewInformationRequestor,
    options: sharepointLib.SPNs.ApplicationNs.UINs.ViewSelectorMenuOptions
  ): scala.Unit = js.native
  def get_filterMenuItemsCallback(): js.Function1[/* menuItems */ js.Any, _] = js.native
  def set_filterMenuItemsCallback(value: js.Function1[/* menuItems */ js.Any, _]): scala.Unit = js.native
  def showMenu(elem: stdLib.HTMLElement, options: sharepointLib.SPNs.ApplicationNs.UINs.ViewSelectorMenuOptions): scala.Unit = js.native
}

