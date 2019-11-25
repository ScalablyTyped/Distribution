package typings.smartDashFoxDashServer.SFS2X

import typings.smartDashFoxDashServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IROOM_PASSWORD_STATE_CHANGE extends js.Object {
  var room: SFSRoom
}

object IROOM_PASSWORD_STATE_CHANGE {
  @scala.inline
  def apply(room: SFSRoom): IROOM_PASSWORD_STATE_CHANGE = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IROOM_PASSWORD_STATE_CHANGE]
  }
}

