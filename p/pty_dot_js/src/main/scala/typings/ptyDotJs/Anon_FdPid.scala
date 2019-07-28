package typings.ptyDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FdPid extends js.Object {
  var fd: Double
  var pid: Double
  var pty: Double
}

object Anon_FdPid {
  @scala.inline
  def apply(fd: Double, pid: Double, pty: Double): Anon_FdPid = {
    val __obj = js.Dynamic.literal(fd = fd, pid = pid, pty = pty)
  
    __obj.asInstanceOf[Anon_FdPid]
  }
}

