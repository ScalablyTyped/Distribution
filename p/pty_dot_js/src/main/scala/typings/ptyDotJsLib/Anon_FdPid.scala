package typings
package ptyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FdPid extends js.Object {
  var fd: scala.Double
  var pid: scala.Double
  var pty: scala.Double
}

object Anon_FdPid {
  @scala.inline
  def apply(fd: scala.Double, pid: scala.Double, pty: scala.Double): Anon_FdPid = {
    val __obj = js.Dynamic.literal(fd = fd, pid = pid, pty = pty)
  
    __obj.asInstanceOf[Anon_FdPid]
  }
}

