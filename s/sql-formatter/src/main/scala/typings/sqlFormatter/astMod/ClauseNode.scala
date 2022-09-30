package typings.sqlFormatter.astMod

import typings.sqlFormatter.astMod.NodeType.clause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClauseNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var children: js.Array[AstNode]
  
  var nameKw: KeywordNode
  
  var `type`: clause
}
object ClauseNode {
  
  inline def apply(children: js.Array[AstNode], nameKw: KeywordNode, `type`: clause): ClauseNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], nameKw = nameKw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClauseNode]
  }
  
  extension [Self <: ClauseNode](x: Self) {
    
    inline def setChildren(value: js.Array[AstNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: AstNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setNameKw(value: KeywordNode): Self = StObject.set(x, "nameKw", value.asInstanceOf[js.Any])
    
    inline def setType(value: clause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
