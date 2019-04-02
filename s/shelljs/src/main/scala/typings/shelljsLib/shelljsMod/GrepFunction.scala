package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrepFunction extends js.Object {
  def apply(options: java.lang.String, regex_filter: java.lang.String, files: java.lang.String*): ShellString = js.native
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
  def apply(options: java.lang.String, regex_filter: java.lang.String, files: js.Array[java.lang.String]): ShellString = js.native
  def apply(options: java.lang.String, regex_filter: stdLib.RegExp, files: java.lang.String*): ShellString = js.native
  def apply(options: java.lang.String, regex_filter: stdLib.RegExp, files: js.Array[java.lang.String]): ShellString = js.native
  def apply(regex_filter: java.lang.String, files: java.lang.String*): ShellString = js.native
  /**
  	 * Reads input string from given files and returns a string containing all lines
  	 * of the file that match the given `regex_filter`. Wildcard `*` accepted.
  	 *
  	 * @param regex_filter The regular expression to use.
  	 * @param files        The files to process.
  	 * @return             Returns a string containing all lines of the file that match the given `regex_filter`.
  	 */
  def apply(regex_filter: java.lang.String, files: js.Array[java.lang.String]): ShellString = js.native
  def apply(regex_filter: stdLib.RegExp, files: java.lang.String*): ShellString = js.native
  def apply(regex_filter: stdLib.RegExp, files: js.Array[java.lang.String]): ShellString = js.native
}

