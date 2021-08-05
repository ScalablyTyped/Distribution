package typings.spdxExpressionParse

import typings.spdxExpressionParse.mod.Info
import typings.spdxExpressionParse.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  inline def apply(tokens: js.Array[Token]): Info = ^.asInstanceOf[js.Dynamic].apply(tokens.asInstanceOf[js.Any]).asInstanceOf[Info]
  
  @JSImport("spdx-expression-parse/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
