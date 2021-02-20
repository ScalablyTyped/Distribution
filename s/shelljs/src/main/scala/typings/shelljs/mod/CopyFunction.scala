package typings.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyFunction extends StObject {
  
  /**
    * Copies files. The wildcard `*` is accepted.
    *
    * @param options Available options:
    *        - `-f`: force (default behavior)
    *        - `-n`: no-clobber
    *        - `-u`: only copy if source is newer than dest
    *        - `-r`, `-R`: recursive
    *        - `-L`: follow symlinks
    *        - `-P`: don't follow symlinks
    * @param source The source.
    * @param dest   The destination.
    * @return       Object with shell exit code, stderr and stdout.
    */
  def apply(options: String, source: String, dest: String): typings.shelljs.mod.ShellString = js.native
  def apply(options: String, source: js.Array[String], dest: String): typings.shelljs.mod.ShellString = js.native
  /**
    * Copies files. The wildcard `*` is accepted.
    *
    * @param source The source.
    * @param dest   The destination.
    * @return       Object with shell exit code, stderr and stdout.
    */
  def apply(source: String, dest: String): typings.shelljs.mod.ShellString = js.native
  def apply(source: js.Array[String], dest: String): typings.shelljs.mod.ShellString = js.native
}
