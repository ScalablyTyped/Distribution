package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.NodeData
import typings.reactSortableTree.mod.TreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  matches :std.Array<react-sortable-tree.react-sortable-tree.NodeData>} & react-sortable-tree.react-sortable-tree.FullTree */
@js.native
trait matchesArrayNodeDataFullT extends js.Object {
  
  var matches: js.Array[NodeData] = js.native
  
  var treeData: js.Array[TreeItem] = js.native
}
object matchesArrayNodeDataFullT {
  
  @scala.inline
  def apply(matches: js.Array[NodeData], treeData: js.Array[TreeItem]): matchesArrayNodeDataFullT = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[matchesArrayNodeDataFullT]
  }
  
  @scala.inline
  implicit class matchesArrayNodeDataFullTOps[Self <: matchesArrayNodeDataFullT] (val x: Self) extends AnyVal {
    
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
    def setMatchesVarargs(value: NodeData*): Self = this.set("matches", js.Array(value :_*))
    
    @scala.inline
    def setMatches(value: js.Array[NodeData]): Self = this.set("matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDataVarargs(value: TreeItem*): Self = this.set("treeData", js.Array(value :_*))
    
    @scala.inline
    def setTreeData(value: js.Array[TreeItem]): Self = this.set("treeData", value.asInstanceOf[js.Any])
  }
}
