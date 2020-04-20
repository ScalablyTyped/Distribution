package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IROOM_CAPACITY_CHANGE extends js.Object {
  var room: SFSRoom
}

object IROOM_CAPACITY_CHANGE {
  @scala.inline
  def apply(room: SFSRoom): IROOM_CAPACITY_CHANGE = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_CAPACITY_CHANGE]
  }
}

