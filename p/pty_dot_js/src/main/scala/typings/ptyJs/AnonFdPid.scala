package typings.ptyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFdPid extends js.Object {
  var fd: Double
  var pid: Double
  var pty: Double
}

object AnonFdPid {
  @scala.inline
  def apply(fd: Double, pid: Double, pty: Double): AnonFdPid = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFdPid]
  }
}

