package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IROOM_JOIN extends js.Object {
  var room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom
}

object IROOM_JOIN {
  @scala.inline
  def apply(room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom): IROOM_JOIN = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[IROOM_JOIN]
  }
}

