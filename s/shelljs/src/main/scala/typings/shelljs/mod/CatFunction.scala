package typings.shelljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatFunction extends js.Object {
  
  def apply(files: String*): ShellString = js.native
  /**
    * Returns a string containing the given file, or a concatenated string
    * containing the files if more than one file is given (a new line character
    * is introduced between each file).
    *
    * @param files Files to use. Wildcard `*` accepted.
    * @return A string containing the given file, or a concatenated string
    *         containing the files if more than one file is given
    *         (a new line character is introduced between each file).
    */
  def apply(files: js.Array[String]): ShellString = js.native
}
