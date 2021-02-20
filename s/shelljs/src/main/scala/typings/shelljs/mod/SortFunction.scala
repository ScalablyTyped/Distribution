package typings.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortFunction extends StObject {
  
  def apply(files: String*): typings.shelljs.mod.ShellString = js.native
  /**
    * Return the contents of the files, sorted line-by-line.
    * Sorting multiple files mixes their content (just as unix sort does).
    */
  def apply(files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
  def apply(options: String, files: String*): typings.shelljs.mod.ShellString = js.native
  /**
    * Return the contents of the files, sorted line-by-line.
    * Sorting multiple files mixes their content (just as unix sort does).
    *
    * @param options Available options:
    *        - `-r`: Reverse the results
    *        - `-n`: Compare according to numerical value
    */
  def apply(options: String, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
}
