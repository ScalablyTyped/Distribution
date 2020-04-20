package typings.ssh2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecInfo extends js.Object {
  /** The command line to be executed. */
  var command: String
}

object ExecInfo {
  @scala.inline
  def apply(command: String): ExecInfo = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecInfo]
  }
}

