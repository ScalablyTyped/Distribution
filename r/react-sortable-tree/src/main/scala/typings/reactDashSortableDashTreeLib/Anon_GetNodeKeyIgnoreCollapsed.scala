package typings
package reactDashSortableDashTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetNodeKeyIgnoreCollapsed extends js.Object {
  @JSName("getNodeKey")
  var getNodeKey_Original: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction = js.native
  var ignoreCollapsed: js.UndefOr[scala.Boolean] = js.native
  var newNode: js.Function | js.Any = js.native
  def getNodeKey(
    data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeIndex with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeNode
  ): java.lang.String | scala.Double = js.native
}

