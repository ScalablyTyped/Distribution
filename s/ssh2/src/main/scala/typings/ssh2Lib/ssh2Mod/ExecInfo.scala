package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecInfo extends js.Object {
  /** The command line to be executed. */
  var command: java.lang.String
}

object ExecInfo {
  @scala.inline
  def apply(command: java.lang.String): ExecInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    __obj.asInstanceOf[ExecInfo]
  }
}

