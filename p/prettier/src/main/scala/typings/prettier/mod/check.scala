package typings.prettier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prettier", "check")
@js.native
object check extends js.Object {
  def apply(source: String): Boolean = js.native
  def apply(source: String, options: Options): Boolean = js.native
}

