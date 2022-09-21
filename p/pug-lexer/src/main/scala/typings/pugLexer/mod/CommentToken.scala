package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentToken
  extends StObject
     with LexToken[comment]
     with _Token {
  
  var buffer: Boolean
  
  var `val`: String
}
object CommentToken {
  
  inline def apply(buffer: Boolean, loc: Loc, `val`: String): CommentToken = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("comment")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentToken]
  }
  
  extension [Self <: CommentToken](x: Self) {
    
    inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
