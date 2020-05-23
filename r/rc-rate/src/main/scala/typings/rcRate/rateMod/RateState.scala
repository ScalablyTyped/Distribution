package typings.rcRate.rateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateState extends js.Object {
  var cleanedValue: Double
  var focused: Boolean
  var hoverValue: js.UndefOr[Double] = js.undefined
  var value: Double
}

object RateState {
  @scala.inline
  def apply(
    cleanedValue: Double,
    focused: Boolean,
    value: Double,
    hoverValue: js.UndefOr[Double] = js.undefined
  ): RateState = {
    val __obj = js.Dynamic.literal(cleanedValue = cleanedValue.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverValue)) __obj.updateDynamic("hoverValue")(hoverValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateState]
  }
}

