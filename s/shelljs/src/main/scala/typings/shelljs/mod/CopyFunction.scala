package typings.shelljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyFunction extends js.Object {
  /**
    * Copies files. The wildcard `*` is accepted.
    *
    * @param options Available options:
    *        - `-f`: force (default behavior)
    *        - `-n`: no-clobber
    *        - `-u`: only copy if source is newer than dest
    *        - `-r`, `-R`: recursive
    *        - `-L`: follow symlinks
    *        - `-P`: don't follow symlinks
    * @param source The source.
    * @param dest   The destination.
    * @return       Object with shell exit code, stderr and stdout.
    */
  def apply(options: String, source: String, dest: String): ShellString = js.native
  def apply(options: String, source: js.Array[String], dest: String): ShellString = js.native
  /**
    * Copies files. The wildcard `*` is accepted.
    *
    * @param source The source.
    * @param dest   The destination.
    * @return       Object with shell exit code, stderr and stdout.
    */
  def apply(source: String, dest: String): ShellString = js.native
  def apply(source: js.Array[String], dest: String): ShellString = js.native
}

