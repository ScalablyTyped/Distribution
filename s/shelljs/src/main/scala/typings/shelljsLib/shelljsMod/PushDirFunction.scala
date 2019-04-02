package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushDirFunction extends js.Object {
  /**
  	 * Saves the current directory on the top of the directory stack and then cd to dir.
  	 * With no arguments, `pushd` exchanges the top two directories.
  	 *
  	 * @return Returns an array of paths in the stack.
  	 */
  def apply(): ShellArray = js.native
  /**
  	 * Saves the current directory on the top of the directory stack and then cd to dir.
  	 * With no arguments, `pushd` exchanges the top two directories.
  	 *
  	 * @param dir Makes the current working directory be the top of the stack,
  	 *            and then executes the equivalent of cd dir.
  	 * @return    Returns an array of paths in the stack.
  	 */
  def apply(dir: java.lang.String): ShellArray = js.native
  /**
  	 * Saves the current directory on the top of the directory stack and then cd to dir.
  	 * With no arguments, `pushd` exchanges the top two directories.
  	 *
  	 * @param dir Brings the Nth directory (counting from the left of the list printed by dirs,
  	 *            starting with zero) to the top of the list by rotating the stack.
  	 * @return    Returns an array of paths in the stack.
  	 */
  def apply(dir: shelljsLib.shelljsLibStrings.`+N`): ShellArray = js.native
  /**
  	 * Saves the current directory on the top of the directory stack and then cd to dir.
  	 * With no arguments, `pushd` exchanges the top two directories.
  	 *
  	 * @param dir Brings the Nth directory (counting from the right of the list printed by dirs,
  	 *            starting with zero) to the top of the list by rotating the stack.
  	 * @return    Returns an array of paths in the stack.
  	 */
  def apply(dir: shelljsLib.shelljsLibStrings.`-N`): ShellArray = js.native
  /**
  	 * Saves the current directory on the top of the directory stack and then cd to dir.
  	 * With no arguments, `pushd` exchanges the top two directories.
  	 *
  	 * @param options Available options:
  	 *        - `-n`: Suppresses the normal change of directory when adding directories
  	 *                to the stack, so that only the stack is manipulated
  	 *        - `-q`: Suppresses output to the console.
  	 * @param dir     Makes the current working directory be the top of the stack,
  	 *                and then executes the equivalent of `cd dir`.
  	 * @return        Returns an array of paths in the stack.
  	 */
  def apply(options: java.lang.String, dir: java.lang.String): ShellArray = js.native
  /**
  	 * Saves the current directory on the top of the directory stack and then cd to dir.
  	 * With no arguments, `pushd` exchanges the top two directories.
  	 *
  	 * @param options Available options:
  	 *        - `-n`: Suppresses the normal change of directory when adding directories
  	 *                to the stack, so that only the stack is manipulated
  	 *        - `-q`: Suppresses output to the console.
  	 * @param dir     Brings the Nth directory (counting from the left of the list printed by dirs,
  	 *                starting with zero) to the top of the list by rotating the stack.
  	 * @return        Returns an array of paths in the stack.
  	 */
  def apply(options: java.lang.String, dir: shelljsLib.shelljsLibStrings.`+N`): ShellArray = js.native
  /**
  	 * Saves the current directory on the top of the directory stack and then cd to dir.
  	 * With no arguments, `pushd` exchanges the top two directories.
  	 *
  	 * @param options Available options:
  	 *        - `-n`: Suppresses the normal change of directory when adding directories
  	 *                to the stack, so that only the stack is manipulated
  	 *        - `-q`: Suppresses output to the console.
  	 * @param dir     Brings the Nth directory (counting from the right of the list printed by dirs,
  	 *                starting with zero) to the top of the list by rotating the stack.
  	 * @return        Returns an array of paths in the stack.
  	 */
  def apply(options: java.lang.String, dir: shelljsLib.shelljsLibStrings.`-N`): ShellArray = js.native
}

