package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNodeKeyIgnoreCollapsed[T] extends StObject {
  
  var getNodeKey: GetNodeKeyFunction[T]
  
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
}
object GetNodeKeyIgnoreCollapsed {
  
  inline def apply[T](getNodeKey: /* data */ TreeIndex & TreeNode[T] => String | Double): GetNodeKeyIgnoreCollapsed[T] = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey))
    __obj.asInstanceOf[GetNodeKeyIgnoreCollapsed[T]]
  }
  
  extension [Self <: GetNodeKeyIgnoreCollapsed[?], T](x: Self & GetNodeKeyIgnoreCollapsed[T]) {
    
    inline def setGetNodeKey(value: /* data */ TreeIndex & TreeNode[T] => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
    
    inline def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
  }
}
