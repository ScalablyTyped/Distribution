package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IROOM_GROUP_SUBSCRIBE extends js.Object {
  var groupId: java.lang.String
  var newRooms: js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom]
}

object IROOM_GROUP_SUBSCRIBE {
  @scala.inline
  def apply(
    groupId: java.lang.String,
    newRooms: js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom]
  ): IROOM_GROUP_SUBSCRIBE = {
    val __obj = js.Dynamic.literal(groupId = groupId, newRooms = newRooms)
  
    __obj.asInstanceOf[IROOM_GROUP_SUBSCRIBE]
  }
}

