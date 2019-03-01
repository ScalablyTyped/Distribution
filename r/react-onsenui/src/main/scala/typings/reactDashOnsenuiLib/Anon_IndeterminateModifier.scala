package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndeterminateModifier extends js.Object {
  var indeterminate: js.UndefOr[scala.Boolean] = js.undefined
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  var secondaryValue: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object Anon_IndeterminateModifier {
  @scala.inline
  def apply(
    indeterminate: js.UndefOr[scala.Boolean] = js.undefined,
    modifier: java.lang.String = null,
    secondaryValue: js.UndefOr[scala.Boolean] = js.undefined,
    value: scala.Int | scala.Double = null
  ): Anon_IndeterminateModifier = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (!js.isUndefined(secondaryValue)) __obj.updateDynamic("secondaryValue")(secondaryValue)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IndeterminateModifier]
  }
}

