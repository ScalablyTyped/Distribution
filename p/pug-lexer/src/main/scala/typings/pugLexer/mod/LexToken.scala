package typings.pugLexer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexToken[Type /* <: LexTokenType */] extends StObject {
  
  var loc: Loc
  
  var `type`: Type
}
object LexToken {
  
  inline def apply[Type /* <: LexTokenType */](loc: Loc, `type`: Type): LexToken[Type] = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexToken[Type]]
  }
  
  extension [Self <: LexToken[?], Type /* <: LexTokenType */](x: Self & LexToken[Type]) {
    
    inline def setLoc(value: Loc): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
