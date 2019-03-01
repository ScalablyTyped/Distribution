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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fd")(fd)
    __obj.updateDynamic("pid")(pid)
    __obj.updateDynamic("pty")(pty)
    __obj.asInstanceOf[Anon_FdPid]
  }
}

