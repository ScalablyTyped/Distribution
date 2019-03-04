package typings
package reactDashSortableDashTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DataDepth extends js.Object {
  var depth: scala.Double = js.native
  var expandParent: js.UndefOr[scala.Boolean] = js.native
  @JSName("getNodeKey")
  var getNodeKey_Original: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction = js.native
  var ignoreCollapsed: js.UndefOr[scala.Boolean] = js.native
  var minimumTreeIndex: scala.Double = js.native
  var newNode: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeItem = js.native
  def getNodeKey(
    data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeIndex with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeNode
  ): java.lang.String | scala.Double = js.native
}

