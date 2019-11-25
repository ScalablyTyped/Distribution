package typings.ptyDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fd extends js.Object {
  var fd: Double
  var pid: Double
  var pty: String
}

object Anon_Fd {
  @scala.inline
  def apply(fd: Double, pid: Double, pty: String): Anon_Fd = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Fd]
  }
}

