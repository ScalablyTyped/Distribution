package typings.stdMocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStdout extends js.Object {
  var stdout: js.Array[String]
}

object AnonStdout {
  @scala.inline
  def apply(stdout: js.Array[String]): AnonStdout = {
    val __obj = js.Dynamic.literal(stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStdout]
  }
}

