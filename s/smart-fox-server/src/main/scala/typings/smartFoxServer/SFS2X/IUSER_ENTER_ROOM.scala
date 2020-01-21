package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import typings.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUSER_ENTER_ROOM extends js.Object {
  var room: SFSRoom
  var user: SFSUser
}

object IUSER_ENTER_ROOM {
  @scala.inline
  def apply(room: SFSRoom, user: SFSUser): IUSER_ENTER_ROOM = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUSER_ENTER_ROOM]
  }
}

