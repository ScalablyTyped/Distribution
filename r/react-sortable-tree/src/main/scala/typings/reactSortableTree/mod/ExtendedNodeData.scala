package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedNodeData
  extends StObject
     with NodeData {
  
  var isSearchFocus: Boolean
  
  var isSearchMatch: Boolean
  
  var lowerSiblingCounts: js.Array[Double]
  
  var parentNode: TreeItem
}
object ExtendedNodeData {
  
  inline def apply(
    isSearchFocus: Boolean,
    isSearchMatch: Boolean,
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem,
    parentNode: TreeItem,
    path: NumberOrStringArray,
    treeIndex: Double
  ): ExtendedNodeData = {
    val __obj = js.Dynamic.literal(isSearchFocus = isSearchFocus.asInstanceOf[js.Any], isSearchMatch = isSearchMatch.asInstanceOf[js.Any], lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedNodeData]
  }
  
  extension [Self <: ExtendedNodeData](x: Self) {
    
    inline def setIsSearchFocus(value: Boolean): Self = StObject.set(x, "isSearchFocus", value.asInstanceOf[js.Any])
    
    inline def setIsSearchMatch(value: Boolean): Self = StObject.set(x, "isSearchMatch", value.asInstanceOf[js.Any])
    
    inline def setLowerSiblingCounts(value: js.Array[Double]): Self = StObject.set(x, "lowerSiblingCounts", value.asInstanceOf[js.Any])
    
    inline def setLowerSiblingCountsVarargs(value: Double*): Self = StObject.set(x, "lowerSiblingCounts", js.Array(value :_*))
    
    inline def setParentNode(value: TreeItem): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
  }
}
