package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContractPart
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ContractPart: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ContractPart
}

object ContractPart {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ContractPart,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): ContractPart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ContractPart]
  }
}

