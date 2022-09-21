package typings.sqlFormatter.astMod

import typings.sqlFormatter.astMod.NodeType.keyword
import typings.sqlFormatter.tokenMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeywordNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var raw: String
  
  var text: String
  
  var tokenType: TokenType
  
  var `type`: keyword
}
object KeywordNode {
  
  inline def apply(raw: String, text: String, tokenType: TokenType, `type`: keyword): KeywordNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeywordNode]
  }
  
  extension [Self <: KeywordNode](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTokenType(value: TokenType): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    
    inline def setType(value: keyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
