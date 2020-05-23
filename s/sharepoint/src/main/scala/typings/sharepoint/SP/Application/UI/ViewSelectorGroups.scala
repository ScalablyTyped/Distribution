package typings.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewSelectorGroups extends js.Object {
  var DefaultView: ViewSelectorMenuItem
  var ModeratedViews: js.Any
  var OtherViews: js.Any
  var PersonalViews: js.Any
  var PublicViews: js.Any
  var ViewCreation: js.Any
}

object ViewSelectorGroups {
  @scala.inline
  def apply(
    DefaultView: ViewSelectorMenuItem,
    ModeratedViews: js.Any,
    OtherViews: js.Any,
    PersonalViews: js.Any,
    PublicViews: js.Any,
    ViewCreation: js.Any
  ): ViewSelectorGroups = {
    val __obj = js.Dynamic.literal(DefaultView = DefaultView.asInstanceOf[js.Any], ModeratedViews = ModeratedViews.asInstanceOf[js.Any], OtherViews = OtherViews.asInstanceOf[js.Any], PersonalViews = PersonalViews.asInstanceOf[js.Any], PublicViews = PublicViews.asInstanceOf[js.Any], ViewCreation = ViewCreation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewSelectorGroups]
  }
}

