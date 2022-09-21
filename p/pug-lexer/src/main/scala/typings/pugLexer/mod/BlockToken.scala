package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.append
import typings.pugLexer.pugLexerStrings.block
import typings.pugLexer.pugLexerStrings.prepend
import typings.pugLexer.pugLexerStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockToken
  extends StObject
     with LexToken[block]
     with _Token {
  
  var mode: replace | prepend | append
  
  var `val`: String
}
object BlockToken {
  
  inline def apply(loc: Loc, mode: replace | prepend | append, `val`: String): BlockToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("block")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockToken]
  }
  
  extension [Self <: BlockToken](x: Self) {
    
    inline def setMode(value: replace | prepend | append): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
