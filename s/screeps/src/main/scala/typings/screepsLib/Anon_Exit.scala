package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exit extends js.Object {
  var exit: ExitConstant
  var room: java.lang.String
}

object Anon_Exit {
  @scala.inline
  def apply(exit: ExitConstant, room: java.lang.String): Anon_Exit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[Anon_Exit]
  }
}

