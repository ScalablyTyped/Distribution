package typings
package statDashModeLib.statDashModeMod.ModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permissions extends js.Object {
  var execute: scala.Boolean
  var read: scala.Boolean
  var write: scala.Boolean
}

object Permissions {
  @scala.inline
  def apply(execute: scala.Boolean, read: scala.Boolean, write: scala.Boolean): Permissions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("read")(read)
    __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[Permissions]
  }
}

