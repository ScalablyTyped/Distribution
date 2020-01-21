package typings.shelljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shelljs", "which")
@js.native
object which extends js.Object {
  def apply(command: String): ShellString = js.native
}

