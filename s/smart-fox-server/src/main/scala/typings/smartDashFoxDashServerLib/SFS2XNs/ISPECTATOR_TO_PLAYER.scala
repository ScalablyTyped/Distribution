package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISPECTATOR_TO_PLAYER extends js.Object {
  var playerId: scala.Double
  var room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom
  var user: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
}

object ISPECTATOR_TO_PLAYER {
  @scala.inline
  def apply(
    playerId: scala.Double,
    room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom,
    user: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
  ): ISPECTATOR_TO_PLAYER = {
    val __obj = js.Dynamic.literal(playerId = playerId, room = room, user = user)
  
    __obj.asInstanceOf[ISPECTATOR_TO_PLAYER]
  }
}

