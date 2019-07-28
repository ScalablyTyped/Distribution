package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exit extends js.Object {
  var exit: ExitConstant
  var room: String
}

object Anon_Exit {
  @scala.inline
  def apply(exit: ExitConstant, room: String): Anon_Exit = {
    val __obj = js.Dynamic.literal(exit = exit.asInstanceOf[js.Any], room = room)
  
    __obj.asInstanceOf[Anon_Exit]
  }
}

