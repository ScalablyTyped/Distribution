package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportDeclaration
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ImportDeclaration: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ImportDeclaration
}

object ImportDeclaration {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ImportDeclaration,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ImportDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ImportDeclaration]
  }
}

