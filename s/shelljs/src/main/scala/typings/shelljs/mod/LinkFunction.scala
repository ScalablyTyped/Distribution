package typings.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkFunction extends StObject {
  
  /**
    * Links source to dest. Use `-f` to force the link, should dest already exist.
    *
    * @param options Available options:
    *        - `-s`: Create a symbolic link, defaults to a hardlink
    *        - `-f`: Force creation
    * @param source The source.
    * @param dest   The destination.
    * @return       Object with shell exit code, stderr and stdout.
    */
  def apply(options: String, source: String, dest: String): typings.shelljs.mod.ShellString = js.native
  /**
    * Links source to dest. Use `-f` to force the link, should dest already exist.
    *
    * @param source The source.
    * @param dest   The destination.
    * @return       Object with shell exit code, stderr and stdout.
    */
  def apply(source: String, dest: String): typings.shelljs.mod.ShellString = js.native
}
