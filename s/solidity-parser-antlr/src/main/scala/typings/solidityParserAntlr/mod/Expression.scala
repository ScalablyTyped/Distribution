package typings.solidityParserAntlr.mod

import typings.solidityParserAntlr.solidityParserAntlrStrings.days
import typings.solidityParserAntlr.solidityParserAntlrStrings.ether
import typings.solidityParserAntlr.solidityParserAntlrStrings.finney
import typings.solidityParserAntlr.solidityParserAntlrStrings.hours
import typings.solidityParserAntlr.solidityParserAntlrStrings.minutes
import typings.solidityParserAntlr.solidityParserAntlrStrings.seconds
import typings.solidityParserAntlr.solidityParserAntlrStrings.szabo
import typings.solidityParserAntlr.solidityParserAntlrStrings.weeks
import typings.solidityParserAntlr.solidityParserAntlrStrings.wei
import typings.solidityParserAntlr.solidityParserAntlrStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.solidityParserAntlr.mod.IndexAccess
  - typings.solidityParserAntlr.mod.TupleExpression
  - typings.solidityParserAntlr.mod.BinaryOperation
  - typings.solidityParserAntlr.mod.Conditional
  - typings.solidityParserAntlr.mod.MemberAccess
  - typings.solidityParserAntlr.mod.FunctionCall
  - typings.solidityParserAntlr.mod.PrimaryExpression
*/
trait Expression extends ASTNode

object Expression {
  @scala.inline
  def NumberLiteral(
    number: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null,
    subdenomination: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years = null
  ): Expression = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (subdenomination != null) __obj.updateDynamic("subdenomination")(subdenomination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def TupleExpression(
    components: js.Array[Expression],
    isArray: Boolean,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Expression = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def FunctionCall(
    arguments: js.Array[Expression],
    expression: Expression,
    names: js.Array[String],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Expression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def MemberAccess(
    expression: Expression,
    memberName: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Expression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def Conditional(
    falseExpression: ASTNode,
    trueExpression: ASTNode,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Conditional,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Expression = {
    val __obj = js.Dynamic.literal(falseExpression = falseExpression.asInstanceOf[js.Any], trueExpression = trueExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def IndexAccess(
    base: Expression,
    index: Expression,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Expression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def ElementaryTypeNameExpression(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression,
    typeName: ElementaryTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Expression = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def BooleanLiteral(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral,
    value: Boolean,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Expression = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def Identifier(
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Identifier,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Expression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def BinaryOperation(
    left: Expression,
    operator: BinOp,
    right: Expression,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Expression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
}

