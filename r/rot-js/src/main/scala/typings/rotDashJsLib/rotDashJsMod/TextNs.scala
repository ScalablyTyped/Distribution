package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Text")
@js.native
object TextNs extends js.Object {
  // Added to support `tokenize`
  trait Token extends js.Object {
    var `type`: scala.Double
    var value: js.UndefOr[java.lang.String] = js.undefined
  }
  
  val RE_COLORS: stdLib.RegExp = js.native
  /* token types */
  val TYPE_BG: scala.Double = js.native
  val TYPE_FG: scala.Double = js.native
  val TYPE_NEWLINE: scala.Double = js.native
  val TYPE_TEXT: scala.Double = js.native
  def measure(str: java.lang.String, maxWidth: scala.Double): rotDashJsLib.rotDashJsMod.Size = js.native
  def tokenize(str: java.lang.String, maxWidth: scala.Double): rotDashJsLib.rotDashJsMod.Global.Array[Token] = js.native
}

