package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.days
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ether
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.finney
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.hours
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.minutes
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.seconds
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.szabo
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.weeks
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.wei
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.IndexAccess
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.TupleExpression
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.BinaryOperation
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.Conditional
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.MemberAccess
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.FunctionCall
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.PrimaryExpression
*/
trait Expression extends ASTNode

object Expression {
  @scala.inline
  def Conditional(
    falseExpression: ASTNode,
    trueExpression: ASTNode,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Conditional,
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
  def NumberLiteral(
    number: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.NumberLiteral,
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
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.TupleExpression,
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
  def BinaryOperation(
    left: Expression,
    operator: BinOp,
    right: Expression,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.BinaryOperation,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Expression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def IndexAccess(
    base: Expression,
    index: Expression,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.IndexAccess,
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
  def FunctionCall(
    arguments: js.Array[Expression],
    expression: Expression,
    names: js.Array[String],
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionCall,
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
  def ElementaryTypeNameExpression(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ElementaryTypeNameExpression,
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
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.BooleanLiteral,
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
  def MemberAccess(
    expression: Expression,
    memberName: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.MemberAccess,
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
  def Identifier(
    name: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Identifier,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Expression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
}

