package typings.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchData
  extends TreeNode
     with TreePath
     with TreeIndex {
  
  var searchQuery: js.Any = js.native
}
object SearchData {
  
  @scala.inline
  def apply(node: TreeItem, path: NumberOrStringArray, searchQuery: js.Any, treeIndex: Double): SearchData = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], searchQuery = searchQuery.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchData]
  }
  
  @scala.inline
  implicit class SearchDataOps[Self <: SearchData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSearchQuery(value: js.Any): Self = this.set("searchQuery", value.asInstanceOf[js.Any])
  }
}
