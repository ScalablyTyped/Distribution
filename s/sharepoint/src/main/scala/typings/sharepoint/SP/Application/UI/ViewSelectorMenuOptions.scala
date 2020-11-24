package typings.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewSelectorMenuOptions extends js.Object {
  
  var listId: String = js.native
  
  var showApproverView: Boolean = js.native
  
  var showCreateView: Boolean = js.native
  
  var showEditView: Boolean = js.native
  
  var showMergeView: Boolean = js.native
  
  var showRepairView: Boolean = js.native
  
  var viewId: String = js.native
  
  var viewParameters: String = js.native
}
object ViewSelectorMenuOptions {
  
  @scala.inline
  def apply(
    listId: String,
    showApproverView: Boolean,
    showCreateView: Boolean,
    showEditView: Boolean,
    showMergeView: Boolean,
    showRepairView: Boolean,
    viewId: String,
    viewParameters: String
  ): ViewSelectorMenuOptions = {
    val __obj = js.Dynamic.literal(listId = listId.asInstanceOf[js.Any], showApproverView = showApproverView.asInstanceOf[js.Any], showCreateView = showCreateView.asInstanceOf[js.Any], showEditView = showEditView.asInstanceOf[js.Any], showMergeView = showMergeView.asInstanceOf[js.Any], showRepairView = showRepairView.asInstanceOf[js.Any], viewId = viewId.asInstanceOf[js.Any], viewParameters = viewParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewSelectorMenuOptions]
  }
  
  @scala.inline
  implicit class ViewSelectorMenuOptionsOps[Self <: ViewSelectorMenuOptions] (val x: Self) extends AnyVal {
    
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
    def setListId(value: String): Self = this.set("listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowApproverView(value: Boolean): Self = this.set("showApproverView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCreateView(value: Boolean): Self = this.set("showCreateView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowEditView(value: Boolean): Self = this.set("showEditView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMergeView(value: Boolean): Self = this.set("showMergeView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRepairView(value: Boolean): Self = this.set("showRepairView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewId(value: String): Self = this.set("viewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewParameters(value: String): Self = this.set("viewParameters", value.asInstanceOf[js.Any])
  }
}
