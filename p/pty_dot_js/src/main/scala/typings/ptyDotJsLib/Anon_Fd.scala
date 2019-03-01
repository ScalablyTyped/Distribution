package typings
package ptyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fd extends js.Object {
  var fd: scala.Double
  var pid: scala.Double
  var pty: java.lang.String
}

object Anon_Fd {
  @scala.inline
  def apply(fd: scala.Double, pid: scala.Double, pty: java.lang.String): Anon_Fd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fd")(fd)
    __obj.updateDynamic("pid")(pid)
    __obj.updateDynamic("pty")(pty)
    __obj.asInstanceOf[Anon_Fd]
  }
}

