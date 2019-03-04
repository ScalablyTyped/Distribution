package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionTypeName
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_FunctionTypeName: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.FunctionTypeName
}

object FunctionTypeName {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.FunctionTypeName,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): FunctionTypeName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[FunctionTypeName]
  }
}

