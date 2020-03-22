package typings.reactSortableTree

import typings.reactSortableTree.mod.SearchData
import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  getNodeKey  :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   searchQuery ? :string | number, searchMethod (data : react-sortable-tree.react-sortable-tree.SearchData): boolean,   searchFocusOffset ? :number,   expandAllMatchPaths ? :boolean,   expandFocusMatchPaths ? :boolean} */
trait FullTreegetNodeKeyGetNodeExpandAllMatchPaths extends js.Object {
  var expandAllMatchPaths: js.UndefOr[Boolean] = js.undefined
  var expandFocusMatchPaths: js.UndefOr[Boolean] = js.undefined
  var getNodeKey: GetNodeKeyFunction
  var searchFocusOffset: js.UndefOr[Double] = js.undefined
  var searchQuery: js.UndefOr[String | Double] = js.undefined
  var treeData: js.Array[TreeItem]
  def searchMethod(data: SearchData): Boolean
}

object FullTreegetNodeKeyGetNodeExpandAllMatchPaths {
  @scala.inline
  def apply(
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    searchMethod: SearchData => Boolean,
    treeData: js.Array[TreeItem],
    expandAllMatchPaths: js.UndefOr[Boolean] = js.undefined,
    expandFocusMatchPaths: js.UndefOr[Boolean] = js.undefined,
    searchFocusOffset: Int | Double = null,
    searchQuery: String | Double = null
  ): FullTreegetNodeKeyGetNodeExpandAllMatchPaths = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), searchMethod = js.Any.fromFunction1(searchMethod), treeData = treeData.asInstanceOf[js.Any])
    if (!js.isUndefined(expandAllMatchPaths)) __obj.updateDynamic("expandAllMatchPaths")(expandAllMatchPaths.asInstanceOf[js.Any])
    if (!js.isUndefined(expandFocusMatchPaths)) __obj.updateDynamic("expandFocusMatchPaths")(expandFocusMatchPaths.asInstanceOf[js.Any])
    if (searchFocusOffset != null) __obj.updateDynamic("searchFocusOffset")(searchFocusOffset.asInstanceOf[js.Any])
    if (searchQuery != null) __obj.updateDynamic("searchQuery")(searchQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreegetNodeKeyGetNodeExpandAllMatchPaths]
  }
}

