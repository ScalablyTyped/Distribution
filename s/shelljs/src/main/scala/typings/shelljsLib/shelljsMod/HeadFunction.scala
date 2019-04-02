package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadFunction extends js.Object {
  def apply(files: java.lang.String*): ShellString = js.native
  def apply(files: js.Array[java.lang.String]): ShellString = js.native
  def apply(options: HeadOptions, files: java.lang.String*): ShellString = js.native
  def apply(options: HeadOptions, files: js.Array[java.lang.String]): ShellString = js.native
}

