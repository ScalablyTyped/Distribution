package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullTree[T] extends StObject {
  
  var treeData: js.Array[TreeItem[T]]
}
object FullTree {
  
  inline def apply[T](treeData: js.Array[TreeItem[T]]): FullTree[T] = {
    val __obj = js.Dynamic.literal(treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTree[T]]
  }
  
  extension [Self <: FullTree[?], T](x: Self & FullTree[T]) {
    
    inline def setTreeData(value: js.Array[TreeItem[T]]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    inline def setTreeDataVarargs(value: TreeItem[T]*): Self = StObject.set(x, "treeData", js.Array(value*))
  }
}
