package typings.sqlQueryIdentifier

import typings.sqlQueryIdentifier.definesMod.Dialect
import typings.sqlQueryIdentifier.definesMod.State
import typings.sqlQueryIdentifier.definesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenizerMod {
  
  @JSImport("sql-query-identifier/lib/tokenizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scanToken(state: State): Token = ^.asInstanceOf[js.Dynamic].applyDynamic("scanToken")(state.asInstanceOf[js.Any]).asInstanceOf[Token]
  inline def scanToken(state: State, dialect: Dialect): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("scanToken")(state.asInstanceOf[js.Any], dialect.asInstanceOf[js.Any])).asInstanceOf[Token]
}
