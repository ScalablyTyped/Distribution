package typings.atPulumiAws.servicequotasGetServiceQuotaMod

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
    * id is the provider-assigned unique ID for this managed resource.
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
}

