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
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.BooleanLiteral
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.NumberLiteral
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.Identifier
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.TupleExpression
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ElementaryTypeNameExpression
*/
trait PrimaryExpression extends Expression

object PrimaryExpression {
  @scala.inline
  def NumberLiteral(
    number: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.NumberLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null,
    subdenomination: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years = null
  ): PrimaryExpression = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (subdenomination != null) __obj.updateDynamic("subdenomination")(subdenomination.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryExpression]
  }
  @scala.inline
  def ElementaryTypeNameExpression(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ElementaryTypeNameExpression,
    typeName: ElementaryTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): PrimaryExpression = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryExpression]
  }
  @scala.inline
  def Identifier(
    name: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Identifier,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): PrimaryExpression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryExpression]
  }
  @scala.inline
  def TupleExpression(
    components: js.Array[Expression],
    isArray: Boolean,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.TupleExpression,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): PrimaryExpression = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryExpression]
  }
  @scala.inline
  def BooleanLiteral(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.BooleanLiteral,
    value: Boolean,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): PrimaryExpression = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryExpression]
  }
}

