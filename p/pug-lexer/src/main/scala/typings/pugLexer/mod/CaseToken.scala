package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.`case`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaseToken
  extends StObject
     with LexToken[`case`]
     with _Token {
  
  var `val`: String
}
object CaseToken {
  
  inline def apply(loc: Loc, `val`: String): CaseToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("case")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseToken]
  }
  
  extension [Self <: CaseToken](x: Self) {
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
