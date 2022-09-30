package typings.sqlFormatter.astMod

import typings.sqlFormatter.astMod.NodeType.all_columns_asterisk
import typings.sqlFormatter.astMod.NodeType.array_subscript
import typings.sqlFormatter.astMod.NodeType.between_predicate
import typings.sqlFormatter.astMod.NodeType.block_comment
import typings.sqlFormatter.astMod.NodeType.case_else
import typings.sqlFormatter.astMod.NodeType.case_expression
import typings.sqlFormatter.astMod.NodeType.case_when
import typings.sqlFormatter.astMod.NodeType.clause
import typings.sqlFormatter.astMod.NodeType.comma
import typings.sqlFormatter.astMod.NodeType.function_call
import typings.sqlFormatter.astMod.NodeType.identifier
import typings.sqlFormatter.astMod.NodeType.keyword
import typings.sqlFormatter.astMod.NodeType.limit_clause
import typings.sqlFormatter.astMod.NodeType.line_comment
import typings.sqlFormatter.astMod.NodeType.literal
import typings.sqlFormatter.astMod.NodeType.operator
import typings.sqlFormatter.astMod.NodeType.parameter
import typings.sqlFormatter.astMod.NodeType.parenthesis
import typings.sqlFormatter.astMod.NodeType.property_access
import typings.sqlFormatter.astMod.NodeType.set_operation
import typings.sqlFormatter.tokenMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sqlFormatter.astMod.ClauseNode
  - typings.sqlFormatter.astMod.SetOperationNode
  - typings.sqlFormatter.astMod.FunctionCallNode
  - typings.sqlFormatter.astMod.ArraySubscriptNode
  - typings.sqlFormatter.astMod.PropertyAccessNode
  - typings.sqlFormatter.astMod.ParenthesisNode
  - typings.sqlFormatter.astMod.BetweenPredicateNode
  - typings.sqlFormatter.astMod.CaseExpressionNode
  - typings.sqlFormatter.astMod.CaseWhenNode
  - typings.sqlFormatter.astMod.CaseElseNode
  - typings.sqlFormatter.astMod.LimitClauseNode
  - typings.sqlFormatter.astMod.AllColumnsAsteriskNode
  - typings.sqlFormatter.astMod.LiteralNode
  - typings.sqlFormatter.astMod.IdentifierNode
  - typings.sqlFormatter.astMod.KeywordNode
  - typings.sqlFormatter.astMod.ParameterNode
  - typings.sqlFormatter.astMod.OperatorNode
  - typings.sqlFormatter.astMod.CommaNode
  - typings.sqlFormatter.astMod.LineCommentNode
  - typings.sqlFormatter.astMod.BlockCommentNode
*/
trait AstNode extends StObject
object AstNode {
  
