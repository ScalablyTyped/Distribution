package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTreeItemChildren[T] extends StObject {
  
  def done(children: js.Array[TreeItem[T]]): Unit
  
  var lowerSiblingCounts: js.Array[Double]
  
  var node: TreeItem[T]
  
  var path: NumberOrStringArray
  
  var treeIndex: Double
}
object GetTreeItemChildren {
  
  inline def apply[T](
    done: js.Array[TreeItem[T]] => Unit,
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem[T],
    path: NumberOrStringArray,
    treeIndex: Double
  ): GetTreeItemChildren[T] = {
    val __obj = js.Dynamic.literal(done = js.Any.fromFunction1(done), lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTreeItemChildren[T]]
  }
  
  extension [Self <: GetTreeItemChildren[?], T](x: Self & GetTreeItemChildren[T]) {
    
    inline def setDone(value: js.Array[TreeItem[T]] => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
    
    inline def setLowerSiblingCounts(value: js.Array[Double]): Self = StObject.set(x, "lowerSiblingCounts", value.asInstanceOf[js.Any])
    
    inline def setLowerSiblingCountsVarargs(value: Double*): Self = StObject.set(x, "lowerSiblingCounts", js.Array(value*))
    
    inline def setNode(value: TreeItem[T]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setPath(value: NumberOrStringArray): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setTreeIndex(value: Double): Self = StObject.set(x, "treeIndex", value.asInstanceOf[js.Any])
  }
}
