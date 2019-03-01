package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ordering extends js.Object {
  var descending: js.UndefOr[scala.Boolean] = js.undefined
  var expression: Expression
}

object Ordering {
  @scala.inline
  def apply(expression: Expression, descending: js.UndefOr[scala.Boolean] = js.undefined): Ordering = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending)
    __obj.asInstanceOf[Ordering]
  }
}

