package typings.pulumiPulumi.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberConfigOptions extends js.Object {
  /**
    * The maximum number value, inclusive. If the number is greater than this, a ConfigRangeError is thrown.
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The minimum number value, inclusive. If the number is less than this, a ConfigRangeError is thrown.
    */
  var min: js.UndefOr[Double] = js.undefined
}

object NumberConfigOptions {
  @scala.inline
  def apply(max: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined): NumberConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberConfigOptions]
  }
}

