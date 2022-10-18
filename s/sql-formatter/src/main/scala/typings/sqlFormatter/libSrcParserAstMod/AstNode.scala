package typings.sqlFormatter.libSrcParserAstMod

import typings.sqlFormatter.libSrcLexerTokenMod.TokenType
import typings.sqlFormatter.libSrcParserAstMod.NodeType.all_columns_asterisk
import typings.sqlFormatter.libSrcParserAstMod.NodeType.array_subscript
import typings.sqlFormatter.libSrcParserAstMod.NodeType.between_predicate
import typings.sqlFormatter.libSrcParserAstMod.NodeType.block_comment
import typings.sqlFormatter.libSrcParserAstMod.NodeType.case_else
import typings.sqlFormatter.libSrcParserAstMod.NodeType.case_expression
import typings.sqlFormatter.libSrcParserAstMod.NodeType.case_when
import typings.sqlFormatter.libSrcParserAstMod.NodeType.clause
import typings.sqlFormatter.libSrcParserAstMod.NodeType.comma
import typings.sqlFormatter.libSrcParserAstMod.NodeType.function_call
import typings.sqlFormatter.libSrcParserAstMod.NodeType.identifier
import typings.sqlFormatter.libSrcParserAstMod.NodeType.keyword
import typings.sqlFormatter.libSrcParserAstMod.NodeType.limit_clause
import typings.sqlFormatter.libSrcParserAstMod.NodeType.line_comment
import typings.sqlFormatter.libSrcParserAstMod.NodeType.literal
import typings.sqlFormatter.libSrcParserAstMod.NodeType.operator
import typings.sqlFormatter.libSrcParserAstMod.NodeType.parameter
import typings.sqlFormatter.libSrcParserAstMod.NodeType.parenthesis
import typings.sqlFormatter.libSrcParserAstMod.NodeType.property_access
import typings.sqlFormatter.libSrcParserAstMod.NodeType.set_operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sqlFormatter.libSrcParserAstMod.ClauseNode
  - typings.sqlFormatter.libSrcParserAstMod.SetOperationNode
  - typings.sqlFormatter.libSrcParserAstMod.FunctionCallNode
  - typings.sqlFormatter.libSrcParserAstMod.ArraySubscriptNode
  - typings.sqlFormatter.libSrcParserAstMod.PropertyAccessNode
  - typings.sqlFormatter.libSrcParserAstMod.ParenthesisNode
  - typings.sqlFormatter.libSrcParserAstMod.BetweenPredicateNode
  - typings.sqlFormatter.libSrcParserAstMod.CaseExpressionNode
  - typings.sqlFormatter.libSrcParserAstMod.CaseWhenNode
  - typings.sqlFormatter.libSrcParserAstMod.CaseElseNode
  - typings.sqlFormatter.libSrcParserAstMod.LimitClauseNode
  - typings.sqlFormatter.libSrcParserAstMod.AllColumnsAsteriskNode
  - typings.sqlFormatter.libSrcParserAstMod.LiteralNode
  - typings.sqlFormatter.libSrcParserAstMod.IdentifierNode
  - typings.sqlFormatter.libSrcParserAstMod.KeywordNode
  - typings.sqlFormatter.libSrcParserAstMod.ParameterNode
  - typings.sqlFormatter.libSrcParserAstMod.OperatorNode
  - typings.sqlFormatter.libSrcParserAstMod.CommaNode
  - typings.sqlFormatter.libSrcParserAstMod.LineCommentNode
  - typings.sqlFormatter.libSrcParserAstMod.BlockCommentNode
*/
trait AstNode extends StObject
object AstNode {
  
