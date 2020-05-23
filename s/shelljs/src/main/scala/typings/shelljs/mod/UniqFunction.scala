package typings.shelljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UniqFunction extends js.Object {
  /**
    * Filter adjacent matching lines from input.
    */
  def apply(input: String): ShellString = js.native
  /**
    * Filter adjacent matching lines from input.
    *
    * @param options Available options:
    *        - `-i`: Ignore case while comparing
    *        - `-c`: Prefix lines by the number of occurrences
    *        - `-d`: Only print duplicate lines, one for each group of identical lines
    */
  def apply(options: String, input: String): ShellString = js.native
  def apply(options: String, input: String, output: String): ShellString = js.native
}

