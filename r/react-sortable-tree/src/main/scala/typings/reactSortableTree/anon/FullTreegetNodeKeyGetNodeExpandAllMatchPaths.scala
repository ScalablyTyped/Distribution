package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.SearchData
import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  getNodeKey :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   searchQuery :string | number | undefined, searchMethod (data : react-sortable-tree.react-sortable-tree.SearchData): boolean,   searchFocusOffset :number | undefined,   expandAllMatchPaths :boolean | undefined,   expandFocusMatchPaths :boolean | undefined} */
@js.native
trait FullTreegetNodeKeyGetNodeExpandAllMatchPaths extends js.Object {
  
  var expandAllMatchPaths: js.UndefOr[Boolean] = js.native
  
  var expandFocusMatchPaths: js.UndefOr[Boolean] = js.native
  
  var getNodeKey: GetNodeKeyFunction = js.native
  
  var searchFocusOffset: js.UndefOr[Double] = js.native
  
  def searchMethod(data: SearchData): Boolean = js.native
  
  var searchQuery: js.UndefOr[String | Double] = js.native
  
  var treeData: js.Array[TreeItem] = js.native
}
object FullTreegetNodeKeyGetNodeExpandAllMatchPaths {
  
  @scala.inline
  def apply(
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    searchMethod: SearchData => Boolean,
    treeData: js.Array[TreeItem]
  ): FullTreegetNodeKeyGetNodeExpandAllMatchPaths = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), searchMethod = js.Any.fromFunction1(searchMethod), treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreegetNodeKeyGetNodeExpandAllMatchPaths]
  }
  
  @scala.inline
  implicit class FullTreegetNodeKeyGetNodeExpandAllMatchPathsOps[Self <: FullTreegetNodeKeyGetNodeExpandAllMatchPaths] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetNodeKey(value: /* data */ TreeIndex with TreeNode => String | Double): Self = this.set("getNodeKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearchMethod(value: SearchData => Boolean): Self = this.set("searchMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTreeDataVarargs(value: TreeItem*): Self = this.set("treeData", js.Array(value :_*))
    
    @scala.inline
    def setTreeData(value: js.Array[TreeItem]): Self = this.set("treeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandAllMatchPaths(value: Boolean): Self = this.set("expandAllMatchPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandAllMatchPaths: Self = this.set("expandAllMatchPaths", js.undefined)
    
    @scala.inline
    def setExpandFocusMatchPaths(value: Boolean): Self = this.set("expandFocusMatchPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandFocusMatchPaths: Self = this.set("expandFocusMatchPaths", js.undefined)
    
    @scala.inline
    def setSearchFocusOffset(value: Double): Self = this.set("searchFocusOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchFocusOffset: Self = this.set("searchFocusOffset", js.undefined)
    
    @scala.inline
    def setSearchQuery(value: String | Double): Self = this.set("searchQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchQuery: Self = this.set("searchQuery", js.undefined)
  }
}
