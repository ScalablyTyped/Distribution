package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.each
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EachToken
  extends StObject
     with LexToken[each]
     with _Token {
  
  var code: String
  
  var key: String | Null
  
  var `val`: String
}
object EachToken {
  
  inline def apply(code: String, loc: Loc, `val`: String): EachToken = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("type")("each")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EachToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EachToken] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
