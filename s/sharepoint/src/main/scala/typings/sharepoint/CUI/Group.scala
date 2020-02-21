package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Group")
@js.native
class Group protected () extends RibbonComponent {
  def this(
    ribbon: Ribbon,
    id: String,
    title: String,
    description: String,
    command: String,
    properties: ControlProperties
  ) = this()
  def selectLayout(layoutType: String, popupLayoutTitle: String): scala.Unit = js.native
  def unselectLayout(): scala.Unit = js.native
}

