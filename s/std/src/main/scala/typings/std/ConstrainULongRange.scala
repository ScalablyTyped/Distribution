package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstrainULongRange extends ULongRange {
  var exact: js.UndefOr[Double] = js.undefined
  var ideal: js.UndefOr[Double] = js.undefined
}

object ConstrainULongRange {
  @scala.inline
  def apply(
    exact: Int | Double = null,
    ideal: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null
  ): ConstrainULongRange = {
    val __obj = js.Dynamic.literal()
    if (exact != null) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (ideal != null) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainULongRange]
  }
}

