package typings.stdMocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStderr extends js.Object {
  var stderr: js.Array[String]
}

object AnonStderr {
  @scala.inline
  def apply(stderr: js.Array[String]): AnonStderr = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStderr]
  }
}

