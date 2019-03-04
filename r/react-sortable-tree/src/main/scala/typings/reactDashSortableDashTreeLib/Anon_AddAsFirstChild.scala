package typings
package reactDashSortableDashTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddAsFirstChild extends js.Object {
  var addAsFirstChild: js.UndefOr[scala.Boolean] = js.native
  var expandParent: js.UndefOr[scala.Boolean] = js.native
  @JSName("getNodeKey")
  var getNodeKey_Original: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction = js.native
  var ignoreCollapsed: js.UndefOr[scala.Boolean] = js.native
  var newNode: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeItem = js.native
  var parentKey: js.UndefOr[scala.Double | java.lang.String] = js.native
  def getNodeKey(
    data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeIndex with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeNode
  ): java.lang.String | scala.Double = js.native
}

