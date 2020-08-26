package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import typings.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISPECTATOR_TO_PLAYER extends js.Object {
  var playerId: Double = js.native
  var room: SFSRoom = js.native
  var user: SFSUser = js.native
}

object ISPECTATOR_TO_PLAYER {
  @scala.inline
  def apply(playerId: Double, room: SFSRoom, user: SFSUser): ISPECTATOR_TO_PLAYER = {
    val __obj = js.Dynamic.literal(playerId = playerId.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISPECTATOR_TO_PLAYER]
  }
  @scala.inline
  implicit class ISPECTATOR_TO_PLAYEROps[Self <: ISPECTATOR_TO_PLAYER] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPlayerId(value: Double): Self = this.set("playerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoom(value: SFSRoom): Self = this.set("room", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: SFSUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

