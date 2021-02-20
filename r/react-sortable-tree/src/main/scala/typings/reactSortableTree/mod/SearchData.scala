package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchData extends NodeData {
  
  var searchQuery: js.Any = js.native
}
object SearchData {
  
  @scala.inline
  def apply(node: TreeItem, path: NumberOrStringArray, searchQuery: js.Any, treeIndex: Double): SearchData = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], searchQuery = searchQuery.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchData]
  }
  
  @scala.inline
  implicit class SearchDataMutableBuilder[Self <: SearchData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearchQuery(value: js.Any): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
  }
}
