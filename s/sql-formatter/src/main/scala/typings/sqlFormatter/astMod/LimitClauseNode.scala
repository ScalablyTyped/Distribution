package typings.sqlFormatter.astMod

import typings.sqlFormatter.astMod.NodeType.limit_clause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LimitClauseNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var count: js.Array[AstNode]
  
  var name: KeywordNode
  
  var offset: js.UndefOr[js.Array[AstNode]] = js.undefined
  
  var `type`: limit_clause
}
object LimitClauseNode {
  
  inline def apply(count: js.Array[AstNode], name: KeywordNode, `type`: limit_clause): LimitClauseNode = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitClauseNode]
  }
  
  extension [Self <: LimitClauseNode](x: Self) {
    
    inline def setCount(value: js.Array[AstNode]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountVarargs(value: AstNode*): Self = StObject.set(x, "count", js.Array(value*))
    
    inline def setName(value: KeywordNode): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: js.Array[AstNode]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetVarargs(value: AstNode*): Self = StObject.set(x, "offset", js.Array(value*))
    
    inline def setType(value: limit_clause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
