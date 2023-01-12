package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextToken
  extends StObject
     with LexToken[text]
     with _Token {
  
  var `val`: String
}
object TextToken {
  
  inline def apply(loc: Loc, `val`: String): TextToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("text")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextToken] (val x: Self) extends AnyVal {
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
