package typings.reactMdTree.useFlattenedTreeListMod

import typings.reactMdTree.typesMod.TreeItemId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchableTreeItem extends js.Object {
  
  /**
    * A DOM Node `id` to use.
    */
  var id: String = js.native
  
  var isParent: Boolean = js.native
  
  var itemId: TreeItemId = js.native
  
  var parentId: TreeItemId | Null = js.native
  
  /**
    * A searchable value for the tree item.
    */
  var value: String = js.native
}
object SearchableTreeItem {
  
  @scala.inline
  def apply(id: String, isParent: Boolean, itemId: TreeItemId, value: String): SearchableTreeItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isParent = isParent.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableTreeItem]
  }
  
  @scala.inline
  implicit class SearchableTreeItemOps[Self <: SearchableTreeItem] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsParent(value: Boolean): Self = this.set("isParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemId(value: TreeItemId): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: TreeItemId): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdNull: Self = this.set("parentId", null)
  }
}
