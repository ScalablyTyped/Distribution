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

trait NumberLiteral
  extends PrimaryExpression
     with BaseASTNode
     with AssemblyItem {
  var number: String
  var subdenomination: Null | wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years
  @JSName("type")
  var type_NumberLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral
}

object NumberLiteral {
  @scala.inline
  def apply(
    number: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null,
    subdenomination: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years = null
  ): NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (subdenomination != null) __obj.updateDynamic("subdenomination")(subdenomination.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLiteral]
  }
}

