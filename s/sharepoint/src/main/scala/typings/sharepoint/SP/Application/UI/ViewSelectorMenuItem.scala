package typings.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewSelectorMenuItem extends js.Object {
  var ActionScriptText: String
  var Description: String
  var GroupId: Double
  var Id: String
  var ImageSourceUrl: String
  var ItemType: String
  var NavigateUrl: String
  var Sequence: Double
  var Text: String
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
}

