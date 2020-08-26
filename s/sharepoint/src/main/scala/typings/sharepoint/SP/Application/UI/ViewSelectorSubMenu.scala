package typings.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewSelectorSubMenu extends js.Object {
  var ImageSourceUrl: String = js.native
  var SubMenuItems: js.Any = js.native
  var Text: String = js.native
}

object ViewSelectorSubMenu {
  @scala.inline
  def apply(ImageSourceUrl: String, SubMenuItems: js.Any, Text: String): ViewSelectorSubMenu = {
    val __obj = js.Dynamic.literal(ImageSourceUrl = ImageSourceUrl.asInstanceOf[js.Any], SubMenuItems = SubMenuItems.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewSelectorSubMenu]
  }
  @scala.inline
  implicit class ViewSelectorSubMenuOps[Self <: ViewSelectorSubMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImageSourceUrl(value: String): Self = this.set("ImageSourceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubMenuItems(value: js.Any): Self = this.set("SubMenuItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
  }
  
}

