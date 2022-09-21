package typings.spaceSeparatedTokens

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("space-separated-tokens", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(value: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def stringify(values: js.Array[String | Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(values.asInstanceOf[js.Any]).asInstanceOf[String]
}
