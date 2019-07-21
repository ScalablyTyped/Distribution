package typings
package atPulumiAwsLib.servicequotasServiceQuotaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceQuotaState extends js.Object {
  /**
    * Whether the service quota can be increased.
    */
  val adjustable: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of the service quota.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Default value of the service quota.
    */
  val defaultValue: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Code of the service quota to track. For example: `L-F678F1CE`. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
    */
  val quotaCode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the quota.
    */
  val quotaName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val requestId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val requestStatus: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Code of the service to track. For example: `vpc`. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
    */
  val serviceCode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the service.
    */
  val serviceName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Float specifying the desired value for the service quota. If the desired value is higher than the current value, a quota increase request is submitted. When a known request is submitted and pending, the value reflects the desired value of the pending request.
    */
  val value: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object ServiceQuotaState {
  @scala.inline
  def apply(
    adjustable: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    defaultValue: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    quotaCode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    quotaName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    requestId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    requestStatus: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    serviceCode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    serviceName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    value: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): ServiceQuotaState = {
    val __obj = js.Dynamic.literal()
    if (adjustable != null) __obj.updateDynamic("adjustable")(adjustable.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (quotaCode != null) __obj.updateDynamic("quotaCode")(quotaCode.asInstanceOf[js.Any])
    if (quotaName != null) __obj.updateDynamic("quotaName")(quotaName.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (requestStatus != null) __obj.updateDynamic("requestStatus")(requestStatus.asInstanceOf[js.Any])
    if (serviceCode != null) __obj.updateDynamic("serviceCode")(serviceCode.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceQuotaState]
  }
}

