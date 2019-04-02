package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkFunction extends js.Object {
  /**
  	 * Links source to dest. Use `-f` to force the link, should dest already exist.
  	 *
  	 * @param options Available options:
  	 *        - `-s`: Create a symbolic link, defaults to a hardlink
  	 *        - `-f`: Force creation
  	 * @param source The source.
  	 * @param dest   The destination.
  	 * @return       Object with shell exit code, stderr and stdout.
  	 */
  def apply(options: java.lang.String, source: java.lang.String, dest: java.lang.String): ShellString = js.native
  /**
  	 * Links source to dest. Use `-f` to force the link, should dest already exist.
  	 *
  	 * @param source The source.
  	 * @param dest   The destination.
  	 * @return       Object with shell exit code, stderr and stdout.
  	 */
  def apply(source: java.lang.String, dest: java.lang.String): ShellString = js.native
}

