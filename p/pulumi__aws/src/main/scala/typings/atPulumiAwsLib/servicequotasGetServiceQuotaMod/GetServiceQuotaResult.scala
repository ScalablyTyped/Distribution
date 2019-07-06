package typings
package atPulumiAwsLib.servicequotasGetServiceQuotaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceQuotaResult extends js.Object {
  /**
    * Whether the service quota is adjustable.
    */
  val adjustable: scala.Boolean
  /**
    * Amazon Resource Name (ARN) of the service quota.
    */
  val arn: java.lang.String
  /**
    * Default value of the service quota.
    */
  val defaultValue: scala.Double
  /**
    * Whether the service quota is global for the AWS account.
    */
  val globalQuota: scala.Boolean
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val quotaCode: java.lang.String
  val quotaName: java.lang.String
  val serviceCode: java.lang.String
  /**
    * Name of the service.
    */
  val serviceName: java.lang.String
  /**
    * Current value of the service quota.
    */
  val value: scala.Double
}

object GetServiceQuotaResult {
  @scala.inline
  def apply(
    adjustable: scala.Boolean,
    arn: java.lang.String,
    defaultValue: scala.Double,
    globalQuota: scala.Boolean,
    id: java.lang.String,
    quotaCode: java.lang.String,
    quotaName: java.lang.String,
    serviceCode: java.lang.String,
    serviceName: java.lang.String,
    value: scala.Double
  ): GetServiceQuotaResult = {
    val __obj = js.Dynamic.literal(adjustable = adjustable, arn = arn, defaultValue = defaultValue, globalQuota = globalQuota, id = id, quotaCode = quotaCode, quotaName = quotaName, serviceCode = serviceCode, serviceName = serviceName, value = value)
  
    __obj.asInstanceOf[GetServiceQuotaResult]
  }
}

