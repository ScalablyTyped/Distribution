package typings.sqlFormatter.astMod

import typings.sqlFormatter.astMod.NodeType.all_columns_asterisk
import typings.sqlFormatter.astMod.NodeType.array_subscript
import typings.sqlFormatter.astMod.NodeType.between_predicate
import typings.sqlFormatter.astMod.NodeType.block_comment
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
    and: KeywordNode,
    between: KeywordNode,
    expr1: js.Array[AstNode],
    expr2: js.Array[AstNode],
    `type`: between_predicate
  ): typings.sqlFormatter.astMod.BetweenPredicateNode = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], between = between.asInstanceOf[js.Any], expr1 = expr1.asInstanceOf[js.Any], expr2 = expr2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.BetweenPredicateNode]
  }
  
  inline def BlockCommentNode(text: String, `type`: block_comment): typings.sqlFormatter.astMod.BlockCommentNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.BlockCommentNode]
  }
  
  inline def ClauseNode(children: js.Array[AstNode], name: KeywordNode, `type`: clause): typings.sqlFormatter.astMod.ClauseNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.ClauseNode]
  }
  
  inline def CommaNode(`type`: comma): typings.sqlFormatter.astMod.CommaNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.CommaNode]
  }
  
  inline def FunctionCallNode(name: KeywordNode, parenthesis: ParenthesisNode, `type`: function_call): typings.sqlFormatter.astMod.FunctionCallNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parenthesis = parenthesis.asInstanceOf[js.Any])
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
  
  inline def LimitClauseNode(count: js.Array[AstNode], name: KeywordNode, `type`: limit_clause): typings.sqlFormatter.astMod.LimitClauseNode = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
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
  
  inline def SetOperationNode(children: js.Array[AstNode], name: KeywordNode, `type`: set_operation): typings.sqlFormatter.astMod.SetOperationNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sqlFormatter.astMod.SetOperationNode]
  }
}
