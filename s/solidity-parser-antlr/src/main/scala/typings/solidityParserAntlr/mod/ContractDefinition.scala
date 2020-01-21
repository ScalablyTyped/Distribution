package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContractDefinition
  extends BaseASTNode
     with ASTNode {
  var baseContracts: js.Array[InheritanceSpecifier]
  var kind: String
  var name: String
  var subNodes: js.Array[ASTNode]
  @JSName("type")
  var type_ContractDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition
}

object ContractDefinition {
  @scala.inline
  def apply(
    baseContracts: js.Array[InheritanceSpecifier],
    kind: String,
    name: String,
    subNodes: js.Array[ASTNode],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ContractDefinition = {
    val __obj = js.Dynamic.literal(baseContracts = baseContracts.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subNodes = subNodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractDefinition]
  }
}

