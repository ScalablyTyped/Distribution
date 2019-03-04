package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageLocation
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_StorageLocation: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.StorageLocation
}

object StorageLocation {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.StorageLocation,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): StorageLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[StorageLocation]
  }
}

