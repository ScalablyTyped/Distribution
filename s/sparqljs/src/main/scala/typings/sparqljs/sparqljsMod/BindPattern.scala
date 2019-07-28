package typings.sparqljs.sparqljsMod

import typings.sparqljs.sparqljsStrings.bind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindPattern extends Pattern {
  var expression: Expression
  var `type`: bind
  var variable: Term
}

object BindPattern {
  @scala.inline
  def apply(expression: Expression, `type`: bind, variable: Term): BindPattern = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], variable = variable)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BindPattern]
  }
}

