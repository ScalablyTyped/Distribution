package typings.reactMdTree.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeItemExpansion extends js.Object {
  
  /**
    * The list of expanded ids within the tree. These ids should reference
    * `itemId`s for tree items.
    */
  var expandedIds: ExpandedIds = js.native
  
  /**
    * A function to call that will update the `expandedIds` to collapse or expand
    * a clicked item.
    */
  def onItemExpansion(itemId: TreeItemId, expanded: Boolean): Unit = js.native
  
  /**
    * A function to call when the user presses the asterisk key (*) that will
    * expand all tree items at the same level as the currently focused item.
    */
  def onMultiItemExpansion(itemIds: ExpandedIds): Unit = js.native
}
object TreeItemExpansion {
  
  @scala.inline
  def apply(
    expandedIds: ExpandedIds,
    onItemExpansion: (TreeItemId, Boolean) => Unit,
    onMultiItemExpansion: ExpandedIds => Unit
  ): TreeItemExpansion = {
    val __obj = js.Dynamic.literal(expandedIds = expandedIds.asInstanceOf[js.Any], onItemExpansion = js.Any.fromFunction2(onItemExpansion), onMultiItemExpansion = js.Any.fromFunction1(onMultiItemExpansion))
    __obj.asInstanceOf[TreeItemExpansion]
  }
  
  @scala.inline
  implicit class TreeItemExpansionOps[Self <: TreeItemExpansion] (val x: Self) extends AnyVal {
    
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
    def setExpandedIdsVarargs(value: TreeItemId*): Self = this.set("expandedIds", js.Array(value :_*))
    
    @scala.inline
    def setExpandedIds(value: ExpandedIds): Self = this.set("expandedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnItemExpansion(value: (TreeItemId, Boolean) => Unit): Self = this.set("onItemExpansion", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnMultiItemExpansion(value: ExpandedIds => Unit): Self = this.set("onMultiItemExpansion", js.Any.fromFunction1(value))
  }
}
