package typings.sqlFormatter.libSrcLexerTokenMod

import typings.sqlFormatter.anon.Raw
import typings.sqlFormatter.anon.Text
import typings.sqlFormatter.libSrcLexerTokenMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createEofToken(index: Double): Raw = ^.asInstanceOf[js.Dynamic].applyDynamic("createEofToken")(index.asInstanceOf[js.Any]).asInstanceOf[Raw]

inline def isLogicalOperator(`type`: TokenType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLogicalOperator")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isReserved(`type`: TokenType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReserved")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def testToken(compareToken: Text): js.Function1[/* token */ Token, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("testToken")(compareToken.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* token */ Token, Boolean]]
