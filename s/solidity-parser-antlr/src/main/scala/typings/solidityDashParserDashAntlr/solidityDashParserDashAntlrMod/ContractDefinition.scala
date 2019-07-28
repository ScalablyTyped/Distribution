package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContractDefinition
  extends BaseASTNode
     with ASTNode {
  var name: String
  var subNodes: js.Array[ASTNode]
  @JSName("type")
  var type_ContractDefinition: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ContractDefinition
}

object ContractDefinition {
  @scala.inline
  def apply(
    name: String,
    subNodes: js.Array[ASTNode],
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ContractDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ContractDefinition = {
    val __obj = js.Dynamic.literal(name = name, subNodes = subNodes)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ContractDefinition]
  }
}

