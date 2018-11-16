package typings
package ptyDotJsLib.ptyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pty.js", "native")
@js.native
object nativeNs extends js.Object {
  def fork(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    env: js.Any,
    cwd: java.lang.String,
    cols: scala.Double,
    rows: scala.Double
  ): ptyDotJsLib.Anon_Fd = js.native
  def fork(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    env: js.Any,
    cwd: java.lang.String,
    cols: scala.Double,
    rows: scala.Double,
    uid: scala.Double
  ): ptyDotJsLib.Anon_Fd = js.native
  def fork(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    env: js.Any,
    cwd: java.lang.String,
    cols: scala.Double,
    rows: scala.Double,
    uid: scala.Double,
    gid: scala.Double
  ): ptyDotJsLib.Anon_Fd = js.native
  def kill(pid: scala.Double): scala.Unit = js.native
  def open(cols: scala.Double, rows: scala.Double): ptyDotJsLib.Anon_Slave = js.native
  def open(dataPipe: java.lang.String, cols: scala.Double, rows: scala.Double, debug: scala.Boolean): ptyDotJsLib.Anon_Pid = js.native
  def process(fd: scala.Double, tty: java.lang.String): java.lang.String = js.native
  def resize(fd: scala.Double, cols: scala.Double, rows: scala.Double): scala.Unit = js.native
  def startProcess(
    pid: scala.Double,
    file: java.lang.String,
    cmdline: java.lang.String,
    env: js.Array[java.lang.String],
    cwd: java.lang.String
  ): scala.Unit = js.native
}

