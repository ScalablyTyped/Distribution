package typings.screeps.anon

import typings.screeps.ExitConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exit extends js.Object {
  var exit: ExitConstant
  var room: String
}

object Exit {
  @scala.inline
  def apply(exit: ExitConstant, room: String): Exit = {
    val __obj = js.Dynamic.literal(exit = exit.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exit]
  }
}

