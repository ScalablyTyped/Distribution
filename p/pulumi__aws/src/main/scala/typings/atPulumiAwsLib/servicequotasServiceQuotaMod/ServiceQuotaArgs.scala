package typings
package atPulumiAwsLib.servicequotasServiceQuotaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceQuotaArgs extends js.Object {
  /**
    * Code of the service quota to track. For example: `L-F678F1CE`. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
    */
  val quotaCode: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Code of the service to track. For example: `vpc`. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
    */
  val serviceCode: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Float specifying the desired value for the service quota. If the desired value is higher than the current value, a quota increase request is submitted. When a known request is submitted and pending, the value reflects the desired value of the pending request.
    */
  val value: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object ServiceQuotaArgs {
  @scala.inline
  def apply(
    quotaCode: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    serviceCode: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    value: atPulumiPulumiLib.outputMod.Input[scala.Double]
  ): ServiceQuotaArgs = {
    val __obj = js.Dynamic.literal(quotaCode = quotaCode.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServiceQuotaArgs]
  }
}

