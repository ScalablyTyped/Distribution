package typings.pulumiAws.serviceQuotaMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceQuotaArgs extends js.Object {
  /**
    * Code of the service quota to track. For example: `L-F678F1CE`. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
    */
  val quotaCode: Input[String] = js.native
  /**
    * Code of the service to track. For example: `vpc`. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
    */
  val serviceCode: Input[String] = js.native
  /**
    * Float specifying the desired value for the service quota. If the desired value is higher than the current value, a quota increase request is submitted. When a known request is submitted and pending, the value reflects the desired value of the pending request.
    */
  val value: Input[Double] = js.native
}

object ServiceQuotaArgs {
  @scala.inline
  def apply(quotaCode: Input[String], serviceCode: Input[String], value: Input[Double]): ServiceQuotaArgs = {
    val __obj = js.Dynamic.literal(quotaCode = quotaCode.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceQuotaArgs]
  }
  @scala.inline
  implicit class ServiceQuotaArgsOps[Self <: ServiceQuotaArgs] (val x: Self) extends AnyVal {
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
    def setQuotaCode(value: Input[String]): Self = this.set("quotaCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceCode(value: Input[String]): Self = this.set("serviceCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Input[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

