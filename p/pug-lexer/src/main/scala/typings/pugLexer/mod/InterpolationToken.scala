package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolationToken
  extends StObject
     with LexToken[interpolation]
     with _Token {
  
  var `val`: String
}
object InterpolationToken {
  
  inline def apply(loc: Loc, `val`: String): InterpolationToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interpolation")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationToken]
  }
  
  extension [Self <: InterpolationToken](x: Self) {
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
