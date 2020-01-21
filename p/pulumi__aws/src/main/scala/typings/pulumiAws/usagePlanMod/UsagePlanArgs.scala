package typings.pulumiAws.usagePlanMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.apigateway.UsagePlanApiStage
import typings.pulumiAws.inputMod.apigateway.UsagePlanQuotaSettings
import typings.pulumiAws.inputMod.apigateway.UsagePlanThrottleSettings
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlanArgs extends js.Object {
  /**
    * The associated API stages of the usage plan.
    */
  val apiStages: js.UndefOr[Input[js.Array[Input[UsagePlanApiStage]]]] = js.native
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

object UsagePlanArgs {
  @scala.inline
  def apply(
    apiStages: Input[js.Array[Input[UsagePlanApiStage]]] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    productCode: Input[String] = null,
    quotaSettings: Input[UsagePlanQuotaSettings] = null,
    tags: Input[StringDictionary[_]] = null,
    throttleSettings: Input[UsagePlanThrottleSettings] = null
  ): UsagePlanArgs = {
    val __obj = js.Dynamic.literal()
    if (apiStages != null) __obj.updateDynamic("apiStages")(apiStages.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (productCode != null) __obj.updateDynamic("productCode")(productCode.asInstanceOf[js.Any])
    if (quotaSettings != null) __obj.updateDynamic("quotaSettings")(quotaSettings.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (throttleSettings != null) __obj.updateDynamic("throttleSettings")(throttleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanArgs]
  }
}

