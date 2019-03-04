package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineAssemblyStatement
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_InlineAssemblyStatement: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.InlineAssemblyStatement
}

object InlineAssemblyStatement {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.InlineAssemblyStatement,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): InlineAssemblyStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[InlineAssemblyStatement]
  }
}

