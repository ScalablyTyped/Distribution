package typings.atPulumiAws.typesInputMod.apigatewayNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsagePlanQuotaSettings extends js.Object {
  /**
    * The maximum number of requests that can be made in a given time period.
    */
  var limit: Input[Double]
  /**
    * The number of requests subtracted from the given limit in the initial time period.
    */
  var offset: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
    */
  var period: Input[String]
}

object UsagePlanQuotaSettings {
  @scala.inline
  def apply(limit: Input[Double], period: Input[String], offset: Input[Double] = null): UsagePlanQuotaSettings = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanQuotaSettings]
  }
}

