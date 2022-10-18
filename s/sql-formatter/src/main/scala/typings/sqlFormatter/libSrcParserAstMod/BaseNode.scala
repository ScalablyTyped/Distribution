package typings.sqlFormatter.libSrcParserAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseNode extends StObject {
  
  var leadingComments: js.UndefOr[js.Array[CommentNode]] = js.undefined
  
  var trailingComments: js.UndefOr[js.Array[CommentNode]] = js.undefined
}
object BaseNode {
  
  inline def apply(): BaseNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseNode]
  }
  
  extension [Self <: BaseNode](x: Self) {
    
    inline def setLeadingComments(value: js.Array[CommentNode]): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
    
    inline def setLeadingCommentsUndefined: Self = StObject.set(x, "leadingComments", js.undefined)
    
    inline def setLeadingCommentsVarargs(value: CommentNode*): Self = StObject.set(x, "leadingComments", js.Array(value*))
    
    inline def setTrailingComments(value: js.Array[CommentNode]): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
    
    inline def setTrailingCommentsUndefined: Self = StObject.set(x, "trailingComments", js.undefined)
    
    inline def setTrailingCommentsVarargs(value: CommentNode*): Self = StObject.set(x, "trailingComments", js.Array(value*))
  }
}
