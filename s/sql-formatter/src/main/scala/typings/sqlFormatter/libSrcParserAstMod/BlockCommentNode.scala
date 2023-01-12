package typings.sqlFormatter.libSrcParserAstMod

import typings.sqlFormatter.libSrcParserAstMod.NodeType.block_comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockCommentNode
  extends StObject
     with BaseNode
     with AstNode
     with CommentNode {
  
  var precedingWhitespace: String
  
  var text: String
  
  var `type`: block_comment
}
object BlockCommentNode {
  
  inline def apply(precedingWhitespace: String, text: String, `type`: block_comment): BlockCommentNode = {
    val __obj = js.Dynamic.literal(precedingWhitespace = precedingWhitespace.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockCommentNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockCommentNode] (val x: Self) extends AnyVal {
    
    inline def setPrecedingWhitespace(value: String): Self = StObject.set(x, "precedingWhitespace", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: block_comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
