package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.`while`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhileToken
  extends StObject
     with LexToken[`while`]
     with _Token {
  
  var `val`: String
}
object WhileToken {
  
  inline def apply(loc: Loc, `val`: String): WhileToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("while")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhileToken]
  }
  
  extension [Self <: WhileToken](x: Self) {
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
