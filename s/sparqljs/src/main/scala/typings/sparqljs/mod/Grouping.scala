package typings.sparqljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grouping extends js.Object {
  var expression: Expression
}

object Grouping {
  @scala.inline
  def apply(expression: Expression): Grouping = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grouping]
  }
}

