package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedNodeData[T]
  extends StObject
     with NodeData[T] {
  
  var isSearchFocus: Boolean
  
  var isSearchMatch: Boolean
  
  var lowerSiblingCounts: js.Array[Double]
  
  var parentNode: TreeItem[T]
}
object ExtendedNodeData {
  
  inline def apply[T](
    isSearchFocus: Boolean,
    isSearchMatch: Boolean,
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem[T],
    parentNode: TreeItem[T],
    path: NumberOrStringArray,
    treeIndex: Double
  ): ExtendedNodeData[T] = {
    val __obj = js.Dynamic.literal(isSearchFocus = isSearchFocus.asInstanceOf[js.Any], isSearchMatch = isSearchMatch.asInstanceOf[js.Any], lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedNodeData[T]]
  }
  
  extension [Self <: ExtendedNodeData[?], T](x: Self & ExtendedNodeData[T]) {
    
    inline def setIsSearchFocus(value: Boolean): Self = StObject.set(x, "isSearchFocus", value.asInstanceOf[js.Any])
    
    inline def setIsSearchMatch(value: Boolean): Self = StObject.set(x, "isSearchMatch", value.asInstanceOf[js.Any])
    
    inline def setLowerSiblingCounts(value: js.Array[Double]): Self = StObject.set(x, "lowerSiblingCounts", value.asInstanceOf[js.Any])
    
    inline def setLowerSiblingCountsVarargs(value: Double*): Self = StObject.set(x, "lowerSiblingCounts", js.Array(value*))
    
    inline def setParentNode(value: TreeItem[T]): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
  }
}
