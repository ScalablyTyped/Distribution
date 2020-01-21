package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUSER_COUNT_CHANGE extends js.Object {
  var room: SFSRoom
  var sCount: Double
  var uCount: Double
}

object IUSER_COUNT_CHANGE {
  @scala.inline
  def apply(room: SFSRoom, sCount: Double, uCount: Double): IUSER_COUNT_CHANGE = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], sCount = sCount.asInstanceOf[js.Any], uCount = uCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUSER_COUNT_CHANGE]
  }
}

