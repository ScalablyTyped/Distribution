package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShouldCopyData[T] extends StObject {
  
  var node: TreeNode[T]
  
  var prevPath: NumberOrStringArray
  
  var prevTreeIndex: Double
}
object ShouldCopyData {
  
  inline def apply[T](node: TreeNode[T], prevPath: NumberOrStringArray, prevTreeIndex: Double): ShouldCopyData[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any], prevTreeIndex = prevTreeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldCopyData[T]]
  }
  
  extension [Self <: ShouldCopyData[?], T](x: Self & ShouldCopyData[T]) {
    
    inline def setNode(value: TreeNode[T]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setPrevPath(value: NumberOrStringArray): Self = StObject.set(x, "prevPath", value.asInstanceOf[js.Any])
    
    inline def setPrevPathVarargs(value: (String | Double)*): Self = StObject.set(x, "prevPath", js.Array(value*))
    
    inline def setPrevTreeIndex(value: Double): Self = StObject.set(x, "prevTreeIndex", value.asInstanceOf[js.Any])
  }
}
