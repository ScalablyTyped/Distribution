package typings
package reactDashSortableDashTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var expandAllMatchPaths: js.UndefOr[scala.Boolean] = js.undefined
  var expandFocusMatchPaths: js.UndefOr[scala.Boolean] = js.undefined
  var getNodeKey: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction
  var searchFocusOffset: js.UndefOr[scala.Double] = js.undefined
  var searchQuery: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  def searchMethod(data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.SearchData): scala.Boolean
}

object Anon_Data {
  @scala.inline
  def apply(
    getNodeKey: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction,
    searchMethod: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.SearchData => scala.Boolean,
    expandAllMatchPaths: js.UndefOr[scala.Boolean] = js.undefined,
    expandFocusMatchPaths: js.UndefOr[scala.Boolean] = js.undefined,
    searchFocusOffset: scala.Int | scala.Double = null,
    searchQuery: java.lang.String | scala.Double = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(getNodeKey = getNodeKey, searchMethod = js.Any.fromFunction1(searchMethod))
    if (!js.isUndefined(expandAllMatchPaths)) __obj.updateDynamic("expandAllMatchPaths")(expandAllMatchPaths)
    if (!js.isUndefined(expandFocusMatchPaths)) __obj.updateDynamic("expandFocusMatchPaths")(expandFocusMatchPaths)
    if (searchFocusOffset != null) __obj.updateDynamic("searchFocusOffset")(searchFocusOffset.asInstanceOf[js.Any])
    if (searchQuery != null) __obj.updateDynamic("searchQuery")(searchQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

