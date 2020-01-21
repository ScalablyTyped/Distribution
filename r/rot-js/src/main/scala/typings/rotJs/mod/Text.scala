package typings.rotJs.mod

import typings.rotJs.AnonHeight
import typings.rotJs.rotJsNumbers.`0`
import typings.rotJs.rotJsNumbers.`1`
import typings.rotJs.rotJsNumbers.`2`
import typings.rotJs.rotJsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Text")
@js.native
object Text extends js.Object {
  val TYPE_BG: `3` = js.native
  val TYPE_FG: `2` = js.native
  val TYPE_NEWLINE: `1` = js.native
  val TYPE_TEXT: `0` = js.native
  def measure(str: String, maxWidth: Double): AnonHeight = js.native
  def tokenize(str: String, maxWidth: Double): js.Array[_] = js.native
}

