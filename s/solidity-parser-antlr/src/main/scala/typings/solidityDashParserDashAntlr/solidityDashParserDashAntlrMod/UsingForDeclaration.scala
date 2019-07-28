package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsingForDeclaration
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_UsingForDeclaration: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.UsingForDeclaration
}

object UsingForDeclaration {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.UsingForDeclaration,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): UsingForDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[UsingForDeclaration]
  }
}

