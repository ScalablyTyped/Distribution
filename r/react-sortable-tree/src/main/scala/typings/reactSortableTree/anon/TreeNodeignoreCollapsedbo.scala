package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.TreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-sortable-tree.react-sortable-tree.TreeNode & {  ignoreCollapsed :boolean | undefined} */
@js.native
trait TreeNodeignoreCollapsedbo extends js.Object {
  
  var ignoreCollapsed: js.UndefOr[Boolean] = js.native
  
  var node: TreeItem = js.native
}
object TreeNodeignoreCollapsedbo {
  
  @scala.inline
  def apply(node: TreeItem): TreeNodeignoreCollapsedbo = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNodeignoreCollapsedbo]
  }
  
  @scala.inline
  implicit class TreeNodeignoreCollapsedboOps[Self <: TreeNodeignoreCollapsedbo] (val x: Self) extends AnyVal {
    
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
    def setNode(value: TreeItem): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCollapsed(value: Boolean): Self = this.set("ignoreCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCollapsed: Self = this.set("ignoreCollapsed", js.undefined)
  }
}
