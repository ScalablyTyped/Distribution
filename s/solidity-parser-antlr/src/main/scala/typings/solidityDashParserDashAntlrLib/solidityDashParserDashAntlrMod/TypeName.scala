package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeName
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_TypeName: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.TypeName
}

object TypeName {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.TypeName,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): TypeName = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[TypeName]
  }
}

