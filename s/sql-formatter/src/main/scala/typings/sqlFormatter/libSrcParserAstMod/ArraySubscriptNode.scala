package typings.sqlFormatter.libSrcParserAstMod

import typings.sqlFormatter.libSrcParserAstMod.NodeType.array_subscript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArraySubscriptNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var array: IdentifierNode | KeywordNode
  
  var parenthesis: ParenthesisNode
  
  var `type`: array_subscript
}
object ArraySubscriptNode {
  
  inline def apply(array: IdentifierNode | KeywordNode, parenthesis: ParenthesisNode, `type`: array_subscript): ArraySubscriptNode = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], parenthesis = parenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArraySubscriptNode]
  }
  
  extension [Self <: ArraySubscriptNode](x: Self) {
    
    inline def setArray(value: IdentifierNode | KeywordNode): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setParenthesis(value: ParenthesisNode): Self = StObject.set(x, "parenthesis", value.asInstanceOf[js.Any])
    
    inline def setType(value: array_subscript): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
