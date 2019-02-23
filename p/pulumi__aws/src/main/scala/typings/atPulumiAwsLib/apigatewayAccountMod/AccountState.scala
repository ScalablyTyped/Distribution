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

