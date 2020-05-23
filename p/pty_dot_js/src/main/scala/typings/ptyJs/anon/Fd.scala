package typings.ptyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fd extends js.Object {
  var fd: Double
  var pid: Double
  var pty: String
}

object Fd {
  @scala.inline
  def apply(fd: Double, pid: Double, pty: String): Fd = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fd]
  }
}

