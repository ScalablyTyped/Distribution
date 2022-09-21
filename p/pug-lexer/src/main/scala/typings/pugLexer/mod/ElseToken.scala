package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.`else`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElseToken
  extends StObject
     with LexToken[`else`]
     with _Token {
  
  var `val`: String
}
object ElseToken {
  
  inline def apply(loc: Loc, `val`: String): ElseToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("else")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElseToken]
  }
  
  extension [Self <: ElseToken](x: Self) {
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
