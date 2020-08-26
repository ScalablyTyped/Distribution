package typings.pulumiAws.serviceQuotaMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceQuotaState extends js.Object {
  /**
    * Whether the service quota can be increased.
    */
  val adjustable: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Amazon Resource Name (ARN) of the service quota.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Default value of the service quota.
    */
  val defaultValue: js.UndefOr[Input[Double]] = js.native
  /**
    * Code of the service quota to track. For example: `L-F678F1CE`. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
    */
  val quotaCode: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the quota.
    */
  val quotaName: js.UndefOr[Input[String]] = js.native
  val requestId: js.UndefOr[Input[String]] = js.native
  val requestStatus: js.UndefOr[Input[String]] = js.native
  /**
    * Code of the service to track. For example: `vpc`. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
    */
  val serviceCode: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the service.
    */
  val serviceName: js.UndefOr[Input[String]] = js.native
  /**
    * Float specifying the desired value for the service quota. If the desired value is higher than the current value, a quota increase request is submitted. When a known request is submitted and pending, the value reflects the desired value of the pending request.
    */
  val value: js.UndefOr[Input[Double]] = js.native
}

object ServiceQuotaState {
  @scala.inline
  def apply(): ServiceQuotaState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceQuotaState]
  }
  @scala.inline
  implicit class ServiceQuotaStateOps[Self <: ServiceQuotaState] (val x: Self) extends AnyVal {
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
    def setAdjustable(value: Input[Boolean]): Self = this.set("adjustable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustable: Self = this.set("adjustable", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDefaultValue(value: Input[Double]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setQuotaCode(value: Input[String]): Self = this.set("quotaCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaCode: Self = this.set("quotaCode", js.undefined)
    @scala.inline
    def setQuotaName(value: Input[String]): Self = this.set("quotaName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaName: Self = this.set("quotaName", js.undefined)
    @scala.inline
    def setRequestId(value: Input[String]): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    @scala.inline
    def setRequestStatus(value: Input[String]): Self = this.set("requestStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestStatus: Self = this.set("requestStatus", js.undefined)
    @scala.inline
    def setServiceCode(value: Input[String]): Self = this.set("serviceCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceCode: Self = this.set("serviceCode", js.undefined)
    @scala.inline
    def setServiceName(value: Input[String]): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
    @scala.inline
    def setValue(value: Input[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

