package typings.smartDashFoxDashServer.SFS2XNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSRoom
import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSUser
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
    val __obj = js.Dynamic.literal(room = room, user = user)
  
    __obj.asInstanceOf[IUSER_ENTER_ROOM]
  }
}

