package typings
package atPulumiAwsLib.apigatewayUsagePlanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsagePlanState extends js.Object {
  /**
    * The associated API stages of the usage plan.
    */
  val apiStages: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ApiIdStage]]]
  ] = js.undefined
  /**
    * The description of a usage plan.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the usage plan.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
    */
  val productCode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The quota settings of the usage plan.
    */
  val quotaSettings: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_LimitOffset]] = js.undefined
  /**
    * The throttling limits of the usage plan.
    */
  val throttleSettings: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BurstLimitRateLimit]] = js.undefined
}

