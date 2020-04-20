package typings.ptyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPid extends js.Object {
  var fd: Double
  var pid: Double
  var pty: Double
}

object AnonPid {
  @scala.inline
  def apply(fd: Double, pid: Double, pty: Double): AnonPid = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPid]
  }
}

