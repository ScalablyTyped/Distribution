package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.indent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndentToken
  extends StObject
     with LexToken[indent]
     with _Token {
  
  var `val`: Double
}
object IndentToken {
  
  inline def apply(loc: Loc, `val`: Double): IndentToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("indent")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndentToken]
  }
  
  extension [Self <: IndentToken](x: Self) {
    
    inline def setVal(value: Double): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
