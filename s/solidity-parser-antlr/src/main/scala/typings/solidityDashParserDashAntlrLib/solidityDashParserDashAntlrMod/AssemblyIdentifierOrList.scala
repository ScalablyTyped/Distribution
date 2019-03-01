package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssemblyIdentifierOrList
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_AssemblyIdentifierOrList: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.AssemblyIdentifierOrList
}

object AssemblyIdentifierOrList {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.AssemblyIdentifierOrList,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): AssemblyIdentifierOrList = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AssemblyIdentifierOrList]
  }
}

