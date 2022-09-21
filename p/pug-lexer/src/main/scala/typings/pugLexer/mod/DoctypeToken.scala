package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.doctype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoctypeToken
  extends StObject
     with LexToken[doctype]
     with _Token {
  
  var `val`: String
}
object DoctypeToken {
  
  inline def apply(loc: Loc, `val`: String): DoctypeToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("doctype")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoctypeToken]
  }
  
  extension [Self <: DoctypeToken](x: Self) {
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
