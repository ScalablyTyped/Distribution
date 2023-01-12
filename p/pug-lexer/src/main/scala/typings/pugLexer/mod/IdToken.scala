package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdToken
  extends StObject
     with LexToken[id]
     with _Token {
  
  var `val`: String
}
object IdToken {
  
  inline def apply(loc: Loc, `val`: String): IdToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("id")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdToken] (val x: Self) extends AnyVal {
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
