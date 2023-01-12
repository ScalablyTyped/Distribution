package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.Ampersandattributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndAttributesToken
  extends StObject
     with LexToken[Ampersandattributes]
     with _Token {
  
  var `val`: String
}
object AndAttributesToken {
  
  inline def apply(loc: Loc, `val`: String): AndAttributesToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("&attributes")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndAttributesToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AndAttributesToken] (val x: Self) extends AnyVal {
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
