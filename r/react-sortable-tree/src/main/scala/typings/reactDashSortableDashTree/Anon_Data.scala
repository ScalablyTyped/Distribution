package typings.reactDashSortableDashTree

import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.SearchData
import typings.reactDashSortableDashTree.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var expandAllMatchPaths: js.UndefOr[Boolean] = js.undefined
  var expandFocusMatchPaths: js.UndefOr[Boolean] = js.undefined
  var getNodeKey: GetNodeKeyFunction
  var searchFocusOffset: js.UndefOr[Double] = js.undefined
  var searchQuery: js.UndefOr[String | Double] = js.undefined
  def searchMethod(data: SearchData): Boolean
}

object Anon_Data {
  @scala.inline
  def apply(
    getNodeKey: GetNodeKeyFunction,
    searchMethod: SearchData => Boolean,
    expandAllMatchPaths: js.UndefOr[Boolean] = js.undefined,
    expandFocusMatchPaths: js.UndefOr[Boolean] = js.undefined,
    searchFocusOffset: Int | Double = null,
    searchQuery: String | Double = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(getNodeKey = getNodeKey, searchMethod = js.Any.fromFunction1(searchMethod))
    if (!js.isUndefined(expandAllMatchPaths)) __obj.updateDynamic("expandAllMatchPaths")(expandAllMatchPaths)
    if (!js.isUndefined(expandFocusMatchPaths)) __obj.updateDynamic("expandFocusMatchPaths")(expandFocusMatchPaths)
    if (searchFocusOffset != null) __obj.updateDynamic("searchFocusOffset")(searchFocusOffset.asInstanceOf[js.Any])
    if (searchQuery != null) __obj.updateDynamic("searchQuery")(searchQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

