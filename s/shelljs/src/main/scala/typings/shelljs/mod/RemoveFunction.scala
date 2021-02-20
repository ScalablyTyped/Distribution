package typings.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveFunction extends StObject {
  
  def apply(files: String*): typings.shelljs.mod.ShellString = js.native
  /**
    * Removes files. The wildcard `*` is accepted.
    *
    * @param files Files to remove.
    * @return      Object with shell exit code, stderr and stdout.
    */
  def apply(files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
  def apply(options: String, files: String*): typings.shelljs.mod.ShellString = js.native
  /**
    * Removes files. The wildcard `*` is accepted.
    *
    * @param options Available options:
    *        - `-f`: force
    *        - `-r`, `-R`: recursive
    * @param files   Files to remove.
    * @return        Object with shell exit code, stderr and stdout.
    */
  def apply(options: String, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
}
