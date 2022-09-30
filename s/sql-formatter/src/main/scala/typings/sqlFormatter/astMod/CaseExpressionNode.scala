package typings.sqlFormatter.astMod

import typings.sqlFormatter.astMod.NodeType.case_expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaseExpressionNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var caseKw: KeywordNode
  
  var clauses: js.Array[CaseWhenNode | CaseElseNode]
  
  var endKw: KeywordNode
  
  var expr: js.Array[AstNode]
  
  var `type`: case_expression
}
object CaseExpressionNode {
  
  inline def apply(
    caseKw: KeywordNode,
    clauses: js.Array[CaseWhenNode | CaseElseNode],
    endKw: KeywordNode,
    expr: js.Array[AstNode],
    `type`: case_expression
  ): CaseExpressionNode = {
    val __obj = js.Dynamic.literal(caseKw = caseKw.asInstanceOf[js.Any], clauses = clauses.asInstanceOf[js.Any], endKw = endKw.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseExpressionNode]
  }
  
  extension [Self <: CaseExpressionNode](x: Self) {
    
    inline def setCaseKw(value: KeywordNode): Self = StObject.set(x, "caseKw", value.asInstanceOf[js.Any])
    
    inline def setClauses(value: js.Array[CaseWhenNode | CaseElseNode]): Self = StObject.set(x, "clauses", value.asInstanceOf[js.Any])
    
    inline def setClausesVarargs(value: (CaseWhenNode | CaseElseNode)*): Self = StObject.set(x, "clauses", js.Array(value*))
    
    inline def setEndKw(value: KeywordNode): Self = StObject.set(x, "endKw", value.asInstanceOf[js.Any])
    
    inline def setExpr(value: js.Array[AstNode]): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setExprVarargs(value: AstNode*): Self = StObject.set(x, "expr", js.Array(value*))
    
    inline def setType(value: case_expression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
