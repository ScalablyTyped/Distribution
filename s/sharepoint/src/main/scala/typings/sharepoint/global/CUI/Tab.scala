package typings.sharepoint.global.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Tab")
@js.native
class Tab protected ()
  extends typings.sharepoint.CUI.Tab {
  // tslint:disable-next-line: parameters-max-number
  def this(
    ribbon: typings.sharepoint.CUI.Ribbon,
    id: String,
    title: String,
    description: String,
    command: String,
    contextual: Boolean,
    contextualGroupId: String,
    cssClass: String
  ) = this()
}

