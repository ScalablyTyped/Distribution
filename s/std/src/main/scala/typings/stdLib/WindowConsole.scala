package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowConsole extends js.Object {
  val console: Console
}

object WindowConsole {
  @scala.inline
  def apply(console: Console): WindowConsole = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("console")(console)
    __obj.asInstanceOf[WindowConsole]
  }
}

