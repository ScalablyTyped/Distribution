package typings
package shelljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FilesOptions extends js.Object {
  def apply(
    options: java.lang.String,
    regex_filter: java.lang.String,
    files: (java.lang.String | js.Array[java.lang.String])*
  ): shelljsLib.shelljsMod.ShellString = js.native
  def apply(
    options: java.lang.String,
    regex_filter: stdLib.RegExp,
    files: (java.lang.String | js.Array[java.lang.String])*
  ): shelljsLib.shelljsMod.ShellString = js.native
  def apply(regex_filter: java.lang.String, files: (java.lang.String | js.Array[java.lang.String])*): shelljsLib.shelljsMod.ShellString = js.native
  def apply(regex_filter: stdLib.RegExp, files: (java.lang.String | js.Array[java.lang.String])*): shelljsLib.shelljsMod.ShellString = js.native
}

