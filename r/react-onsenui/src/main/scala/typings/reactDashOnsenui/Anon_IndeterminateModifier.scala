package typings.reactDashOnsenui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndeterminateModifier extends js.Object {
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var secondaryValue: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object Anon_IndeterminateModifier {
  @scala.inline
  def apply(
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    modifier: String = null,
    secondaryValue: js.UndefOr[Boolean] = js.undefined,
    value: Int | Double = null
  ): Anon_IndeterminateModifier = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (!js.isUndefined(secondaryValue)) __obj.updateDynamic("secondaryValue")(secondaryValue)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IndeterminateModifier]
  }
}

