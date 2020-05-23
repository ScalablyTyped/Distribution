package typings.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewSelectorSubMenu extends js.Object {
  var ImageSourceUrl: String
  var SubMenuItems: js.Any
  var Text: String
}

object ViewSelectorSubMenu {
  @scala.inline
  def apply(ImageSourceUrl: String, SubMenuItems: js.Any, Text: String): ViewSelectorSubMenu = {
    val __obj = js.Dynamic.literal(ImageSourceUrl = ImageSourceUrl.asInstanceOf[js.Any], SubMenuItems = SubMenuItems.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewSelectorSubMenu]
  }
}

