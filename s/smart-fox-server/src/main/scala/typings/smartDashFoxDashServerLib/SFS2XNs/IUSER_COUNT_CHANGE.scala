package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUSER_COUNT_CHANGE extends js.Object {
  var room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom
  var sCount: scala.Double
  var uCount: scala.Double
}

object IUSER_COUNT_CHANGE {
  @scala.inline
  def apply(
    room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom,
    sCount: scala.Double,
    uCount: scala.Double
  ): IUSER_COUNT_CHANGE = {
    val __obj = js.Dynamic.literal(room = room, sCount = sCount, uCount = uCount)
  
    __obj.asInstanceOf[IUSER_COUNT_CHANGE]
  }
}

