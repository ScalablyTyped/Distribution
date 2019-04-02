package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchFunction extends js.Object {
  def apply(files: java.lang.String*): ShellString = js.native
  def apply(files: js.Array[java.lang.String]): ShellString = js.native
  def apply(options: TouchOptionsArray, files: java.lang.String*): ShellString = js.native
  def apply(options: TouchOptionsArray, files: js.Array[java.lang.String]): ShellString = js.native
  def apply(options: TouchOptionsLiteral, files: java.lang.String*): ShellString = js.native
  def apply(options: TouchOptionsLiteral, files: js.Array[java.lang.String]): ShellString = js.native
}

