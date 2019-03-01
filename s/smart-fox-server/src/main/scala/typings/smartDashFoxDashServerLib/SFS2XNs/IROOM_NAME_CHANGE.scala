package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IROOM_NAME_CHANGE extends js.Object {
  var oldName: java.lang.String
  var room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom
}

object IROOM_NAME_CHANGE {
  @scala.inline
  def apply(oldName: java.lang.String, room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom): IROOM_NAME_CHANGE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("oldName")(oldName)
    __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[IROOM_NAME_CHANGE]
  }
}

