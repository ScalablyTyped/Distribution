package typings.atPulumiPulumi.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NumberConfigOptions may be used to constrain the set of legal values a number config value may contain.
  */
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
  def apply(max: Int | Double = null, min: Int | Double = null): NumberConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberConfigOptions]
  }
}

