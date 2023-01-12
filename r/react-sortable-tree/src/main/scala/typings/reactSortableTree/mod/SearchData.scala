package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchData[T]
  extends StObject
     with NodeData[T] {
  
  var searchQuery: Any
}
object SearchData {
  
  inline def apply[T](node: TreeItem[T], path: NumberOrStringArray, searchQuery: Any, treeIndex: Double): SearchData[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], searchQuery = searchQuery.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchData[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchData[?], T] (val x: Self & SearchData[T]) extends AnyVal {
    
    inline def setSearchQuery(value: Any): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
  }
}
