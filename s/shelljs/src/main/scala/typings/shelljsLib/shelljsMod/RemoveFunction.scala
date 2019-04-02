package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFunction extends js.Object {
  def apply(files: java.lang.String*): ShellString = js.native
  /**
  	 * Removes files. The wildcard `*` is accepted.
  	 *
  	 * @param files Files to remove.
  	 * @return      Object with shell exit code, stderr and stdout.
  	 */
  def apply(files: js.Array[java.lang.String]): ShellString = js.native
  def apply(options: java.lang.String, files: java.lang.String*): ShellString = js.native
  /**
  	 * Removes files. The wildcard `*` is accepted.
  	 *
  	 * @param options Available options:
  	 *        - `-f`: force
  	 *        - `-r`, `-R`: recursive
  	 * @param files   Files to remove.
  	 * @return        Object with shell exit code, stderr and stdout.
  	 */
  def apply(options: java.lang.String, files: js.Array[java.lang.String]): ShellString = js.native
}

