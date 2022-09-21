package typings.sqlFormatter.astMod

import typings.sqlFormatter.astMod.NodeType.statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatementNode
  extends StObject
     with BaseNode {
  
  var children: js.Array[AstNode]
  
  var hasSemicolon: Boolean
  
  var `type`: statement
}
object StatementNode {
  
  inline def apply(children: js.Array[AstNode], hasSemicolon: Boolean, `type`: statement): StatementNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], hasSemicolon = hasSemicolon.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatementNode]
  }
  
  extension [Self <: StatementNode](x: Self) {
    
    inline def setChildren(value: js.Array[AstNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: AstNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setHasSemicolon(value: Boolean): Self = StObject.set(x, "hasSemicolon", value.asInstanceOf[js.Any])
    
    inline def setType(value: statement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
