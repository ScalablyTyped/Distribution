package typings.reactSortableTree

import typings.reactSortableTree.mod.TreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.TreeNode & {  ignoreCollapsed ? :boolean} */
trait TreeNodeignoreCollapsedbo extends js.Object {
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  var node: TreeItem
}

object TreeNodeignoreCollapsedbo {
  @scala.inline
  def apply(node: TreeItem, ignoreCollapsed: js.UndefOr[Boolean] = js.undefined): TreeNodeignoreCollapsedbo = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNodeignoreCollapsedbo]
  }
}

