package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockPattern extends Pattern {
  var patterns: js.Array[Pattern]
  var `type`: sparqljsLib.sparqljsLibStrings.optional | sparqljsLib.sparqljsLibStrings.union | sparqljsLib.sparqljsLibStrings.group | sparqljsLib.sparqljsLibStrings.minus | sparqljsLib.sparqljsLibStrings.graph | sparqljsLib.sparqljsLibStrings.service
}

object BlockPattern {
  @scala.inline
  def apply(
    patterns: js.Array[Pattern],
    `type`: sparqljsLib.sparqljsLibStrings.optional | sparqljsLib.sparqljsLibStrings.union | sparqljsLib.sparqljsLibStrings.group | sparqljsLib.sparqljsLibStrings.minus | sparqljsLib.sparqljsLibStrings.graph | sparqljsLib.sparqljsLibStrings.service
  ): BlockPattern = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("patterns")(patterns)
    __obj.asInstanceOf[BlockPattern]
  }
}

