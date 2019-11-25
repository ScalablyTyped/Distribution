package typings.shelljs.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecOutputReturnValue extends js.Object {
  /** The process exit code. */
  var code: Double
  /** The process standard error output. */
  var stderr: String
  /** The process standard output. */
  var stdout: String
}

object ExecOutputReturnValue {
  @scala.inline
  def apply(code: Double, stderr: String, stdout: String): ExecOutputReturnValue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExecOutputReturnValue]
  }
}