  inline def AllColumnsAsteriskNode(`type`: all_columns_asterisk): typings.sqlFormatter.libSrcParserAstMod.AllColumnsAsteriskNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.AllColumnsAsteriskNode]
  }
  
  inline def ArraySubscriptNode(array: IdentifierNode | KeywordNode, parenthesis: ParenthesisNode, `type`: array_subscript): typings.sqlFormatter.libSrcParserAstMod.ArraySubscriptNode = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], parenthesis = parenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.ArraySubscriptNode]
  }
  
  inline def BetweenPredicateNode(
    andKw: KeywordNode,
    betweenKw: KeywordNode,
    expr1: js.Array[AstNode],
    expr2: js.Array[AstNode],
    `type`: between_predicate
  ): typings.sqlFormatter.libSrcParserAstMod.BetweenPredicateNode = {
    val __obj = js.Dynamic.literal(andKw = andKw.asInstanceOf[js.Any], betweenKw = betweenKw.asInstanceOf[js.Any], expr1 = expr1.asInstanceOf[js.Any], expr2 = expr2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.BetweenPredicateNode]
  }
  
  inline def BlockCommentNode(precedingWhitespace: String, text: String, `type`: block_comment): typings.sqlFormatter.libSrcParserAstMod.BlockCommentNode = {
    val __obj = js.Dynamic.literal(precedingWhitespace = precedingWhitespace.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.BlockCommentNode]
  }
  
  inline def CaseElseNode(elseKw: KeywordNode, result: js.Array[AstNode], `type`: case_else): typings.sqlFormatter.libSrcParserAstMod.CaseElseNode = {
    val __obj = js.Dynamic.literal(elseKw = elseKw.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.CaseElseNode]
  }
  
  inline def CaseExpressionNode(
    caseKw: KeywordNode,
    clauses: js.Array[CaseWhenNode | CaseElseNode],
    endKw: KeywordNode,
    expr: js.Array[AstNode],
    `type`: case_expression
  ): typings.sqlFormatter.libSrcParserAstMod.CaseExpressionNode = {
    val __obj = js.Dynamic.literal(caseKw = caseKw.asInstanceOf[js.Any], clauses = clauses.asInstanceOf[js.Any], endKw = endKw.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.CaseExpressionNode]
  }
  
  inline def CaseWhenNode(
    condition: js.Array[AstNode],
    result: js.Array[AstNode],
    thenKw: KeywordNode,
    `type`: case_when,
    whenKw: KeywordNode
  ): typings.sqlFormatter.libSrcParserAstMod.CaseWhenNode = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], thenKw = thenKw.asInstanceOf[js.Any], whenKw = whenKw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.CaseWhenNode]
  }
  
  inline def ClauseNode(children: js.Array[AstNode], nameKw: KeywordNode, `type`: clause): typings.sqlFormatter.libSrcParserAstMod.ClauseNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], nameKw = nameKw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.ClauseNode]
  }
  
  inline def CommaNode(`type`: comma): typings.sqlFormatter.libSrcParserAstMod.CommaNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.CommaNode]
  }
  
  inline def FunctionCallNode(nameKw: KeywordNode, parenthesis: ParenthesisNode, `type`: function_call): typings.sqlFormatter.libSrcParserAstMod.FunctionCallNode = {
    val __obj = js.Dynamic.literal(nameKw = nameKw.asInstanceOf[js.Any], parenthesis = parenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.FunctionCallNode]
  }
  
  inline def IdentifierNode(text: String, `type`: identifier): typings.sqlFormatter.libSrcParserAstMod.IdentifierNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.IdentifierNode]
  }
  
  inline def KeywordNode(raw: String, text: String, tokenType: TokenType, `type`: keyword): typings.sqlFormatter.libSrcParserAstMod.KeywordNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.KeywordNode]
  }
  
  inline def LimitClauseNode(count: js.Array[AstNode], limitKw: KeywordNode, `type`: limit_clause): typings.sqlFormatter.libSrcParserAstMod.LimitClauseNode = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], limitKw = limitKw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.LimitClauseNode]
  }
  
  inline def LineCommentNode(precedingWhitespace: String, text: String, `type`: line_comment): typings.sqlFormatter.libSrcParserAstMod.LineCommentNode = {
    val __obj = js.Dynamic.literal(precedingWhitespace = precedingWhitespace.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.LineCommentNode]
  }
  
  inline def LiteralNode(text: String, `type`: literal): typings.sqlFormatter.libSrcParserAstMod.LiteralNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.LiteralNode]
  }
  
  inline def OperatorNode(text: String, `type`: operator): typings.sqlFormatter.libSrcParserAstMod.OperatorNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.OperatorNode]
  }
  
  inline def ParameterNode(text: String, `type`: parameter): typings.sqlFormatter.libSrcParserAstMod.ParameterNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.ParameterNode]
  }
  
  inline def ParenthesisNode(children: js.Array[AstNode], closeParen: String, openParen: String, `type`: parenthesis): typings.sqlFormatter.libSrcParserAstMod.ParenthesisNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closeParen = closeParen.asInstanceOf[js.Any], openParen = openParen.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.ParenthesisNode]
  }
  
  inline def PropertyAccessNode(
    `object`: AstNode,
    property: IdentifierNode | ArraySubscriptNode | AllColumnsAsteriskNode,
    `type`: property_access
  ): typings.sqlFormatter.libSrcParserAstMod.PropertyAccessNode = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.PropertyAccessNode]
  }
  
  inline def SetOperationNode(children: js.Array[AstNode], nameKw: KeywordNode, `type`: set_operation): typings.sqlFormatter.libSrcParserAstMod.SetOperationNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], nameKw = nameKw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.libSrcParserAstMod.SetOperationNode]
  }
}
