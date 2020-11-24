package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.MMOItem
import typings.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPROXIMITY_LIST_UPDATE extends js.Object {
  
  var addedItems: js.Array[MMOItem] = js.native
  
  var addedUsers: js.Array[SFSUser] = js.native
  
  var removedItems: js.Array[MMOItem] = js.native
  
  var removedUsers: js.Array[SFSUser] = js.native
}
object IPROXIMITY_LIST_UPDATE {
  
  @scala.inline
  def apply(
    addedItems: js.Array[MMOItem],
    addedUsers: js.Array[SFSUser],
    removedItems: js.Array[MMOItem],
    removedUsers: js.Array[SFSUser]
  ): IPROXIMITY_LIST_UPDATE = {
    val __obj = js.Dynamic.literal(addedItems = addedItems.asInstanceOf[js.Any], addedUsers = addedUsers.asInstanceOf[js.Any], removedItems = removedItems.asInstanceOf[js.Any], removedUsers = removedUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPROXIMITY_LIST_UPDATE]
  }
  
  @scala.inline
  implicit class IPROXIMITY_LIST_UPDATEOps[Self <: IPROXIMITY_LIST_UPDATE] (val x: Self) extends AnyVal {
    
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
    def setAddedItemsVarargs(value: MMOItem*): Self = this.set("addedItems", js.Array(value :_*))
    
    @scala.inline
    def setAddedItems(value: js.Array[MMOItem]): Self = this.set("addedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedUsersVarargs(value: SFSUser*): Self = this.set("addedUsers", js.Array(value :_*))
    
    @scala.inline
    def setAddedUsers(value: js.Array[SFSUser]): Self = this.set("addedUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedItemsVarargs(value: MMOItem*): Self = this.set("removedItems", js.Array(value :_*))
    
    @scala.inline
    def setRemovedItems(value: js.Array[MMOItem]): Self = this.set("removedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedUsersVarargs(value: SFSUser*): Self = this.set("removedUsers", js.Array(value :_*))
    
    @scala.inline
    def setRemovedUsers(value: js.Array[SFSUser]): Self = this.set("removedUsers", value.asInstanceOf[js.Any])
  }
}
