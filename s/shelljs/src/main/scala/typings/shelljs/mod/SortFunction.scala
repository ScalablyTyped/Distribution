package typings.shelljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortFunction extends js.Object {
  def apply(files: String*): ShellString = js.native
  /**
    * Return the contents of the files, sorted line-by-line.
    * Sorting multiple files mixes their content (just as unix sort does).
    */
  def apply(files: js.Array[String]): ShellString = js.native
  def apply(options: String, files: String*): ShellString = js.native
  /**
    * Return the contents of the files, sorted line-by-line.
    * Sorting multiple files mixes their content (just as unix sort does).
    *
    * @param options Available options:
    *        - `-r`: Reverse the results
    *        - `-n`: Compare according to numerical value
    */
  def apply(options: String, files: js.Array[String]): ShellString = js.native
}

