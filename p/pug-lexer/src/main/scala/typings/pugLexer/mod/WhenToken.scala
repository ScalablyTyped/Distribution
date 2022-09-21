package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.when
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhenToken
  extends StObject
     with LexToken[when]
     with _Token {
  
  var `val`: String
}
object WhenToken {
  
  inline def apply(loc: Loc, `val`: String): WhenToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("when")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhenToken]
  }
  
  extension [Self <: WhenToken](x: Self) {
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
