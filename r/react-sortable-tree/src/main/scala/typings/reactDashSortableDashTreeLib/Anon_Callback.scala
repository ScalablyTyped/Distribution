package typings
package reactDashSortableDashTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var callback: js.Function
  var getNodeKey: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction
  var ignoreCollapsed: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Callback {
  @scala.inline
  def apply(
    callback: js.Function,
    getNodeKey: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction,
    ignoreCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Callback = {
    val __obj = js.Dynamic.literal(callback = callback, getNodeKey = getNodeKey)
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed)
    __obj.asInstanceOf[Anon_Callback]
  }
}

