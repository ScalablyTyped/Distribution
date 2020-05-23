package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstrainDoubleRange extends DoubleRange {
  var exact: js.UndefOr[Double] = js.undefined
  var ideal: js.UndefOr[Double] = js.undefined
}

object ConstrainDoubleRange {
  @scala.inline
  def apply(
    exact: js.UndefOr[Double] = js.undefined,
    ideal: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined
  ): ConstrainDoubleRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ideal)) __obj.updateDynamic("ideal")(ideal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainDoubleRange]
  }
}

