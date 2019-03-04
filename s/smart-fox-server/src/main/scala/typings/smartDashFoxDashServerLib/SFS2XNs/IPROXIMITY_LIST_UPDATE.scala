package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPROXIMITY_LIST_UPDATE extends js.Object {
  var addedItems: js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.MMOItem]
  var addedUsers: js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser]
  var removedItems: js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.MMOItem]
  var removedUsers: js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser]
}

object IPROXIMITY_LIST_UPDATE {
  @scala.inline
  def apply(
    addedItems: js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.MMOItem],
    addedUsers: js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser],
    removedItems: js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.MMOItem],
    removedUsers: js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser]
  ): IPROXIMITY_LIST_UPDATE = {
    val __obj = js.Dynamic.literal(addedItems = addedItems, addedUsers = addedUsers, removedItems = removedItems, removedUsers = removedUsers)
  
    __obj.asInstanceOf[IPROXIMITY_LIST_UPDATE]
  }
}

