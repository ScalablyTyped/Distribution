package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUSER_EXIT_ROOM extends js.Object {
  var room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom
  var user: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
}

object IUSER_EXIT_ROOM {
  @scala.inline
  def apply(
    room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom,
    user: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
  ): IUSER_EXIT_ROOM = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("room")(room)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[IUSER_EXIT_ROOM]
  }
}

