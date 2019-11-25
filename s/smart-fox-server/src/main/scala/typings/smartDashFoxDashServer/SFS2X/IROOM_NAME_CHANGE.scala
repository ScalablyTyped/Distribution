package typings.smartDashFoxDashServer.SFS2X

import typings.smartDashFoxDashServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IROOM_NAME_CHANGE extends js.Object {
  var oldName: String
  var room: SFSRoom
}

object IROOM_NAME_CHANGE {
  @scala.inline
  def apply(oldName: String, room: SFSRoom): IROOM_NAME_CHANGE = {
    val __obj = js.Dynamic.literal(oldName = oldName.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IROOM_NAME_CHANGE]
  }
}

