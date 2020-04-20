package typings.statMode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permissions extends js.Object {
  var execute: Boolean
  var read: Boolean
  var write: Boolean
}

object Permissions {
  @scala.inline
  def apply(execute: Boolean, read: Boolean, write: Boolean): Permissions = {
    val __obj = js.Dynamic.literal(execute = execute.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permissions]
  }
}

