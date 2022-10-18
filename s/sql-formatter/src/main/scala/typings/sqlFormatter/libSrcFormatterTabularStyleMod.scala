package typings.sqlFormatter

import typings.sqlFormatter.libSrcFormatOptionsMod.IndentStyle
import typings.sqlFormatter.libSrcLexerTokenMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcFormatterTabularStyleMod {
  
  @JSImport("sql-formatter/lib/src/formatter/tabularStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(tokenText: String, indentStyle: IndentStyle): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tokenText.asInstanceOf[js.Any], indentStyle.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isTabularToken(`type`: TokenType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTabularToken")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
