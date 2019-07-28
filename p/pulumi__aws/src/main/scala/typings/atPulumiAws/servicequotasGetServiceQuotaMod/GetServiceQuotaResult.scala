package typings.atPulumiAws.servicequotasGetServiceQuotaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceQuotaResult extends js.Object {
  /**
    * Whether the service quota is adjustable.
    */
  val adjustable: Boolean
  /**
    * Amazon Resource Name (ARN) of the service quota.
    */
  val arn: String
  /**
    * Default value of the service quota.
    */
  val defaultValue: Double
  /**
    * Whether the service quota is global for the AWS account.
    */
  val globalQuota: Boolean
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val quotaCode: String
  val quotaName: String
  val serviceCode: String
  /**
    * Name of the service.
    */
  val serviceName: String
  /**
    * Current value of the service quota.
    */
  val value: Double
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
    val __obj = js.Dynamic.literal(adjustable = adjustable, arn = arn, defaultValue = defaultValue, globalQuota = globalQuota, id = id, quotaCode = quotaCode, quotaName = quotaName, serviceCode = serviceCode, serviceName = serviceName, value = value)
  
    __obj.asInstanceOf[GetServiceQuotaResult]
  }
}

