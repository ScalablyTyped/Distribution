package typings.sqlFormatter.libSrcParserAstMod

import typings.sqlFormatter.libSrcParserAstMod.NodeType.parenthesis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParenthesisNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var children: js.Array[AstNode]
  
  var closeParen: String
  
  var openParen: String
  
  var `type`: parenthesis
}
object ParenthesisNode {
  
  inline def apply(children: js.Array[AstNode], closeParen: String, openParen: String, `type`: parenthesis): ParenthesisNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closeParen = closeParen.asInstanceOf[js.Any], openParen = openParen.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParenthesisNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParenthesisNode] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[AstNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: AstNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setCloseParen(value: String): Self = StObject.set(x, "closeParen", value.asInstanceOf[js.Any])
    
    inline def setOpenParen(value: String): Self = StObject.set(x, "openParen", value.asInstanceOf[js.Any])
    
    inline def setType(value: parenthesis): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
