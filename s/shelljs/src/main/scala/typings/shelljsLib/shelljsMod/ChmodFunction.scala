package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChmodFunction extends js.Object {
  /**
  	 * Alters the permissions of a file or directory by either specifying the absolute
  	 * permissions in octal form or expressing the changes in symbols.
  	 *
  	 * This command tries to mimic the POSIX behavior as much as possible.
  	 *
  	 * Notable exceptions:
  	 * - In symbolic modes, 'a-r' and '-r' are identical. No consideration is given to the umask.
  	 * - There is no "quiet" option since default behavior is to run silent.
  	 *
  	 * @param mode The access mode. Can be an octal string or a symbolic mode string.
  	 * @param file The file to use.
  	 * @return     Object with shell exit code, stderr and stdout.
  	 */
  def apply(mode: java.lang.String, file: java.lang.String): ShellString = js.native
  def apply(mode: scala.Double, file: java.lang.String): ShellString = js.native
  /**
  	 * Alters the permissions of a file or directory by either specifying the absolute
  	 * permissions in octal form or expressing the changes in symbols.
  	 *
  	 * This command tries to mimic the POSIX behavior as much as possible.
  	 *
  	 * Notable exceptions:
  	 * - In symbolic modes, 'a-r' and '-r' are identical. No consideration is given to the umask.
  	 * - There is no "quiet" option since default behavior is to run silent.
  	 *
  	 * @param options Available options:
  	 *        - `-v`: output a diagnostic for every file processed
  	 *        - `-c`: like -v but report only when a change is made
  	 *        - `-R`: change files and directories recursively
  	 * @param mode    The access mode. Can be an octal string or a symbolic mode string.
  	 * @param file    The file to use.
  	 * @return        Object with shell exit code, stderr and stdout.
  	 */
  def apply(options: java.lang.String, mode: java.lang.String, file: java.lang.String): ShellString = js.native
  def apply(options: java.lang.String, mode: scala.Double, file: java.lang.String): ShellString = js.native
}

