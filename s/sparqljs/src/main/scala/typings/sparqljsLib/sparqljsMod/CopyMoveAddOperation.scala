package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyMoveAddOperation extends ManagementOperation {
  var destination: GraphOrDefault
  var silent: scala.Boolean
  var source: GraphOrDefault
  var `type`: sparqljsLib.sparqljsLibStrings.copy | sparqljsLib.sparqljsLibStrings.move | sparqljsLib.sparqljsLibStrings.add
}

object CopyMoveAddOperation {
  @scala.inline
  def apply(
    destination: GraphOrDefault,
    silent: scala.Boolean,
    source: GraphOrDefault,
    `type`: sparqljsLib.sparqljsLibStrings.copy | sparqljsLib.sparqljsLibStrings.move | sparqljsLib.sparqljsLibStrings.add
  ): CopyMoveAddOperation = {
    val __obj = js.Dynamic.literal(destination = destination, silent = silent, source = source)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyMoveAddOperation]
  }
}

