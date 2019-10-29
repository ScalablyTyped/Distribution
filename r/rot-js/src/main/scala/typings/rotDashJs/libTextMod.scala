package typings.rotDashJs

import typings.rotDashJs.rotDashJsNumbers.`0`
import typings.rotDashJs.rotDashJsNumbers.`1`
import typings.rotDashJs.rotDashJsNumbers.`2`
import typings.rotDashJs.rotDashJsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/text", JSImport.Namespace)
@js.native
object libTextMod extends js.Object {
  val TYPE_BG: `3` = js.native
  val TYPE_FG: `2` = js.native
  val TYPE_NEWLINE: `1` = js.native
  val TYPE_TEXT: `0` = js.native
  def measure(str: String, maxWidth: Double): Anon_Height = js.native
  def tokenize(str: String, maxWidth: Double): js.Array[_] = js.native
}

