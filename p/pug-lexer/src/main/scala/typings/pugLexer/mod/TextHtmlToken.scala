package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.`text-html`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextHtmlToken
  extends StObject
     with LexToken[`text-html`]
     with _Token {
  
  var `val`: String
}
object TextHtmlToken {
  
  inline def apply(loc: Loc, `val`: String): TextHtmlToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("text-html")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextHtmlToken]
  }
  
  extension [Self <: TextHtmlToken](x: Self) {
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
