package typings.rotDashJs.rotDashJsMod

import typings.rotDashJs.rotDashJsMod.Global.Array
import typings.rotDashJs.rotDashJsMod.TextNs.Token
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Text")
@js.native
object TextNs extends js.Object {
  // Added to support `tokenize`
  trait Token extends js.Object {
    var `type`: Double
    var value: js.UndefOr[String] = js.undefined
  }
  
  val RE_COLORS: RegExp = js.native
  /* token types */
  val TYPE_BG: Double = js.native
  val TYPE_FG: Double = js.native
  val TYPE_NEWLINE: Double = js.native
  val TYPE_TEXT: Double = js.native
  def measure(str: String, maxWidth: Double): Size = js.native
  def tokenize(str: String, maxWidth: Double): Array[Token] = js.native
}

