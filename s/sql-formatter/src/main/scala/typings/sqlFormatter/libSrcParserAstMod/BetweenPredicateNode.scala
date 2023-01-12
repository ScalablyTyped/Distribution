package typings.sqlFormatter.libSrcParserAstMod

import typings.sqlFormatter.libSrcParserAstMod.NodeType.between_predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BetweenPredicateNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var andKw: KeywordNode
  
  var betweenKw: KeywordNode
  
  var expr1: js.Array[AstNode]
  
  var expr2: js.Array[AstNode]
  
  var `type`: between_predicate
}
object BetweenPredicateNode {
  
  inline def apply(
    andKw: KeywordNode,
    betweenKw: KeywordNode,
    expr1: js.Array[AstNode],
    expr2: js.Array[AstNode],
    `type`: between_predicate
  ): BetweenPredicateNode = {
    val __obj = js.Dynamic.literal(andKw = andKw.asInstanceOf[js.Any], betweenKw = betweenKw.asInstanceOf[js.Any], expr1 = expr1.asInstanceOf[js.Any], expr2 = expr2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BetweenPredicateNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BetweenPredicateNode] (val x: Self) extends AnyVal {
    
    inline def setAndKw(value: KeywordNode): Self = StObject.set(x, "andKw", value.asInstanceOf[js.Any])
    
    inline def setBetweenKw(value: KeywordNode): Self = StObject.set(x, "betweenKw", value.asInstanceOf[js.Any])
    
    inline def setExpr1(value: js.Array[AstNode]): Self = StObject.set(x, "expr1", value.asInstanceOf[js.Any])
    
    inline def setExpr1Varargs(value: AstNode*): Self = StObject.set(x, "expr1", js.Array(value*))
    
    inline def setExpr2(value: js.Array[AstNode]): Self = StObject.set(x, "expr2", value.asInstanceOf[js.Any])
    
    inline def setExpr2Varargs(value: AstNode*): Self = StObject.set(x, "expr2", js.Array(value*))
    
    inline def setType(value: between_predicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
