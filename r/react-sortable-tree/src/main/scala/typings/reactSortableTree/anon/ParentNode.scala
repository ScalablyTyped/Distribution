package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.TreeItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentNode[T] extends StObject {
  
  var parentNode: TreeItem[T]
}
object ParentNode {
  
  inline def apply[T](parentNode: TreeItem[T]): ParentNode[T] = {
    val __obj = js.Dynamic.literal(parentNode = parentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentNode[T]]
  }
  
  extension [Self <: ParentNode[?], T](x: Self & ParentNode[T]) {
    
    inline def setParentNode(value: TreeItem[T]): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
  }
}
