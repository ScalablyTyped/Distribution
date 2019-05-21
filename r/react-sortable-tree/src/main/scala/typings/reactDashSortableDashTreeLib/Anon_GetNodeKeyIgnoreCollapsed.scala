package typings
package reactDashSortableDashTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetNodeKeyIgnoreCollapsed extends js.Object {
  var getNodeKey: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction
  var ignoreCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  var newNode: js.Function | js.Any
}

object Anon_GetNodeKeyIgnoreCollapsed {
  @scala.inline
  def apply(
    getNodeKey: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction,
    newNode: js.Function | js.Any,
    ignoreCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_GetNodeKeyIgnoreCollapsed = {
    val __obj = js.Dynamic.literal(getNodeKey = getNodeKey, newNode = newNode.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed)
    __obj.asInstanceOf[Anon_GetNodeKeyIgnoreCollapsed]
  }
}

