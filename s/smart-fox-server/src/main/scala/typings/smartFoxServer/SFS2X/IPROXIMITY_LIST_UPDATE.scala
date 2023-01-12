package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.MMOItem
import typings.smartFoxServer.SFS2X.Entities.SFSUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPROXIMITY_LIST_UPDATE extends StObject {
  
  var addedItems: js.Array[MMOItem]
  
  var addedUsers: js.Array[SFSUser]
  
  var removedItems: js.Array[MMOItem]
  
  var removedUsers: js.Array[SFSUser]
}
object IPROXIMITY_LIST_UPDATE {
  
  inline def apply(
    addedItems: js.Array[MMOItem],
    addedUsers: js.Array[SFSUser],
    removedItems: js.Array[MMOItem],
    removedUsers: js.Array[SFSUser]
  ): IPROXIMITY_LIST_UPDATE = {
    val __obj = js.Dynamic.literal(addedItems = addedItems.asInstanceOf[js.Any], addedUsers = addedUsers.asInstanceOf[js.Any], removedItems = removedItems.asInstanceOf[js.Any], removedUsers = removedUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPROXIMITY_LIST_UPDATE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPROXIMITY_LIST_UPDATE] (val x: Self) extends AnyVal {
    
    inline def setAddedItems(value: js.Array[MMOItem]): Self = StObject.set(x, "addedItems", value.asInstanceOf[js.Any])
    
    inline def setAddedItemsVarargs(value: MMOItem*): Self = StObject.set(x, "addedItems", js.Array(value*))
    
    inline def setAddedUsers(value: js.Array[SFSUser]): Self = StObject.set(x, "addedUsers", value.asInstanceOf[js.Any])
    
    inline def setAddedUsersVarargs(value: SFSUser*): Self = StObject.set(x, "addedUsers", js.Array(value*))
    
    inline def setRemovedItems(value: js.Array[MMOItem]): Self = StObject.set(x, "removedItems", value.asInstanceOf[js.Any])
    
    inline def setRemovedItemsVarargs(value: MMOItem*): Self = StObject.set(x, "removedItems", js.Array(value*))
    
    inline def setRemovedUsers(value: js.Array[SFSUser]): Self = StObject.set(x, "removedUsers", value.asInstanceOf[js.Any])
    
    inline def setRemovedUsersVarargs(value: SFSUser*): Self = StObject.set(x, "removedUsers", js.Array(value*))
  }
}
