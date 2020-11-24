package typings.shelljs.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrepFunction extends js.Object {
  
  def apply(options: String, regex_filter: String, files: String*): ShellString = js.native
  /**
    * Reads input string from given files and returns a string containing all lines
    * of the file that match the given `regex_filter`. Wildcard `*` accepted.
    *
    * @param options Available options:
    *        - `-v`: Inverse the sense of the regex and print
    *                the lines not matching the criteria.
    *        - `-l`: Print only filenames of matching files
    * @param regex_filter The regular expression to use.
    * @param files The files to process.
    * @return Returns a string containing all lines of the file that match the given regex_filter.
    */
  def apply(options: String, regex_filter: String, files: js.Array[String]): ShellString = js.native
  def apply(options: String, regex_filter: RegExp, files: String*): ShellString = js.native
  def apply(options: String, regex_filter: RegExp, files: js.Array[String]): ShellString = js.native
  def apply(regex_filter: String, files: String*): ShellString = js.native
  /**
    * Reads input string from given files and returns a string containing all lines
    * of the file that match the given `regex_filter`. Wildcard `*` accepted.
    *
    * @param regex_filter The regular expression to use.
    * @param files        The files to process.
    * @return             Returns a string containing all lines of the file that match the given `regex_filter`.
    */
  def apply(regex_filter: String, files: js.Array[String]): ShellString = js.native
  def apply(regex_filter: RegExp, files: String*): ShellString = js.native
  def apply(regex_filter: RegExp, files: js.Array[String]): ShellString = js.native
}
