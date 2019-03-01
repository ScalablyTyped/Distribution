package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Indeterminate extends js.Object {
  var indeterminate: js.UndefOr[scala.Boolean] = js.undefined
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  var secondaryValue: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Indeterminate {
  @scala.inline
  def apply(
    indeterminate: js.UndefOr[scala.Boolean] = js.undefined,
    modifier: java.lang.String = null,
    secondaryValue: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): Anon_Indeterminate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (secondaryValue != null) __obj.updateDynamic("secondaryValue")(secondaryValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Indeterminate]
  }
}

