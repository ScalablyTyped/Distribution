package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNodeKey[T] extends StObject {
  
  var getNodeKey: GetNodeKeyFunction[T]
  
  var index: Double
}
object GetNodeKey {
  
  inline def apply[T](getNodeKey: /* data */ TreeIndex & TreeNode[T] => String | Double, index: Double): GetNodeKey[T] = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNodeKey[T]]
  }
  
  extension [Self <: GetNodeKey[?], T](x: Self & GetNodeKey[T]) {
    
    inline def setGetNodeKey(value: /* data */ TreeIndex & TreeNode[T] => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
