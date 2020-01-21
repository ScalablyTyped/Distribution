package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import typings.smartFoxServer.SFS2X.Entities.SFSUser
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
    val __obj = js.Dynamic.literal(playerId = playerId.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISPECTATOR_TO_PLAYER]
  }
}

