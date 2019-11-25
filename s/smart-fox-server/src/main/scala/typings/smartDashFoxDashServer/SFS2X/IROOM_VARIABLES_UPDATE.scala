package typings.smartDashFoxDashServer.SFS2X

import typings.smartDashFoxDashServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IROOM_VARIABLES_UPDATE extends js.Object {
  var changedVars: js.Array[String]
  var room: SFSRoom
}

object IROOM_VARIABLES_UPDATE {
  @scala.inline
  def apply(changedVars: js.Array[String], room: SFSRoom): IROOM_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal(changedVars = changedVars.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IROOM_VARIABLES_UPDATE]
  }
}

