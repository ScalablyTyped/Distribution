package typings.smartDashFoxDashServer.SFS2XNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.MMOItem
import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPROXIMITY_LIST_UPDATE extends js.Object {
  var addedItems: js.Array[MMOItem]
  var addedUsers: js.Array[SFSUser]
  var removedItems: js.Array[MMOItem]
  var removedUsers: js.Array[SFSUser]
}

object IPROXIMITY_LIST_UPDATE {
  @scala.inline
  def apply(
    addedItems: js.Array[MMOItem],
    addedUsers: js.Array[SFSUser],
    removedItems: js.Array[MMOItem],
    removedUsers: js.Array[SFSUser]
  ): IPROXIMITY_LIST_UPDATE = {
    val __obj = js.Dynamic.literal(addedItems = addedItems, addedUsers = addedUsers, removedItems = removedItems, removedUsers = removedUsers)
  
    __obj.asInstanceOf[IPROXIMITY_LIST_UPDATE]
  }
}

