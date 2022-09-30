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
  
  extension [Self <: SearchData[?], T](x: Self & SearchData[T]) {
    
    inline def setSearchQuery(value: Any): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
  }
}
