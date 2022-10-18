package typings.sqlFormatter.libSrcLexerTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var precedingWhitespace: js.UndefOr[String] = js.undefined
  
  var raw: String
  
  var start: Double
  
  var text: String
  
  var `type`: TokenType
}
object Token {
  
  inline def apply(raw: String, start: Double, text: String, `type`: TokenType): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  extension [Self <: Token](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setPrecedingWhitespace(value: String): Self = StObject.set(x, "precedingWhitespace", value.asInstanceOf[js.Any])
    
    inline def setPrecedingWhitespaceUndefined: Self = StObject.set(x, "precedingWhitespace", js.undefined)
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
