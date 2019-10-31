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

trait NumberLiteral
  extends PrimaryExpression
     with BaseASTNode
     with AssemblyItem {
  var number: String
  var subdenomination: Null | wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years
  @JSName("type")
  var type_NumberLiteral: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.NumberLiteral
}

object NumberLiteral {
  @scala.inline
  def apply(
    number: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.NumberLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null,
    subdenomination: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years = null
  ): NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (subdenomination != null) __obj.updateDynamic("subdenomination")(subdenomination.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLiteral]
  }
}

