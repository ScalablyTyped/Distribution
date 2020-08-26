package typings.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewSelectorMenuItem extends js.Object {
  var ActionScriptText: String = js.native
  var Description: String = js.native
  var GroupId: Double = js.native
  var Id: String = js.native
  var ImageSourceUrl: String = js.native
  var ItemType: String = js.native
  var NavigateUrl: String = js.native
  var Sequence: Double = js.native
  var Text: String = js.native
}

object ViewSelectorMenuItem {
  @scala.inline
  def apply(
    ActionScriptText: String,
    Description: String,
    GroupId: Double,
    Id: String,
    ImageSourceUrl: String,
    ItemType: String,
    NavigateUrl: String,
    Sequence: Double,
    Text: String
  ): ViewSelectorMenuItem = {
    val __obj = js.Dynamic.literal(ActionScriptText = ActionScriptText.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ImageSourceUrl = ImageSourceUrl.asInstanceOf[js.Any], ItemType = ItemType.asInstanceOf[js.Any], NavigateUrl = NavigateUrl.asInstanceOf[js.Any], Sequence = Sequence.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewSelectorMenuItem]
  }
  @scala.inline
  implicit class ViewSelectorMenuItemOps[Self <: ViewSelectorMenuItem] (val x: Self) extends AnyVal {
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
    def setActionScriptText(value: String): Self = this.set("ActionScriptText", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupId(value: Double): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageSourceUrl(value: String): Self = this.set("ImageSourceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemType(value: String): Self = this.set("ItemType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigateUrl(value: String): Self = this.set("NavigateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequence(value: Double): Self = this.set("Sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
  }
  
}

