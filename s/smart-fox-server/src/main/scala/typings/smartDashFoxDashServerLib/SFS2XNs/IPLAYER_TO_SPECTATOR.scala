package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPLAYER_TO_SPECTATOR extends js.Object {
  var room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom
  var user: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
}

object IPLAYER_TO_SPECTATOR {
  @scala.inline
  def apply(
    room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom,
    user: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
  ): IPLAYER_TO_SPECTATOR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("room")(room)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[IPLAYER_TO_SPECTATOR]
  }
}

