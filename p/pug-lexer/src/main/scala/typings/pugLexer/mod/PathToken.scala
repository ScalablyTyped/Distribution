package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathToken
  extends StObject
     with LexToken[path]
     with _Token {
  
  var `val`: String
}
object PathToken {
  
  inline def apply(loc: Loc, `val`: String): PathToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("path")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathToken] (val x: Self) extends AnyVal {
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
