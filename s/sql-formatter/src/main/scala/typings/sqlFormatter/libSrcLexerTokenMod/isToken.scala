package typings.sqlFormatter.libSrcLexerTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isToken {
  
  @JSImport("sql-formatter/lib/src/lexer/token", "isToken")
  @js.native
  val ^ : js.Any = js.native
  
  inline def ARRAY(token: Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ARRAY")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def BY(token: Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("BY")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def SET(token: Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("SET")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def STRUCT(token: Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("STRUCT")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def WINDOW(token: Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("WINDOW")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
