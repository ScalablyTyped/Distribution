package typings
package atPulumiAwsLib.servicequotasGetServiceQuotaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceQuotaArgs extends js.Object {
  /**
    * Quota code within the service. When configured, the data source directly looks up the service quota. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
    */
  val quotaCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Quota name within the service. When configured, the data source searches through all service quotas to find the matching quota name. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
    */
  val quotaName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Service code for the quota. Available values can be found with the [`aws_servicequotas_service` data source](https://www.terraform.io/docs/providers/aws/d/servicequotas_service.html) or [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
    */
  val serviceCode: java.lang.String
}

object GetServiceQuotaArgs {
  @scala.inline
  def apply(
    serviceCode: java.lang.String,
    quotaCode: java.lang.String = null,
    quotaName: java.lang.String = null
  ): GetServiceQuotaArgs = {
    val __obj = js.Dynamic.literal(serviceCode = serviceCode)
    if (quotaCode != null) __obj.updateDynamic("quotaCode")(quotaCode)
    if (quotaName != null) __obj.updateDynamic("quotaName")(quotaName)
    __obj.asInstanceOf[GetServiceQuotaArgs]
  }
}

