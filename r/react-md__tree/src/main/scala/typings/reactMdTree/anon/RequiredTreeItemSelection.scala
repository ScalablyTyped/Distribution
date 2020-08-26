package typings.reactMdTree.anon

import typings.reactMdTree.typesMod.SelectedIds
import typings.reactMdTree.typesMod.TreeItemId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<@react-md/tree.@react-md/tree/types/types.TreeItemSelection> */
@js.native
trait RequiredTreeItemSelection extends js.Object {
  var multiSelect: Boolean = js.native
  var onItemSelect: js.Function1[/* itemId */ TreeItemId, Unit] = js.native
  var onMultiItemSelect: js.Function1[/* itemIds */ SelectedIds, Unit] = js.native
  var selectedIds: SelectedIds = js.native
}

object RequiredTreeItemSelection {
  @scala.inline
  def apply(
    multiSelect: Boolean,
    onItemSelect: /* itemId */ TreeItemId => Unit,
    onMultiItemSelect: /* itemIds */ SelectedIds => Unit,
    selectedIds: SelectedIds
  ): RequiredTreeItemSelection = {
    val __obj = js.Dynamic.literal(multiSelect = multiSelect.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction1(onItemSelect), onMultiItemSelect = js.Any.fromFunction1(onMultiItemSelect), selectedIds = selectedIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredTreeItemSelection]
  }
  @scala.inline
  implicit class RequiredTreeItemSelectionOps[Self <: RequiredTreeItemSelection] (val x: Self) extends AnyVal {
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
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnItemSelect(value: /* itemId */ TreeItemId => Unit): Self = this.set("onItemSelect", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMultiItemSelect(value: /* itemIds */ SelectedIds => Unit): Self = this.set("onMultiItemSelect", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectedIdsVarargs(value: TreeItemId*): Self = this.set("selectedIds", js.Array(value :_*))
    @scala.inline
    def setSelectedIds(value: SelectedIds): Self = this.set("selectedIds", value.asInstanceOf[js.Any])
  }
  
}

