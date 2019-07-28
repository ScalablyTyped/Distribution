package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssemblyIdentifierOrList
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_AssemblyIdentifierOrList: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyIdentifierOrList
}

object AssemblyIdentifierOrList {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyIdentifierOrList,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyIdentifierOrList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AssemblyIdentifierOrList]
  }
}

