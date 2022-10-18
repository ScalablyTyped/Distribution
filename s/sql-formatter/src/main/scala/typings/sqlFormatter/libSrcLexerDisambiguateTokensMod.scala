package typings.sqlFormatter

import typings.sqlFormatter.libSrcLexerTokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcLexerDisambiguateTokensMod {
  
  @JSImport("sql-formatter/lib/src/lexer/disambiguateTokens", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disambiguateTokens(tokens: js.Array[Token]): js.Array[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("disambiguateTokens")(tokens.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
}
