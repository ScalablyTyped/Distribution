package typings.sqlFormatter.astMod

import typings.sqlFormatter.astMod.NodeType.line_comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineCommentNode
  extends StObject
     with BaseNode
     with AstNode
     with CommentNode {
  
  var precedingWhitespace: String
  
  var text: String
  
  var `type`: line_comment
}
object LineCommentNode {
  
  inline def apply(precedingWhitespace: String, text: String, `type`: line_comment): LineCommentNode = {
    val __obj = js.Dynamic.literal(precedingWhitespace = precedingWhitespace.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineCommentNode]
  }
  
  extension [Self <: LineCommentNode](x: Self) {
    
    inline def setPrecedingWhitespace(value: String): Self = StObject.set(x, "precedingWhitespace", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: line_comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
