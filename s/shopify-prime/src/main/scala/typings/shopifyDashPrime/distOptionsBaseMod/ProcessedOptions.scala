package typings.shopifyDashPrime.distOptionsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessedOptions extends js.Object {
  /**
    * Show objects imported or processed before date (format: 2014-04-25T16:15:47-04:00).
    */
  var processed_at_max: js.UndefOr[String] = js.undefined
  /**
    * Show objects imported or processed after date (format: 2014-04-25T16:15:47-04:00).
    */
  var processed_at_min: js.UndefOr[String] = js.undefined
}

object ProcessedOptions {
  @scala.inline
  def apply(processed_at_max: String = null, processed_at_min: String = null): ProcessedOptions = {
    val __obj = js.Dynamic.literal()
    if (processed_at_max != null) __obj.updateDynamic("processed_at_max")(processed_at_max)
    if (processed_at_min != null) __obj.updateDynamic("processed_at_min")(processed_at_min)
    __obj.asInstanceOf[ProcessedOptions]
  }
}

