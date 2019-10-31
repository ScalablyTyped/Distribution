package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.`private`
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.default
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.internal
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclaration
  extends BaseASTNode
     with ASTNode {
  var expression: js.UndefOr[Expression] = js.undefined
  var isDeclaredConst: js.UndefOr[Boolean] = js.undefined
  var isIndexed: Boolean
  var isStateVar: Boolean
  var name: String
  var storageLocation: js.UndefOr[String] = js.undefined
  var typeName: TypeName
  @JSName("type")
  var type_VariableDeclaration: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.VariableDeclaration
  var visibility: js.UndefOr[public | `private` | internal | default] = js.undefined
}

object VariableDeclaration {
  @scala.inline
  def apply(
    isIndexed: Boolean,
    isStateVar: Boolean,
    name: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.VariableDeclaration,
    typeName: TypeName,
    expression: Expression = null,
    isDeclaredConst: js.UndefOr[Boolean] = js.undefined,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null,
    storageLocation: String = null,
    visibility: public | `private` | internal | default = null
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(isIndexed = isIndexed, isStateVar = isStateVar, name = name, typeName = typeName)
    __obj.updateDynamic("type")(`type`)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (!js.isUndefined(isDeclaredConst)) __obj.updateDynamic("isDeclaredConst")(isDeclaredConst)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (storageLocation != null) __obj.updateDynamic("storageLocation")(storageLocation)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclaration]
  }
}

