package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearDropOperation extends ManagementOperation {
  var graph: GraphReference
  var silent: scala.Boolean
  var `type`: sparqljsLib.sparqljsLibStrings.clear | sparqljsLib.sparqljsLibStrings.drop
}

object ClearDropOperation {
  @scala.inline
  def apply(
    graph: GraphReference,
    silent: scala.Boolean,
    `type`: sparqljsLib.sparqljsLibStrings.clear | sparqljsLib.sparqljsLibStrings.drop
  ): ClearDropOperation = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("graph")(graph)
    __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[ClearDropOperation]
  }
}

