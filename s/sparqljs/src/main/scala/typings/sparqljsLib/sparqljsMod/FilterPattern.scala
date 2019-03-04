package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterPattern extends Pattern {
  var expression: Expression
  var `type`: sparqljsLib.sparqljsLibStrings.filter
}

object FilterPattern {
  @scala.inline
  def apply(expression: Expression, `type`: sparqljsLib.sparqljsLibStrings.filter): FilterPattern = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FilterPattern]
  }
}

