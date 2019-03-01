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
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("destination")(destination)
    __obj.updateDynamic("silent")(silent)
    __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[CopyMoveAddOperation]
  }
}

