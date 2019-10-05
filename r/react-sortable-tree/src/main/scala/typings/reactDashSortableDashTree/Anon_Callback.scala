package typings.reactDashSortableDashTree

import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeIndex
import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeNode
import typings.reactDashSortableDashTree.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var callback: js.Function
  var getNodeKey: GetNodeKeyFunction
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
}

object Anon_Callback {
  @scala.inline
  def apply(
    callback: js.Function,
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  ): Anon_Callback = {
    val __obj = js.Dynamic.literal(callback = callback, getNodeKey = js.Any.fromFunction1(getNodeKey))
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed)
    __obj.asInstanceOf[Anon_Callback]
  }
}

