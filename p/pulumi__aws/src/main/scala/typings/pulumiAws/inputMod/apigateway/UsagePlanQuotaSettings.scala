package typings.pulumiAws.inputMod.apigateway

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlanQuotaSettings extends js.Object {
  /**
    * The maximum number of requests that can be made in a given time period.
    */
  var limit: Input[Double] = js.native
  /**
    * The number of requests subtracted from the given limit in the initial time period.
    */
  var offset: js.UndefOr[Input[Double]] = js.native
  /**
    * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
    */
  var period: Input[String] = js.native
}

object UsagePlanQuotaSettings {
  @scala.inline
  def apply(limit: Input[Double], period: Input[String]): UsagePlanQuotaSettings = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanQuotaSettings]
  }
  @scala.inline
  implicit class UsagePlanQuotaSettingsOps[Self <: UsagePlanQuotaSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLimit(value: Input[Double]): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeriod(value: Input[String]): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Input[Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
  
}

