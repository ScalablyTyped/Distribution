package typings.sqlFormatter.astMod

import typings.sqlFormatter.astMod.NodeType.set_operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetOperationNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var children: js.Array[AstNode]
  
  var nameKw: KeywordNode
  
  var `type`: set_operation
}
object SetOperationNode {
  
  inline def apply(children: js.Array[AstNode], nameKw: KeywordNode, `type`: set_operation): SetOperationNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], nameKw = nameKw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOperationNode]
  }
  
  extension [Self <: SetOperationNode](x: Self) {
    
    inline def setChildren(value: js.Array[AstNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: AstNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setNameKw(value: KeywordNode): Self = StObject.set(x, "nameKw", value.asInstanceOf[js.Any])
    
    inline def setType(value: set_operation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
