package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Max extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object Max {
  @scala.inline
  def apply(max: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined): Max = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
}

