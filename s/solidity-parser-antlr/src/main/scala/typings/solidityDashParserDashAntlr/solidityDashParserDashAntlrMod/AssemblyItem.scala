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
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.Identifier
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblyBlock
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblyExpression
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblyLocalDefinition
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblyAssignment
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblyStackAssignment
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.LabelDefinition
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblySwitch
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblyFunctionDefinition
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblyFor
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblyIf
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.Break
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.Continue
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.SubAssembly
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.NumberLiteral
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.StringLiteral
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.HexNumber
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.HexLiteral
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.DecimalNumber
*/
trait AssemblyItem extends ASTNode

object AssemblyItem {
  @scala.inline
  def NumberLiteral(
    number: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.NumberLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null,
    subdenomination: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (subdenomination != null) __obj.updateDynamic("subdenomination")(subdenomination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def StringLiteral(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.StringLiteral,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyFor(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyFor,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblySwitch(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblySwitch,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def HexNumber(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.HexNumber,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyBlock(
    operations: js.Array[AssemblyItem],
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyBlock,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def DecimalNumber(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.DecimalNumber,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def HexLiteral(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.HexLiteral,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyLocalDefinition(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyLocalDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyCall(
    arguments: js.Array[AssemblyExpression],
    functionName: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyCall,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyIf(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyIf,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyStackAssignment(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyStackAssignment,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyLiteral(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def LabelDefinition(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.LabelDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyAssignment(
    expression: AssemblyExpression,
    names: js.Array[Identifier],
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyAssignment,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyFunctionDefinition(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyFunctionDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def SubAssembly(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.SubAssembly,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def Continue(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Continue,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def Break(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Break,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def Identifier(
    name: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Identifier,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
}

