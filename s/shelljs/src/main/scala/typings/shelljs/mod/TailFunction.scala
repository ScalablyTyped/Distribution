package typings.shelljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TailFunction extends js.Object {
  
  def apply(files: String*): ShellString = js.native
  def apply(files: js.Array[String]): ShellString = js.native
  def apply(options: TailOptions, files: String*): ShellString = js.native
  def apply(options: TailOptions, files: js.Array[String]): ShellString = js.native
}
