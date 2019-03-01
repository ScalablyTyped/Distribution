package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportDeclaration
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ImportDeclaration: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ImportDeclaration
}

object ImportDeclaration {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ImportDeclaration,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): ImportDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ImportDeclaration]
  }
}

