package typings.shelljs.shelljsMod

import typings.shelljs.shelljsStrings.`+N`
import typings.shelljs.shelljsStrings.`-N`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopDirFunction extends js.Object {
  /**
  	 * When no arguments are given, popd removes the top directory from the stack
  	 * and performs a `cd` to the new top directory.
  	 *
  	 * The elements are numbered from 0 starting at the first directory listed with dirs;
  	 * i.e., `popd` is equivalent to `popd +0`. Returns an array of paths in the stack.
  	 *
  	 * @return     Returns an array of paths in the stack.
  	 */
  def apply(): ShellArray = js.native
  /**
  	 * When no arguments are given, popd removes the top directory from the stack
  	 * and performs a `cd` to the new top directory.
  	 *
  	 * The elements are numbered from 0 starting at the first directory listed with dirs;
  	 * i.e., `popd` is equivalent to `popd +0`. Returns an array of paths in the stack.
  	 *
  	 * @param dir You can only use -N and +N.
  	 * @return    Returns an array of paths in the stack.
  	 */
  def apply(dir: String): ShellArray = js.native
  /**
  	 * When no arguments are given, popd removes the top directory from the stack
  	 * and performs a `cd` to the new top directory.
  	 *
  	 * The elements are numbered from 0 starting at the first directory listed with dirs;
  	 * i.e., popd is equivalent to popd +0. Returns an array of paths in the stack.
  	 *
  	 * @param dir Removes the Nth directory (counting from the left of the list printed by dirs), starting with zero.
  	 * @return    Returns an array of paths in the stack.
  	 */
  def apply(dir: `+N`): ShellArray = js.native
  /**
  	 * When no arguments are given, popd removes the top directory from the stack
  	 * and performs a `cd` to the new top directory.
  	 *
  	 * The elements are numbered from 0 starting at the first directory listed with dirs;
  	 * i.e., `popd` is equivalent to `popd +0`. Returns an array of paths in the stack.
  	 *
  	 * @param dir Removes the Nth directory (counting from the right of the list printed by dirs), starting with zero.
  	 * @return    Returns an array of paths in the stack.
  	 */
  def apply(dir: `-N`): ShellArray = js.native
  /**
  	 * When no arguments are given, popd removes the top directory from the stack
  	 * and performs a `cd` to the new top directory.
  	 *
  	 * The elements are numbered from 0 starting at the first directory listed with dirs;
  	 * i.e., `popd` is equivalent to `popd +0`. Returns an array of paths in the stack.
  	 *
  	 * @param options Available options:
  	 *        - `-n`: Suppresses the normal change of directory when removing directories
  	 *                from the stack, so that only the stack is manipulated
  	 *        - `-q`: Suppresses output to the console.
  	 * @param dir     You can only use -N and +N.
  	 * @return        Returns an array of paths in the stack.
  	 */
  def apply(options: String, dir: String): ShellArray = js.native
  /**
  	 * When no arguments are given, popd removes the top directory from the stack
  	 * and performs a `cd` to the new top directory.
  	 *
  	 * The elements are numbered from 0 starting at the first directory listed with dirs;
  	 * i.e., `popd` is equivalent to `popd +0`. Returns an array of paths in the stack.
  	 *
  	 * @param options Available options:
  	 *        - `-n`: Suppresses the normal change of directory when removing directories
  	 *                from the stack, so that only the stack is manipulated
  	 *        - `-q`: Suppresses output to the console.
  	 * @param dir     Removes the Nth directory (counting from the left of the list printed by dirs), starting with zero.
  	 * @return        Returns an array of paths in the stack.
  	 */
  def apply(options: String, dir: `+N`): ShellArray = js.native
  /**
  	 * When no arguments are given, popd removes the top directory from the stack
  	 * and performs a `cd` to the new top directory.
  	 *
  	 * The elements are numbered from 0 starting at the first directory listed with dirs;
  	 * i.e., `popd` is equivalent to `popd +0`. Returns an array of paths in the stack.
  	 *
  	 * @param options Available options:
  	 *        - `-n`: Suppresses the normal change of directory when removing directories
  	 *                from the stack, so that only the stack is manipulated
  	 *        - `-q`: Suppresses output to the console.
  	 * @param dir     Removes the Nth directory (counting from the right of the list printed by dirs), starting with zero.
  	 * @return        Returns an array of paths in the stack.
  	 */
  def apply(options: String, dir: `-N`): ShellArray = js.native
}

