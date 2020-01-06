package typings.atPulumiAws.apigatewayUsagePlanMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.apigateway.UsagePlanApiStage
import typings.atPulumiAws.typesInputMod.apigateway.UsagePlanQuotaSettings
import typings.atPulumiAws.typesInputMod.apigateway.UsagePlanThrottleSettings
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlanState extends js.Object {
  /**
    * The associated API stages of the usage plan.
    */
  val apiStages: js.UndefOr[Input[js.Array[Input[UsagePlanApiStage]]]] = js.native
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The description of a usage plan.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the usage plan.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
    */
  val productCode: js.UndefOr[Input[String]] = js.native
  /**
    * The quota settings of the usage plan.
    */
  val quotaSettings: js.UndefOr[Input[UsagePlanQuotaSettings]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The throttling limits of the usage plan.
    */
  val throttleSettings: js.UndefOr[Input[UsagePlanThrottleSettings]] = js.native
}

object UsagePlanState {
  @scala.inline
  def apply(
    apiStages: Input[js.Array[Input[UsagePlanApiStage]]] = null,
    arn: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    productCode: Input[String] = null,
    quotaSettings: Input[UsagePlanQuotaSettings] = null,
    tags: Input[StringDictionary[_]] = null,
    throttleSettings: Input[UsagePlanThrottleSettings] = null
  ): UsagePlanState = {
    val __obj = js.Dynamic.literal()
    if (apiStages != null) __obj.updateDynamic("apiStages")(apiStages.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (productCode != null) __obj.updateDynamic("productCode")(productCode.asInstanceOf[js.Any])
    if (quotaSettings != null) __obj.updateDynamic("quotaSettings")(quotaSettings.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (throttleSettings != null) __obj.updateDynamic("throttleSettings")(throttleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanState]
  }
}

