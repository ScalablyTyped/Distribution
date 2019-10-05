package typings.reactDashSortableDashTree

import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeIndex
import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeItem
import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeNode
import typings.reactDashSortableDashTree.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Depth extends js.Object {
  var depth: Double
  var expandParent: js.UndefOr[Boolean] = js.undefined
  var getNodeKey: GetNodeKeyFunction
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  var minimumTreeIndex: Double
  var newNode: TreeItem
}

object Anon_Depth {
  @scala.inline
  def apply(
    depth: Double,
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    minimumTreeIndex: Double,
    newNode: TreeItem,
    expandParent: js.UndefOr[Boolean] = js.undefined,
    ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  ): Anon_Depth = {
    val __obj = js.Dynamic.literal(depth = depth, getNodeKey = js.Any.fromFunction1(getNodeKey), minimumTreeIndex = minimumTreeIndex, newNode = newNode)
    if (!js.isUndefined(expandParent)) __obj.updateDynamic("expandParent")(expandParent)
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed)
    __obj.asInstanceOf[Anon_Depth]
  }
}

