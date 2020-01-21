package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IROOM_FIND_RESULT extends js.Object {
  var rooms: js.Array[SFSRoom]
}

object IROOM_FIND_RESULT {
  @scala.inline
  def apply(rooms: js.Array[SFSRoom]): IROOM_FIND_RESULT = {
    val __obj = js.Dynamic.literal(rooms = rooms.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IROOM_FIND_RESULT]
  }
}

