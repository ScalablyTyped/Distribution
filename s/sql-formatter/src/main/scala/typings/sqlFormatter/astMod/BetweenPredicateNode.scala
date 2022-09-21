package typings.sqlFormatter.astMod

import typings.sqlFormatter.astMod.NodeType.between_predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BetweenPredicateNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var and: KeywordNode
  
  var between: KeywordNode
  
  var expr1: js.Array[AstNode]
  
  var expr2: js.Array[AstNode]
  
  var `type`: between_predicate
}
object BetweenPredicateNode {
  
  inline def apply(
    and: KeywordNode,
    between: KeywordNode,
    expr1: js.Array[AstNode],
    expr2: js.Array[AstNode],
    `type`: between_predicate
  ): BetweenPredicateNode = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], between = between.asInstanceOf[js.Any], expr1 = expr1.asInstanceOf[js.Any], expr2 = expr2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BetweenPredicateNode]
  }
  
  extension [Self <: BetweenPredicateNode](x: Self) {
    
    inline def setAnd(value: KeywordNode): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setBetween(value: KeywordNode): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
    
    inline def setExpr1(value: js.Array[AstNode]): Self = StObject.set(x, "expr1", value.asInstanceOf[js.Any])
    
    inline def setExpr1Varargs(value: AstNode*): Self = StObject.set(x, "expr1", js.Array(value*))
    
    inline def setExpr2(value: js.Array[AstNode]): Self = StObject.set(x, "expr2", value.asInstanceOf[js.Any])
    
    inline def setExpr2Varargs(value: AstNode*): Self = StObject.set(x, "expr2", js.Array(value*))
    
    inline def setType(value: between_predicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
