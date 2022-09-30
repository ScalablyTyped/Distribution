package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlatDataItem[T]
  extends StObject
     with TreeNode[T]
     with TreePath {
  
  var lowerSiblingCounts: js.Array[Double]
  
  var parentNode: TreeItem[T]
}
object FlatDataItem {
  
  inline def apply[T](
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem[T],
    parentNode: TreeItem[T],
    path: NumberOrStringArray
  ): FlatDataItem[T] = {
    val __obj = js.Dynamic.literal(lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatDataItem[T]]
  }
  
  extension [Self <: FlatDataItem[?], T](x: Self & FlatDataItem[T]) {
    
    inline def setLowerSiblingCounts(value: js.Array[Double]): Self = StObject.set(x, "lowerSiblingCounts", value.asInstanceOf[js.Any])
    
    inline def setLowerSiblingCountsVarargs(value: Double*): Self = StObject.set(x, "lowerSiblingCounts", js.Array(value*))
    
    inline def setParentNode(value: TreeItem[T]): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
  }
}
