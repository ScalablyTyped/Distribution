package typings
package atPulumiAwsLib.apigatewayAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountState extends js.Object {
  /**
    * The ARN of an IAM role for CloudWatch (to allow logging & monitoring).
    * See more [in AWS Docs](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-stage-settings.html#how-to-stage-settings-console).
    * Logging & monitoring can be enabled/disabled and otherwise tuned on the API Gateway Stage level.
    */
  val cloudwatchRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Account-Level throttle settings. See exported fields below.
    */
  val throttleSettings: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BurstLimitRateLimit]] = js.undefined
}

object AccountState {
  @scala.inline
  def apply(
    cloudwatchRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    throttleSettings: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BurstLimitRateLimit] = null
  ): AccountState = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchRoleArn != null) __obj.updateDynamic("cloudwatchRoleArn")(cloudwatchRoleArn.asInstanceOf[js.Any])
    if (throttleSettings != null) __obj.updateDynamic("throttleSettings")(throttleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountState]
  }
}

