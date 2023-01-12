package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeNode[T] extends StObject {
  
  var node: TreeItem[T]
}
object TreeNode {
  
  inline def apply[T](node: TreeItem[T]): TreeNode[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNode[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeNode[?], T] (val x: Self & TreeNode[T]) extends AnyVal {
    
    inline def setNode(value: TreeItem[T]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
