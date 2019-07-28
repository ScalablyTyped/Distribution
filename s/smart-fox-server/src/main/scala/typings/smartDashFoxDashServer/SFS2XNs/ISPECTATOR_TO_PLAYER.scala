package typings.smartDashFoxDashServer.SFS2XNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSRoom
import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISPECTATOR_TO_PLAYER extends js.Object {
  var playerId: Double
  var room: SFSRoom
  var user: SFSUser
}

object ISPECTATOR_TO_PLAYER {
  @scala.inline
  def apply(playerId: Double, room: SFSRoom, user: SFSUser): ISPECTATOR_TO_PLAYER = {
    val __obj = js.Dynamic.literal(playerId = playerId, room = room, user = user)
  
    __obj.asInstanceOf[ISPECTATOR_TO_PLAYER]
  }
}

