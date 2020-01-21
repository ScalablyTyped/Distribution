package typings.ptyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFd extends js.Object {
  var fd: Double
  var pid: Double
  var pty: String
}

object AnonFd {
  @scala.inline
  def apply(fd: Double, pid: Double, pty: String): AnonFd = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFd]
  }
}

