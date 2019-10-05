package typings.reactDashSortableDashTree

import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeIndex
import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeItem
import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeNode
import typings.reactDashSortableDashTree.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddAsFirstChild extends js.Object {
  var addAsFirstChild: js.UndefOr[Boolean] = js.undefined
  var expandParent: js.UndefOr[Boolean] = js.undefined
  var getNodeKey: GetNodeKeyFunction
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  var newNode: TreeItem
  var parentKey: js.UndefOr[Double | String] = js.undefined
}

object Anon_AddAsFirstChild {
  @scala.inline
  def apply(
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    newNode: TreeItem,
    addAsFirstChild: js.UndefOr[Boolean] = js.undefined,
    expandParent: js.UndefOr[Boolean] = js.undefined,
    ignoreCollapsed: js.UndefOr[Boolean] = js.undefined,
    parentKey: Double | String = null
  ): Anon_AddAsFirstChild = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), newNode = newNode)
    if (!js.isUndefined(addAsFirstChild)) __obj.updateDynamic("addAsFirstChild")(addAsFirstChild)
    if (!js.isUndefined(expandParent)) __obj.updateDynamic("expandParent")(expandParent)
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed)
    if (parentKey != null) __obj.updateDynamic("parentKey")(parentKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddAsFirstChild]
  }
}

