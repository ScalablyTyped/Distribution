package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUSER_ENTER_ROOM extends js.Object {
  var room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom
  var user: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
}

object IUSER_ENTER_ROOM {
  @scala.inline
  def apply(
    room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom,
    user: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
  ): IUSER_ENTER_ROOM = {
    val __obj = js.Dynamic.literal(room = room, user = user)
  
    __obj.asInstanceOf[IUSER_ENTER_ROOM]
  }
}

