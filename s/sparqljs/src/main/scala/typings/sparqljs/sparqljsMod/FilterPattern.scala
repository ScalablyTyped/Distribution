package typings.sparqljs.sparqljsMod

import typings.sparqljs.sparqljsStrings.filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterPattern extends Pattern {
  var expression: Expression
  var `type`: filter
}

object FilterPattern {
  @scala.inline
  def apply(expression: Expression, `type`: filter): FilterPattern = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterPattern]
  }
}

