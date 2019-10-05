package typings.atPulumiAws.apigatewayUsagePlanMod

import typings.atPulumiAws.typesInputMod.apigateway.UsagePlanApiStage
import typings.atPulumiAws.typesInputMod.apigateway.UsagePlanQuotaSettings
import typings.atPulumiAws.typesInputMod.apigateway.UsagePlanThrottleSettings
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsagePlanState extends js.Object {
  /**
    * The associated API stages of the usage plan.
    */
  val apiStages: js.UndefOr[Input[js.Array[Input[UsagePlanApiStage]]]] = js.undefined
  /**
    * The description of a usage plan.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the usage plan.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
    */
  val productCode: js.UndefOr[Input[String]] = js.undefined
  /**
    * The quota settings of the usage plan.
    */
  val quotaSettings: js.UndefOr[Input[UsagePlanQuotaSettings]] = js.undefined
  /**
    * The throttling limits of the usage plan.
    */
  val throttleSettings: js.UndefOr[Input[UsagePlanThrottleSettings]] = js.undefined
}

object UsagePlanState {
  @scala.inline
  def apply(
    apiStages: Input[js.Array[Input[UsagePlanApiStage]]] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    productCode: Input[String] = null,
    quotaSettings: Input[UsagePlanQuotaSettings] = null,
    throttleSettings: Input[UsagePlanThrottleSettings] = null
  ): UsagePlanState = {
    val __obj = js.Dynamic.literal()
    if (apiStages != null) __obj.updateDynamic("apiStages")(apiStages.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (productCode != null) __obj.updateDynamic("productCode")(productCode.asInstanceOf[js.Any])
    if (quotaSettings != null) __obj.updateDynamic("quotaSettings")(quotaSettings.asInstanceOf[js.Any])
    if (throttleSettings != null) __obj.updateDynamic("throttleSettings")(throttleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanState]
  }
}

