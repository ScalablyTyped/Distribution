package typings.rotJs

import typings.rotJs.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rot-js/lib/text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
  
  val TYPE_BG: /* 3 */ Double = js.native
  
  val TYPE_FG: /* 2 */ Double = js.native
  
  val TYPE_NEWLINE: /* 1 */ Double = js.native
  
  val TYPE_TEXT: /* 0 */ Double = js.native
  
  def measure(str: String, maxWidth: Double): Height = js.native
  
  def tokenize(str: String, maxWidth: Double): js.Array[_] = js.native
}
