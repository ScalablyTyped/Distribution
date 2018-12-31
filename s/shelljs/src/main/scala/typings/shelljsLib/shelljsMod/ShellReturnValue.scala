package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellReturnValue extends ExecOutputReturnValue {
  def cat(files: java.lang.String*): ShellString = js.native
  def exec(): ExecOutputReturnValue = js.native
  def exec(callback: ExecCallback): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def grep(files: (java.lang.String | js.Array[java.lang.String])*): ShellString = js.native
  def sed(replacement: java.lang.String, file: java.lang.String): ShellString = js.native
  /**
    * Analogous to the redirection operator > in Unix, but works with JavaScript strings (such as those returned by cat, grep, etc). Like Unix redirections, to() will overwrite any existing file!
    * @param file The file to use.
    */
  def to(file: java.lang.String): scala.Unit = js.native
  /**
    * Analogous to the redirect-and-append operator >> in Unix, but works with JavaScript strings (such as those returned by cat, grep, etc).
    * @param file The file to append to.
    */
  def toEnd(file: java.lang.String): scala.Unit = js.native
}

