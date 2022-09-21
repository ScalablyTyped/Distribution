package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.eachOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EachOfToken
  extends StObject
     with LexToken[eachOf]
     with _Token {
  
  var code: String
  
  var `val`: String
  
  var value: String
}
object EachOfToken {
  
  inline def apply(code: String, loc: Loc, `val`: String, value: String): EachOfToken = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("eachOf")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EachOfToken]
  }
  
  extension [Self <: EachOfToken](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
