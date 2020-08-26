package typings.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewSelectorGroups extends js.Object {
  var DefaultView: ViewSelectorMenuItem = js.native
  var ModeratedViews: js.Any = js.native
  var OtherViews: js.Any = js.native
  var PersonalViews: js.Any = js.native
  var PublicViews: js.Any = js.native
  var ViewCreation: js.Any = js.native
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
  @scala.inline
  implicit class ViewSelectorGroupsOps[Self <: ViewSelectorGroups] (val x: Self) extends AnyVal {
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
    def setDefaultView(value: ViewSelectorMenuItem): Self = this.set("DefaultView", value.asInstanceOf[js.Any])
    @scala.inline
    def setModeratedViews(value: js.Any): Self = this.set("ModeratedViews", value.asInstanceOf[js.Any])
    @scala.inline
    def setOtherViews(value: js.Any): Self = this.set("OtherViews", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersonalViews(value: js.Any): Self = this.set("PersonalViews", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicViews(value: js.Any): Self = this.set("PublicViews", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewCreation(value: js.Any): Self = this.set("ViewCreation", value.asInstanceOf[js.Any])
  }
  
}

