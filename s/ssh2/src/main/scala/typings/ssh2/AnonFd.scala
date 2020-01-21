package typings.ssh2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFd extends js.Object {
  var fd: Double
}

object AnonFd {
  @scala.inline
  def apply(fd: Double): AnonFd = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFd]
  }
}

