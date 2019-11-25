package typings.shopifyDashPrime.distOptionsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateOptions extends js.Object {
  /**
    * Retrieve only objects that were created before the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var created_at_max: js.UndefOr[String] = js.undefined
  /**
    * Retrieve only objects that were created after the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var created_at_min: js.UndefOr[String] = js.undefined
  /**
    * Retrieve only objects that were created before the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var updated_at_max: js.UndefOr[String] = js.undefined
  /**
    * Retrieve only objects that were created after the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var updated_at_min: js.UndefOr[String] = js.undefined
}

object DateOptions {
  @scala.inline
  def apply(
    created_at_max: String = null,
    created_at_min: String = null,
    updated_at_max: String = null,
    updated_at_min: String = null
  ): DateOptions = {
    val __obj = js.Dynamic.literal()
    if (created_at_max != null) __obj.updateDynamic("created_at_max")(created_at_max.asInstanceOf[js.Any])
    if (created_at_min != null) __obj.updateDynamic("created_at_min")(created_at_min.asInstanceOf[js.Any])
    if (updated_at_max != null) __obj.updateDynamic("updated_at_max")(updated_at_max.asInstanceOf[js.Any])
    if (updated_at_min != null) __obj.updateDynamic("updated_at_min")(updated_at_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateOptions]
  }
}

