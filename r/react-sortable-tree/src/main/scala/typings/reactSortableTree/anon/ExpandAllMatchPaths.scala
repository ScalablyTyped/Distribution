package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.SearchData
import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandAllMatchPaths[T] extends StObject {
  
  var expandAllMatchPaths: js.UndefOr[Boolean] = js.undefined
  
  var expandFocusMatchPaths: js.UndefOr[Boolean] = js.undefined
  
  var getNodeKey: GetNodeKeyFunction[T]
  
  var searchFocusOffset: js.UndefOr[Double] = js.undefined
  
  def searchMethod(data: SearchData[T]): Boolean
  
  var searchQuery: js.UndefOr[String | Double] = js.undefined
}
object ExpandAllMatchPaths {
  
  inline def apply[T](
    getNodeKey: /* data */ TreeIndex & TreeNode[T] => String | Double,
    searchMethod: SearchData[T] => Boolean
  ): ExpandAllMatchPaths[T] = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), searchMethod = js.Any.fromFunction1(searchMethod))
    __obj.asInstanceOf[ExpandAllMatchPaths[T]]
  }
  
  extension [Self <: ExpandAllMatchPaths[?], T](x: Self & ExpandAllMatchPaths[T]) {
    
    inline def setExpandAllMatchPaths(value: Boolean): Self = StObject.set(x, "expandAllMatchPaths", value.asInstanceOf[js.Any])
    
    inline def setExpandAllMatchPathsUndefined: Self = StObject.set(x, "expandAllMatchPaths", js.undefined)
    
    inline def setExpandFocusMatchPaths(value: Boolean): Self = StObject.set(x, "expandFocusMatchPaths", value.asInstanceOf[js.Any])
    
    inline def setExpandFocusMatchPathsUndefined: Self = StObject.set(x, "expandFocusMatchPaths", js.undefined)
    
    inline def setGetNodeKey(value: /* data */ TreeIndex & TreeNode[T] => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
    
    inline def setSearchFocusOffset(value: Double): Self = StObject.set(x, "searchFocusOffset", value.asInstanceOf[js.Any])
    
    inline def setSearchFocusOffsetUndefined: Self = StObject.set(x, "searchFocusOffset", js.undefined)
    
    inline def setSearchMethod(value: SearchData[T] => Boolean): Self = StObject.set(x, "searchMethod", js.Any.fromFunction1(value))
    
    inline def setSearchQuery(value: String | Double): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
    
    inline def setSearchQueryUndefined: Self = StObject.set(x, "searchQuery", js.undefined)
  }
}
