package typings.pulumiAws.getServiceQuotaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceQuotaResult extends js.Object {
  /**
    * Whether the service quota is adjustable.
    */
  val adjustable: Boolean = js.native
  /**
    * Amazon Resource Name (ARN) of the service quota.
    */
  val arn: String = js.native
  /**
    * Default value of the service quota.
    */
  val defaultValue: Double = js.native
  /**
    * Whether the service quota is global for the AWS account.
    */
  val globalQuota: Boolean = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val quotaCode: String = js.native
  val quotaName: String = js.native
  val serviceCode: String = js.native
  /**
    * Name of the service.
    */
  val serviceName: String = js.native
  /**
    * Current value of the service quota.
    */
  val value: Double = js.native
}

object GetServiceQuotaResult {
  @scala.inline
  def apply(
    adjustable: Boolean,
    arn: String,
    defaultValue: Double,
    globalQuota: Boolean,
    id: String,
    quotaCode: String,
    quotaName: String,
    serviceCode: String,
    serviceName: String,
    value: Double
  ): GetServiceQuotaResult = {
    val __obj = js.Dynamic.literal(adjustable = adjustable.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], globalQuota = globalQuota.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], quotaCode = quotaCode.asInstanceOf[js.Any], quotaName = quotaName.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceQuotaResult]
  }
  @scala.inline
  implicit class GetServiceQuotaResultOps[Self <: GetServiceQuotaResult] (val x: Self) extends AnyVal {
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
    def setAdjustable(value: Boolean): Self = this.set("adjustable", value.asInstanceOf[js.Any])
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobalQuota(value: Boolean): Self = this.set("globalQuota", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuotaCode(value: String): Self = this.set("quotaCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuotaName(value: String): Self = this.set("quotaName", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceCode(value: String): Self = this.set("serviceCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

