package typings
package statDashModeLib.statDashModeMod

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
    val __obj = js.Dynamic.literal(execute = execute, read = read, write = write)
  
    __obj.asInstanceOf[Permissions]
  }
}

