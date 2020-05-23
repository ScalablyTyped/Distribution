package typings.stdMocks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StderrStdout extends js.Object {
  var stderr: js.Array[String]
  var stdout: js.Array[String]
}

object StderrStdout {
  @scala.inline
  def apply(stderr: js.Array[String], stdout: js.Array[String]): StderrStdout = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[StderrStdout]
  }
}

