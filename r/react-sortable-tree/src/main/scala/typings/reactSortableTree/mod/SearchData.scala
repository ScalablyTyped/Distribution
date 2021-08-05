package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchData
  extends StObject
     with NodeData {
  
  var searchQuery: js.Any
}
object SearchData {
  
  inline def apply(node: TreeItem, path: NumberOrStringArray, searchQuery: js.Any, treeIndex: Double): SearchData = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], searchQuery = searchQuery.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchData]
  }
  
  extension [Self <: SearchData](x: Self) {
    
    inline def setSearchQuery(value: js.Any): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
  }
}
