package typings.reactSortableTree

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddAsFirstChild extends js.Object {
  var addAsFirstChild: js.UndefOr[Boolean] = js.undefined
  var expandParent: js.UndefOr[Boolean] = js.undefined
  var getNodeKey: GetNodeKeyFunction
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  var newNode: TreeItem
  var parentKey: js.UndefOr[Double | String] = js.undefined
}

object AnonAddAsFirstChild {
  @scala.inline
  def apply(
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    newNode: TreeItem,
    addAsFirstChild: js.UndefOr[Boolean] = js.undefined,
    expandParent: js.UndefOr[Boolean] = js.undefined,
    ignoreCollapsed: js.UndefOr[Boolean] = js.undefined,
    parentKey: Double | String = null
  ): AnonAddAsFirstChild = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), newNode = newNode.asInstanceOf[js.Any])
    if (!js.isUndefined(addAsFirstChild)) __obj.updateDynamic("addAsFirstChild")(addAsFirstChild.asInstanceOf[js.Any])
    if (!js.isUndefined(expandParent)) __obj.updateDynamic("expandParent")(expandParent.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed.asInstanceOf[js.Any])
    if (parentKey != null) __obj.updateDynamic("parentKey")(parentKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddAsFirstChild]
  }
}

