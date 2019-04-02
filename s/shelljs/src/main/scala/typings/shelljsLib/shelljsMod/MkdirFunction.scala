package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MkdirFunction extends js.Object {
  def apply(dir: java.lang.String*): ShellString = js.native
  /**
  	 * Creates directories.
  	 *
  	 * @param dir Directories to create.
  	 * @return    Object with shell exit code, stderr and stdout.
  	 */
  def apply(dir: js.Array[java.lang.String]): ShellString = js.native
  def apply(options: java.lang.String, dir: java.lang.String*): ShellString = js.native
  /**
  	 * Creates directories.
  	 *
  	 * @param options Available options:
  	 *        - `-p`: full paths, will create intermediate dirs if necessary
  	 * @param dir     The directories to create.
  	 * @return        Object with shell exit code, stderr and stdout.
  	 */
  def apply(options: java.lang.String, dir: js.Array[java.lang.String]): ShellString = js.native
}

