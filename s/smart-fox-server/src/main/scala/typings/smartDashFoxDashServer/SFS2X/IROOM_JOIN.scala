package typings.smartDashFoxDashServer.SFS2X

import typings.smartDashFoxDashServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IROOM_JOIN extends js.Object {
  var room: SFSRoom
}

object IROOM_JOIN {
  @scala.inline
  def apply(room: SFSRoom): IROOM_JOIN = {
    val __obj = js.Dynamic.literal(room = room)
  
    __obj.asInstanceOf[IROOM_JOIN]
  }
}

