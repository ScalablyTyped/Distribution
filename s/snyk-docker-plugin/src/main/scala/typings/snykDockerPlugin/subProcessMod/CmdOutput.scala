package typings.snykDockerPlugin.subProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CmdOutput extends js.Object {
  var stderr: String
  var stdout: String
}

object CmdOutput {
  @scala.inline
  def apply(stderr: String, stdout: String): CmdOutput = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmdOutput]
  }
}

