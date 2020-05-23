package typings.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewSelectorMenuOptions extends js.Object {
  var listId: String
  var showApproverView: Boolean
  var showCreateView: Boolean
  var showEditView: Boolean
  var showMergeView: Boolean
  var showRepairView: Boolean
  var viewId: String
  var viewParameters: String
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
}

