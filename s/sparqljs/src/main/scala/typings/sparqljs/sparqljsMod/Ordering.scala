package typings.sparqljs.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ordering extends js.Object {
  var descending: js.UndefOr[Boolean] = js.undefined
  var expression: Expression
}

object Ordering {
  @scala.inline
  def apply(expression: Expression, descending: js.UndefOr[Boolean] = js.undefined): Ordering = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ordering]
  }
}

