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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterPattern]
  }
}

