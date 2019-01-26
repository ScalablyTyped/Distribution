package typings
package shelljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FilesOptionsArray extends js.Object {
  def apply(files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  def apply(files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def apply(
    options: shelljsLib.shelljsMod.TouchOptionsArray,
    files: (java.lang.String | js.Array[java.lang.String])*
  ): shelljsLib.shelljsMod.ShellString = js.native
  def apply(
    options: shelljsLib.shelljsMod.TouchOptionsLiteral,
    files: (java.lang.String | js.Array[java.lang.String])*
  ): shelljsLib.shelljsMod.ShellString = js.native
}

