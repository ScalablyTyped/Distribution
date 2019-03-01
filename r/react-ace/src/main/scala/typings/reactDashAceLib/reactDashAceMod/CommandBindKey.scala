package typings
package reactDashAceLib.reactDashAceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBindKey extends js.Object {
  var mac: java.lang.String
  var win: java.lang.String
}

object CommandBindKey {
  @scala.inline
  def apply(mac: java.lang.String, win: java.lang.String): CommandBindKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mac")(mac)
    __obj.updateDynamic("win")(win)
    __obj.asInstanceOf[CommandBindKey]
  }
}

