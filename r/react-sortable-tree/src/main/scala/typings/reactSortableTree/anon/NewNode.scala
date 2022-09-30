package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewNode[T] extends StObject {
  
  var getNodeKey: GetNodeKeyFunction[T]
  
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  
  var newNode: js.Function | Any
}
object NewNode {
  
  inline def apply[T](getNodeKey: /* data */ TreeIndex & TreeNode[T] => String | Double, newNode: js.Function | Any): NewNode[T] = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), newNode = newNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewNode[T]]
  }
  
  extension [Self <: NewNode[?], T](x: Self & NewNode[T]) {
    
    inline def setGetNodeKey(value: /* data */ TreeIndex & TreeNode[T] => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
    
    inline def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
    
    inline def setNewNode(value: js.Function | Any): Self = StObject.set(x, "newNode", value.asInstanceOf[js.Any])
  }
}
