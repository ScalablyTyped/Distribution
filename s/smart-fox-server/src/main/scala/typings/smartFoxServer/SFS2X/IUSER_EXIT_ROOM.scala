package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import typings.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUSER_EXIT_ROOM extends js.Object {
  var room: SFSRoom = js.native
  var user: SFSUser = js.native
}

object IUSER_EXIT_ROOM {
  @scala.inline
  def apply(room: SFSRoom, user: SFSUser): IUSER_EXIT_ROOM = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUSER_EXIT_ROOM]
  }
  @scala.inline
  implicit class IUSER_EXIT_ROOMOps[Self <: IUSER_EXIT_ROOM] (val x: Self) extends AnyVal {
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
    def setRoom(value: SFSRoom): Self = this.set("room", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: SFSUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

