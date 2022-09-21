package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.mixin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixinToken
  extends StObject
     with LexToken[mixin]
     with _Token {
  
  var args: String | Null
  
  var `val`: String
}
object MixinToken {
  
  inline def apply(loc: Loc, `val`: String): MixinToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], args = null)
    __obj.updateDynamic("type")("mixin")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixinToken]
  }
  
  extension [Self <: MixinToken](x: Self) {
    
    inline def setArgs(value: String): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
