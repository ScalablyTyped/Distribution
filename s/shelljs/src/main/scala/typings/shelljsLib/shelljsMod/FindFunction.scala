package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindFunction extends js.Object {
  def apply(path: java.lang.String*): ShellArray = js.native
  /**
  	 * Returns array of all files (however deep) in the given paths.
  	 *
  	 * @param path The path(s) to search.
  	 * @return     An array of all files (however deep) in the given path(s).
  	 */
  def apply(path: js.Array[java.lang.String]): ShellArray = js.native
}