  inline def AllColumnsAsteriskNode(`type`: all_columns_asterisk): typings.sqlFormatter.astMod.AllColumnsAsteriskNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.AllColumnsAsteriskNode]
  }
  
  inline def ArraySubscriptNode(array: IdentifierNode | KeywordNode, parenthesis: ParenthesisNode, `type`: array_subscript): typings.sqlFormatter.astMod.ArraySubscriptNode = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], parenthesis = parenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.ArraySubscriptNode]
  }
  
  inline def BetweenPredicateNode(
    andKw: KeywordNode,
    betweenKw: KeywordNode,
    expr1: js.Array[AstNode],
    expr2: js.Array[AstNode],
    `type`: between_predicate
  ): typings.sqlFormatter.astMod.BetweenPredicateNode = {
    val __obj = js.Dynamic.literal(andKw = andKw.asInstanceOf[js.Any], betweenKw = betweenKw.asInstanceOf[js.Any], expr1 = expr1.asInstanceOf[js.Any], expr2 = expr2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.BetweenPredicateNode]
  }
  
  inline def BlockCommentNode(precedingWhitespace: String, text: String, `type`: block_comment): typings.sqlFormatter.astMod.BlockCommentNode = {
    val __obj = js.Dynamic.literal(precedingWhitespace = precedingWhitespace.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.BlockCommentNode]
  }
  
  inline def CaseElseNode(elseKw: KeywordNode, result: js.Array[AstNode], `type`: case_else): typings.sqlFormatter.astMod.CaseElseNode = {
    val __obj = js.Dynamic.literal(elseKw = elseKw.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.CaseElseNode]
  }
  
  inline def CaseExpressionNode(
    caseKw: KeywordNode,
    clauses: js.Array[CaseWhenNode | CaseElseNode],
    endKw: KeywordNode,
    expr: js.Array[AstNode],
    `type`: case_expression
  ): typings.sqlFormatter.astMod.CaseExpressionNode = {
    val __obj = js.Dynamic.literal(caseKw = caseKw.asInstanceOf[js.Any], clauses = clauses.asInstanceOf[js.Any], endKw = endKw.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.CaseExpressionNode]
  }
  
  inline def CaseWhenNode(
    condition: js.Array[AstNode],
    result: js.Array[AstNode],
    thenKw: KeywordNode,
    `type`: case_when,
    whenKw: KeywordNode
  ): typings.sqlFormatter.astMod.CaseWhenNode = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], thenKw = thenKw.asInstanceOf[js.Any], whenKw = whenKw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.CaseWhenNode]
  }
  
  inline def ClauseNode(children: js.Array[AstNode], nameKw: KeywordNode, `type`: clause): typings.sqlFormatter.astMod.ClauseNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], nameKw = nameKw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.ClauseNode]
  }
  
  inline def CommaNode(`type`: comma): typings.sqlFormatter.astMod.CommaNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.CommaNode]
  }
  
  inline def FunctionCallNode(nameKw: KeywordNode, parenthesis: ParenthesisNode, `type`: function_call): typings.sqlFormatter.astMod.FunctionCallNode = {
    val __obj = js.Dynamic.literal(nameKw = nameKw.asInstanceOf[js.Any], parenthesis = parenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.FunctionCallNode]
  }
  
  inline def IdentifierNode(text: String, `type`: identifier): typings.sqlFormatter.astMod.IdentifierNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.IdentifierNode]
  }
  
  inline def KeywordNode(raw: String, text: String, tokenType: TokenType, `type`: keyword): typings.sqlFormatter.astMod.KeywordNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.KeywordNode]
  }
  
  inline def LimitClauseNode(count: js.Array[AstNode], limitKw: KeywordNode, `type`: limit_clause): typings.sqlFormatter.astMod.LimitClauseNode = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], limitKw = limitKw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.LimitClauseNode]
  }
  
  inline def LineCommentNode(precedingWhitespace: String, text: String, `type`: line_comment): typings.sqlFormatter.astMod.LineCommentNode = {
    val __obj = js.Dynamic.literal(precedingWhitespace = precedingWhitespace.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.LineCommentNode]
  }
  
  inline def LiteralNode(text: String, `type`: literal): typings.sqlFormatter.astMod.LiteralNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.LiteralNode]
  }
  
  inline def OperatorNode(text: String, `type`: operator): typings.sqlFormatter.astMod.OperatorNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.OperatorNode]
  }
  
  inline def ParameterNode(text: String, `type`: parameter): typings.sqlFormatter.astMod.ParameterNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.ParameterNode]
  }
  
  inline def ParenthesisNode(children: js.Array[AstNode], closeParen: String, openParen: String, `type`: parenthesis): typings.sqlFormatter.astMod.ParenthesisNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closeParen = closeParen.asInstanceOf[js.Any], openParen = openParen.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.ParenthesisNode]
  }
  
  inline def PropertyAccessNode(
    `object`: AstNode,
    property: IdentifierNode | ArraySubscriptNode | AllColumnsAsteriskNode,
    `type`: property_access
  ): typings.sqlFormatter.astMod.PropertyAccessNode = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.PropertyAccessNode]
  }
  
  inline def SetOperationNode(children: js.Array[AstNode], nameKw: KeywordNode, `type`: set_operation): typings.sqlFormatter.astMod.SetOperationNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], nameKw = nameKw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.SetOperationNode]
  }
}
