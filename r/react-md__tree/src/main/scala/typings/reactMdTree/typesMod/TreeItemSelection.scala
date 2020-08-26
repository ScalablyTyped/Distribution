package typings.reactMdTree.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeItemSelection extends js.Object {
  /**
    * Boolean if multiple items within the tree can be selected at once.
    */
  var multiSelect: js.UndefOr[Boolean] = js.native
  /**
    * The list of selected ids within the tree. If you only want to allow a
    * single item to be selected at a time within a tree, keep this as either an
    * empty list (no selections) or a single `itemId`.
    */
  var selectedIds: SelectedIds = js.native
  /**
    * A function to call that will update the `selectedIds` to include `itemId`
    * of the newly selected tree item. This will be triggered when:
    *
    * - the user clicks a tree item with mouse or touch
    * - user presses the space or enter key while keyboard focusing a tree item
    *
    * Note: If you are using the `useTreeItemSelection` hook, this will always
    * cause the `selectedIds` to be a list of just the selected `itemId` unless
    * the `multiSelect` (second argument) is enabled.
    */
  def onItemSelect(itemId: TreeItemId): Unit = js.native
  /**
    * A function to  call that will update the `selectedIds` for "batch"
    * selection updates. This will always be called with a unique list of
    * `itemId`s that contained the previous `itemId`s including the new
    * `itemId`s. This will only be called when the `multiSelect` prop has been
    * enabled and:
    *
    * - the user `Shift + Click`s items within the tree
    * - triggers "select-to" keyboard functionality with `Control+Shift+Home` or
    *   `Control+Shift+End`
    */
  def onMultiItemSelect(itemIds: SelectedIds): Unit = js.native
}

object TreeItemSelection {
  @scala.inline
  def apply(onItemSelect: TreeItemId => Unit, onMultiItemSelect: SelectedIds => Unit, selectedIds: SelectedIds): TreeItemSelection = {
    val __obj = js.Dynamic.literal(onItemSelect = js.Any.fromFunction1(onItemSelect), onMultiItemSelect = js.Any.fromFunction1(onMultiItemSelect), selectedIds = selectedIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeItemSelection]
  }
  @scala.inline
  implicit class TreeItemSelectionOps[Self <: TreeItemSelection] (val x: Self) extends AnyVal {
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
    def setOnItemSelect(value: TreeItemId => Unit): Self = this.set("onItemSelect", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMultiItemSelect(value: SelectedIds => Unit): Self = this.set("onMultiItemSelect", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectedIdsVarargs(value: TreeItemId*): Self = this.set("selectedIds", js.Array(value :_*))
    @scala.inline
    def setSelectedIds(value: SelectedIds): Self = this.set("selectedIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSelect: Self = this.set("multiSelect", js.undefined)
  }
  
}

