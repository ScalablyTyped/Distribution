package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EchoFunction extends js.Object {
  /**
  	 * Prints string to stdout, and returns string with additional utility methods like .to().
  	 *
  	 * @param options Available options:
  	 *        - `-e`: interpret backslash escapes (default)
  	 *        - `-n`: remove trailing newline from output
  	 * @param text The text to print.
  	 * @return     Returns the string that was passed as argument.
  	 */
  def apply(options: java.lang.String, text: java.lang.String*): ShellString = js.native
  /**
  	 * Prints string to stdout, and returns string with additional utility methods like .to().
  	 *
  	 * @param text The text to print.
  	 * @return     Returns the string that was passed as argument.
  	 */
  def apply(text: java.lang.String*): ShellString = js.native
}

