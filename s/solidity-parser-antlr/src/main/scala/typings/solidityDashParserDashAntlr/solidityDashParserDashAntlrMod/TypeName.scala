package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeName
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_TypeName: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.TypeName
}

object TypeName {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.TypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): TypeName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[TypeName]
  }
}

