package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SedFunction extends js.Object {
  def apply(
    options: java.lang.String,
    searchRegex: java.lang.String,
    replacement: java.lang.String,
    files: java.lang.String*
  ): ShellString = js.native
  /**
  	 * Reads an input string from file and performs a JavaScript `replace()`
  	 * on the input using the given search regex and replacement string or function.
  	 *
  	 * @param options Available options:
  	 *        - `-i`: Replace contents of 'file' in-place. Note that no backups will be created!
  	 * @param searchRegex The regular expression to use for search.
  	 * @param replacement The replacement.
  	 * @param files       The files to process.
  	 * @return            The new string after replacement.
  	 */
  def apply(
    options: java.lang.String,
    searchRegex: java.lang.String,
    replacement: java.lang.String,
    files: js.Array[java.lang.String]
  ): ShellString = js.native
  def apply(
    options: java.lang.String,
    searchRegex: stdLib.RegExp,
    replacement: java.lang.String,
    files: java.lang.String*
  ): ShellString = js.native
  def apply(
    options: java.lang.String,
    searchRegex: stdLib.RegExp,
    replacement: java.lang.String,
    files: js.Array[java.lang.String]
  ): ShellString = js.native
  def apply(searchRegex: java.lang.String, replacement: java.lang.String, files: java.lang.String*): ShellString = js.native
  /**
  	 * Reads an input string from file and performs a JavaScript `replace()`
  	 * on the input using the given search regex and replacement string or function.
  	 *
  	 * @param searchRegex The regular expression to use for search.
  	 * @param replacement The replacement.
  	 * @param files       The files to process.
  	 * @return            The new string after replacement.
  	 */
  def apply(searchRegex: java.lang.String, replacement: java.lang.String, files: js.Array[java.lang.String]): ShellString = js.native
  def apply(searchRegex: stdLib.RegExp, replacement: java.lang.String, files: java.lang.String*): ShellString = js.native
  def apply(searchRegex: stdLib.RegExp, replacement: java.lang.String, files: js.Array[java.lang.String]): ShellString = js.native
}

