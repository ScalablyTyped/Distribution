package typings.sqlFormatter.astMod

import typings.sqlFormatter.astMod.NodeType.block_comment
import typings.sqlFormatter.astMod.NodeType.line_comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sqlFormatter.astMod.LineCommentNode
  - typings.sqlFormatter.astMod.BlockCommentNode
*/
trait CommentNode extends StObject
object CommentNode {
  
  inline def BlockCommentNode(precedingWhitespace: String, text: String, `type`: block_comment): typings.sqlFormatter.astMod.BlockCommentNode = {
    val __obj = js.Dynamic.literal(precedingWhitespace = precedingWhitespace.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.BlockCommentNode]
  }
  
  inline def LineCommentNode(precedingWhitespace: String, text: String, `type`: line_comment): typings.sqlFormatter.astMod.LineCommentNode = {
    val __obj = js.Dynamic.literal(precedingWhitespace = precedingWhitespace.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.LineCommentNode]
  }
}
