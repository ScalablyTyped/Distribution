package typings.smartDashFoxDashServer.SFS2XNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSRoom
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
    val __obj = js.Dynamic.literal(changedVars = changedVars, room = room)
  
    __obj.asInstanceOf[IROOM_VARIABLES_UPDATE]
  }
}

