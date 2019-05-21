package typings
package reactDashSortableDashTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Depth extends js.Object {
  var depth: scala.Double
  var expandParent: js.UndefOr[scala.Boolean] = js.undefined
  var getNodeKey: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction
  var ignoreCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  var minimumTreeIndex: scala.Double
  var newNode: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeItem
}

object Anon_Depth {
  @scala.inline
  def apply(
    depth: scala.Double,
    getNodeKey: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction,
    minimumTreeIndex: scala.Double,
    newNode: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeItem,
    expandParent: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Depth = {
    val __obj = js.Dynamic.literal(depth = depth, getNodeKey = getNodeKey, minimumTreeIndex = minimumTreeIndex, newNode = newNode)
    if (!js.isUndefined(expandParent)) __obj.updateDynamic("expandParent")(expandParent)
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed)
    __obj.asInstanceOf[Anon_Depth]
  }
}

