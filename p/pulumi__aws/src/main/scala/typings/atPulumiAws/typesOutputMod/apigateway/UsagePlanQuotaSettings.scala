package typings.atPulumiAws.typesOutputMod.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsagePlanQuotaSettings extends js.Object {
  /**
    * The maximum number of requests that can be made in a given time period.
    */
  var limit: Double
  /**
    * The number of requests subtracted from the given limit in the initial time period.
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
    */
  var period: String
}

object UsagePlanQuotaSettings {
  @scala.inline
  def apply(limit: Double, period: String, offset: Int | Double = null): UsagePlanQuotaSettings = {
    val __obj = js.Dynamic.literal(limit = limit, period = period)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanQuotaSettings]
  }
}

