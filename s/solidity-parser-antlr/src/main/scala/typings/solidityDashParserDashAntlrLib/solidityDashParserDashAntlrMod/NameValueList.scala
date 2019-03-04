package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameValueList
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_NameValueList: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.NameValueList
}

object NameValueList {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.NameValueList,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): NameValueList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[NameValueList]
  }
}

