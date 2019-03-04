package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IROOM_VARIABLES_UPDATE extends js.Object {
  var changedVars: js.Array[java.lang.String]
  var room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom
}

object IROOM_VARIABLES_UPDATE {
  @scala.inline
  def apply(
    changedVars: js.Array[java.lang.String],
    room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom
  ): IROOM_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal(changedVars = changedVars, room = room)
  
    __obj.asInstanceOf[IROOM_VARIABLES_UPDATE]
  }
}

