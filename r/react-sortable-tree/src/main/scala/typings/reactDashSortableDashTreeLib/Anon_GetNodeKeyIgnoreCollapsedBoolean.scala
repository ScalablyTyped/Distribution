package typings
package reactDashSortableDashTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetNodeKeyIgnoreCollapsedBoolean extends js.Object {
  var getNodeKey: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction
  var ignoreCollapsed: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_GetNodeKeyIgnoreCollapsedBoolean {
  @scala.inline
  def apply(
    getNodeKey: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction,
    ignoreCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_GetNodeKeyIgnoreCollapsedBoolean = {
    val __obj = js.Dynamic.literal(getNodeKey = getNodeKey)
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed)
    __obj.asInstanceOf[Anon_GetNodeKeyIgnoreCollapsedBoolean]
  }
}

