package typings.smartDashFoxDashServer.SFS2X

import typings.smartDashFoxDashServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IROOM_CAPACITY_CHANGE extends js.Object {
  var room: SFSRoom
}

object IROOM_CAPACITY_CHANGE {
  @scala.inline
  def apply(room: SFSRoom): IROOM_CAPACITY_CHANGE = {
    val __obj = js.Dynamic.literal(room = room)
  
    __obj.asInstanceOf[IROOM_CAPACITY_CHANGE]
  }
}

