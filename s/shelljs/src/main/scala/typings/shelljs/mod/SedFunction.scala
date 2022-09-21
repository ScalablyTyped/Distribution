package typings.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SedFunction extends StObject {
  
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
  def apply(options: String, searchRegex: js.RegExp, replacement: String, files: String*): ShellString = js.native
  def apply(options: String, searchRegex: js.RegExp, replacement: String, files: js.Array[String]): ShellString = js.native
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
  def apply(searchRegex: js.RegExp, replacement: String, files: String*): ShellString = js.native
  def apply(searchRegex: js.RegExp, replacement: String, files: js.Array[String]): ShellString = js.native
}
