package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlatDataItem
  extends StObject
     with TreeNode
     with TreePath {
  
  var lowerSiblingCounts: js.Array[Double]
  
  var parentNode: TreeItem
}
object FlatDataItem {
  
  inline def apply(
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem,
    parentNode: TreeItem,
    path: NumberOrStringArray
  ): FlatDataItem = {
    val __obj = js.Dynamic.literal(lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatDataItem]
  }
  
  extension [Self <: FlatDataItem](x: Self) {
    
    inline def setLowerSiblingCounts(value: js.Array[Double]): Self = StObject.set(x, "lowerSiblingCounts", value.asInstanceOf[js.Any])
    
    inline def setLowerSiblingCountsVarargs(value: Double*): Self = StObject.set(x, "lowerSiblingCounts", js.Array(value :_*))
    
    inline def setParentNode(value: TreeItem): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
  }
}
