package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExit extends js.Object {
  var exit: ExitConstant
  var room: String
}

object AnonExit {
  @scala.inline
  def apply(exit: ExitConstant, room: String): AnonExit = {
    val __obj = js.Dynamic.literal(exit = exit.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExit]
  }
}

