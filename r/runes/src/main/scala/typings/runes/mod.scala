package typings.runes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(text: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("runes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def substr(text: String, start: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(text.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def substr(text: String, start: Double, width: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(text.asInstanceOf[js.Any], start.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[String]
}
