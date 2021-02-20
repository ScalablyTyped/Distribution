package typings.rotJs

import typings.rotJs.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("rot-js/lib/text", "TYPE_BG")
  @js.native
  val TYPE_BG: /* 3 */ Double = js.native
  
  @JSImport("rot-js/lib/text", "TYPE_FG")
  @js.native
  val TYPE_FG: /* 2 */ Double = js.native
  
  @JSImport("rot-js/lib/text", "TYPE_NEWLINE")
  @js.native
  val TYPE_NEWLINE: /* 1 */ Double = js.native
  
  @JSImport("rot-js/lib/text", "TYPE_TEXT")
  @js.native
  val TYPE_TEXT: /* 0 */ Double = js.native
  
  @JSImport("rot-js/lib/text", "measure")
  @js.native
  def measure(str: String, maxWidth: Double): Height = js.native
  
  @JSImport("rot-js/lib/text", "tokenize")
  @js.native
  def tokenize(str: String, maxWidth: Double): js.Array[_] = js.native
}
