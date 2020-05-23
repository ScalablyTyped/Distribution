package typings.solidityParserAntlr.mod

import typings.solidityParserAntlr.solidityParserAntlrStrings.`private`
import typings.solidityParserAntlr.solidityParserAntlrStrings.default
import typings.solidityParserAntlr.solidityParserAntlrStrings.internal
import typings.solidityParserAntlr.solidityParserAntlrStrings.public
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
  var type_VariableDeclaration: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration
  var visibility: js.UndefOr[public | `private` | internal | default] = js.undefined
}

object VariableDeclaration {
  @scala.inline
  def apply(
    isIndexed: Boolean,
    isStateVar: Boolean,
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration,
    typeName: TypeName,
    expression: Expression = null,
    isDeclaredConst: js.UndefOr[Boolean] = js.undefined,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null,
    storageLocation: String = null,
    visibility: public | `private` | internal | default = null
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(isIndexed = isIndexed.asInstanceOf[js.Any], isStateVar = isStateVar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (!js.isUndefined(isDeclaredConst)) __obj.updateDynamic("isDeclaredConst")(isDeclaredConst.get.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (storageLocation != null) __obj.updateDynamic("storageLocation")(storageLocation.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclaration]
  }
}

