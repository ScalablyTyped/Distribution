package typings.rotJs

import typings.rotJs.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTextMod {
  
  @JSImport("rot-js/lib/text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def measure(str: String, maxWidth: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(str.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any])).asInstanceOf[Height]
  
  inline def tokenize(str: String, maxWidth: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(str.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
