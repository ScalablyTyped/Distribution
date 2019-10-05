package typings.smartDashFoxDashServer.SFS2X

import typings.smartDashFoxDashServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IROOM_ADD extends js.Object {
  var room: SFSRoom
}

object IROOM_ADD {
  @scala.inline
  def apply(room: SFSRoom): IROOM_ADD = {
    val __obj = js.Dynamic.literal(room = room)
  
    __obj.asInstanceOf[IROOM_ADD]
  }
}

