package typings.sharepoint.SP.Ribbon

import typings.sharepoint.CUI.Page.PageComponent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Ribbon.WebPartComponent")
@js.native
class WebPartComponent () extends PageComponent {
  def selectWebPart(zc: HTMLElement, setNextRibbonTab: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("SP.Ribbon.WebPartComponent")
@js.native
object WebPartComponent extends js.Object {
  def get_instance(): WebPartComponent = js.native
  def registerWithPageManager(initInfo: WebPartComponentInitInfo): Unit = js.native
}

