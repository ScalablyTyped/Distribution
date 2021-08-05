package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.SearchData
import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  getNodeKey :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   searchQuery :string | number | undefined, searchMethod (data : react-sortable-tree.react-sortable-tree.SearchData): boolean,   searchFocusOffset :number | undefined,   expandAllMatchPaths :boolean | undefined,   expandFocusMatchPaths :boolean | undefined} */
trait FullTreegetNodeKeyGetNodeExpandAllMatchPaths extends StObject {
  
  var expandAllMatchPaths: js.UndefOr[Boolean] = js.undefined
  
  var expandFocusMatchPaths: js.UndefOr[Boolean] = js.undefined
  
  var getNodeKey: GetNodeKeyFunction
  
  var searchFocusOffset: js.UndefOr[Double] = js.undefined
  
  def searchMethod(data: SearchData): Boolean
  
  var searchQuery: js.UndefOr[String | Double] = js.undefined
  
  var treeData: js.Array[TreeItem]
}
object FullTreegetNodeKeyGetNodeExpandAllMatchPaths {
  
  inline def apply(
    getNodeKey: /* data */ TreeIndex & TreeNode => String | Double,
    searchMethod: SearchData => Boolean,
    treeData: js.Array[TreeItem]
  ): FullTreegetNodeKeyGetNodeExpandAllMatchPaths = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), searchMethod = js.Any.fromFunction1(searchMethod), treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreegetNodeKeyGetNodeExpandAllMatchPaths]
  }
  
  extension [Self <: FullTreegetNodeKeyGetNodeExpandAllMatchPaths](x: Self) {
    
    inline def setExpandAllMatchPaths(value: Boolean): Self = StObject.set(x, "expandAllMatchPaths", value.asInstanceOf[js.Any])
    
    inline def setExpandAllMatchPathsUndefined: Self = StObject.set(x, "expandAllMatchPaths", js.undefined)
    
    inline def setExpandFocusMatchPaths(value: Boolean): Self = StObject.set(x, "expandFocusMatchPaths", value.asInstanceOf[js.Any])
    
    inline def setExpandFocusMatchPathsUndefined: Self = StObject.set(x, "expandFocusMatchPaths", js.undefined)
    
    inline def setGetNodeKey(value: /* data */ TreeIndex & TreeNode => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
    
    inline def setSearchFocusOffset(value: Double): Self = StObject.set(x, "searchFocusOffset", value.asInstanceOf[js.Any])
    
    inline def setSearchFocusOffsetUndefined: Self = StObject.set(x, "searchFocusOffset", js.undefined)
    
    inline def setSearchMethod(value: SearchData => Boolean): Self = StObject.set(x, "searchMethod", js.Any.fromFunction1(value))
    
    inline def setSearchQuery(value: String | Double): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
    
    inline def setSearchQueryUndefined: Self = StObject.set(x, "searchQuery", js.undefined)
    
    inline def setTreeData(value: js.Array[TreeItem]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    inline def setTreeDataVarargs(value: TreeItem*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
