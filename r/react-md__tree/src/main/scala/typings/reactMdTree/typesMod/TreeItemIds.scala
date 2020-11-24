package typings.reactMdTree.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeItemIds extends js.Object {
  
  /**
    * The unique identifier for an item within the tree. This is used to be able
    * to link tree items together with parent items as well as selected/expanded
    * logic.
    */
  var itemId: TreeItemId = js.native
  
  /**
    * This id is used to be able to link tree items together with children and
    * parents. If the `parentId` is set to `null`, the tree item will appear at
    * the root of the tree. Otherwise, the tree item will appear as a child of
    * the referenced tree item by `itemId`
    */
  var parentId: Null | TreeItemId = js.native
}
object TreeItemIds {
  
  @scala.inline
  def apply(itemId: TreeItemId): TreeItemIds = {
    val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeItemIds]
  }
  
  @scala.inline
  implicit class TreeItemIdsOps[Self <: TreeItemIds] (val x: Self) extends AnyVal {
    
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
    def setItemId(value: TreeItemId): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: TreeItemId): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdNull: Self = this.set("parentId", null)
  }
}
