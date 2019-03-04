package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValuesPattern extends Pattern {
  var `type`: sparqljsLib.sparqljsLibStrings.values
  var values: js.Array[ValuePatternRow]
}

object ValuesPattern {
  @scala.inline
  def apply(`type`: sparqljsLib.sparqljsLibStrings.values, values: js.Array[ValuePatternRow]): ValuesPattern = {
    val __obj = js.Dynamic.literal(values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ValuesPattern]
  }
}

