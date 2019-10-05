package typings.sharepoint.SP.Application.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Application.UI.ViewSelectorMenuBuilder")
@js.native
class ViewSelectorMenuBuilder () extends js.Object

/* static members */
@JSGlobal("SP.Application.UI.ViewSelectorMenuBuilder")
@js.native
object ViewSelectorMenuBuilder extends js.Object {
  def getViewInformation(requestor: ViewInformationRequestor, options: ViewSelectorMenuOptions): Unit = js.native
  def get_filterMenuItemsCallback(): js.Function1[/* menuItems */ js.Any, _] = js.native
  def set_filterMenuItemsCallback(value: js.Function1[/* menuItems */ js.Any, _]): Unit = js.native
  def showMenu(elem: HTMLElement, options: ViewSelectorMenuOptions): Unit = js.native
}

