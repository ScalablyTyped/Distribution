package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UniqFunction extends js.Object {
  /**
  	 * Filter adjacent matching lines from input.
  	 */
  def apply(input: java.lang.String): ShellString = js.native
  /**
  	 * Filter adjacent matching lines from input.
  	 *
  	 * @param options Available options:
  	 *        - `-i`: Ignore case while comparing
  	 *        - `-c`: Prefix lines by the number of occurrences
  	 *        - `-d`: Only print duplicate lines, one for each group of identical lines
  	 */
  def apply(options: java.lang.String, input: java.lang.String): ShellString = js.native
  def apply(options: java.lang.String, input: java.lang.String, output: java.lang.String): ShellString = js.native
}

