package typings.shelljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFunction extends js.Object {
  def apply(files: String*): ShellString = js.native
  /**
  	 * Removes files. The wildcard `*` is accepted.
  	 *
  	 * @param files Files to remove.
  	 * @return      Object with shell exit code, stderr and stdout.
  	 */
  def apply(files: js.Array[String]): ShellString = js.native
  def apply(options: String, files: String*): ShellString = js.native
  /**
  	 * Removes files. The wildcard `*` is accepted.
  	 *
  	 * @param options Available options:
  	 *        - `-f`: force
  	 *        - `-r`, `-R`: recursive
  	 * @param files   Files to remove.
  	 * @return        Object with shell exit code, stderr and stdout.
  	 */
  def apply(options: String, files: js.Array[String]): ShellString = js.native
}

