package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.`class`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassToken
  extends StObject
     with LexToken[`class`]
     with _Token {
  
  var `val`: String
}
object ClassToken {
  
  inline def apply(loc: Loc, `val`: String): ClassToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("class")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassToken] (val x: Self) extends AnyVal {
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
