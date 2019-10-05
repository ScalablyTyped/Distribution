package typings.smartDashFoxDashServer.SFS2X

import typings.smartDashFoxDashServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IROOM_GROUP_SUBSCRIBE extends js.Object {
  var groupId: String
  var newRooms: js.Array[SFSRoom]
}

object IROOM_GROUP_SUBSCRIBE {
  @scala.inline
  def apply(groupId: String, newRooms: js.Array[SFSRoom]): IROOM_GROUP_SUBSCRIBE = {
    val __obj = js.Dynamic.literal(groupId = groupId, newRooms = newRooms)
  
    __obj.asInstanceOf[IROOM_GROUP_SUBSCRIBE]
  }
}

