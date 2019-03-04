package typings
package reactDashSortableDashTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DataExpandAllMatchPaths extends js.Object {
  var expandAllMatchPaths: js.UndefOr[scala.Boolean] = js.native
  var expandFocusMatchPaths: js.UndefOr[scala.Boolean] = js.native
  @JSName("getNodeKey")
  var getNodeKey_Original: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction = js.native
  var searchFocusOffset: js.UndefOr[scala.Double] = js.native
  var searchQuery: js.UndefOr[java.lang.String | scala.Double] = js.native
  def getNodeKey(
    data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeIndex with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeNode
  ): java.lang.String | scala.Double = js.native
  def searchMethod(data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.SearchData): scala.Boolean = js.native
}

