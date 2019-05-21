package typings
package reactDashSortableDashTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddAsFirstChild extends js.Object {
  var addAsFirstChild: js.UndefOr[scala.Boolean] = js.undefined
  var expandParent: js.UndefOr[scala.Boolean] = js.undefined
  var getNodeKey: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction
  var ignoreCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  var newNode: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeItem
  var parentKey: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Anon_AddAsFirstChild {
  @scala.inline
  def apply(
    getNodeKey: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction,
    newNode: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeItem,
    addAsFirstChild: js.UndefOr[scala.Boolean] = js.undefined,
    expandParent: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreCollapsed: js.UndefOr[scala.Boolean] = js.undefined,
    parentKey: scala.Double | java.lang.String = null
  ): Anon_AddAsFirstChild = {
    val __obj = js.Dynamic.literal(getNodeKey = getNodeKey, newNode = newNode)
    if (!js.isUndefined(addAsFirstChild)) __obj.updateDynamic("addAsFirstChild")(addAsFirstChild)
    if (!js.isUndefined(expandParent)) __obj.updateDynamic("expandParent")(expandParent)
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed)
    if (parentKey != null) __obj.updateDynamic("parentKey")(parentKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddAsFirstChild]
  }
}

