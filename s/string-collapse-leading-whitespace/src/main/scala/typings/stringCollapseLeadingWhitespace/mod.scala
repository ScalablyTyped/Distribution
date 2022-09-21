package typings.stringCollapseLeadingWhitespace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("string-collapse-leading-whitespace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collWhitespace(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("collWhitespace")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def collWhitespace(str: String, lineBreakLimit: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("collWhitespace")(str.asInstanceOf[js.Any], lineBreakLimit.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("string-collapse-leading-whitespace", "version")
  @js.native
  val version: String = js.native
}
