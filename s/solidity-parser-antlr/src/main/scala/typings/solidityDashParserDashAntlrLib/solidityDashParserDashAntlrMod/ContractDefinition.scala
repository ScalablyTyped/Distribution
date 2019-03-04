package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContractDefinition
  extends BaseASTNode
     with ASTNode {
  var name: java.lang.String
  var subNodes: js.Array[ASTNode]
  @JSName("type")
  var type_ContractDefinition: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ContractDefinition
}

object ContractDefinition {
  @scala.inline
  def apply(
    name: java.lang.String,
    subNodes: js.Array[ASTNode],
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ContractDefinition,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): ContractDefinition = {
    val __obj = js.Dynamic.literal(name = name, subNodes = subNodes)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ContractDefinition]
  }
}

