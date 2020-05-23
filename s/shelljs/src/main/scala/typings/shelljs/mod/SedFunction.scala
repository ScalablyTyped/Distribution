package typings.shelljs.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SedFunction extends js.Object {
  def apply(options: String, searchRegex: String, replacement: String, files: String*): ShellString = js.native
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
  def apply(options: String, searchRegex: String, replacement: String, files: js.Array[String]): ShellString = js.native
  def apply(options: String, searchRegex: RegExp, replacement: String, files: String*): ShellString = js.native
  def apply(options: String, searchRegex: RegExp, replacement: String, files: js.Array[String]): ShellString = js.native
  def apply(searchRegex: String, replacement: String, files: String*): ShellString = js.native
  /**
    * Reads an input string from file and performs a JavaScript `replace()`
    * on the input using the given search regex and replacement string or function.
    *
    * @param searchRegex The regular expression to use for search.
    * @param replacement The replacement.
    * @param files       The files to process.
    * @return            The new string after replacement.
    */
  def apply(searchRegex: String, replacement: String, files: js.Array[String]): ShellString = js.native
  def apply(searchRegex: RegExp, replacement: String, files: String*): ShellString = js.native
  def apply(searchRegex: RegExp, replacement: String, files: js.Array[String]): ShellString = js.native
}

