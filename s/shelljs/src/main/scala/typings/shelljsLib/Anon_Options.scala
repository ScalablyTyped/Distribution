package typings
package shelljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Options extends js.Object {
  def apply(
    options: java.lang.String,
    searchRegex: java.lang.String,
    replacement: java.lang.String,
    file: java.lang.String
  ): shelljsLib.shelljsMod.ShellString = js.native
  def apply(
    options: java.lang.String,
    searchRegex: stdLib.RegExp,
    replacement: java.lang.String,
    file: java.lang.String
  ): shelljsLib.shelljsMod.ShellString = js.native
  def apply(searchRegex: java.lang.String, replacement: java.lang.String, file: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
  def apply(searchRegex: stdLib.RegExp, replacement: java.lang.String, file: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
}

