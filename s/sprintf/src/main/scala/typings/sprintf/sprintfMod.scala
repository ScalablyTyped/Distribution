package typings.sprintf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sprintf", JSImport.Namespace)
@js.native
object sprintfMod extends js.Object {
  def sprintf(fmt: String, args: js.Any*): String = js.native
  def vsprintf(fmt: String, args: js.Array[_]): String = js.native
}

