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
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ExtendedNodeDataMutableBuilder[Self <: ExtendedNodeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsSearchFocus(value: Boolean): Self = StObject.set(x, "isSearchFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSearchMatch(value: Boolean): Self = StObject.set(x, "isSearchMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerSiblingCounts(value: js.Array[Double]): Self = StObject.set(x, "lowerSiblingCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerSiblingCountsVarargs(value: Double*): Self = StObject.set(x, "lowerSiblingCounts", js.Array(value :_*))
    
    @scala.inline
    def setParentNode(value: TreeItem): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
  }
}
