package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.`else-if`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElseIfToken
  extends StObject
     with LexToken[`else-if`]
     with _Token {
  
  var `val`: String
}
object ElseIfToken {
  
  inline def apply(loc: Loc, `val`: String): ElseIfToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("else-if")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElseIfToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElseIfToken] (val x: Self) extends AnyVal {
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
