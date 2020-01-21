package typings.pulumiAws.accountMod

import typings.pulumiAws.inputMod.apigateway.AccountThrottleSettings
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountState extends js.Object {
  /**
    * The ARN of an IAM role for CloudWatch (to allow logging & monitoring).
    * See more [in AWS Docs](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-stage-settings.html#how-to-stage-settings-console).
    * Logging & monitoring can be enabled/disabled and otherwise tuned on the API Gateway Stage level.
    */
  val cloudwatchRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * Account-Level throttle settings. See exported fields below.
    */
  val throttleSettings: js.UndefOr[Input[AccountThrottleSettings]] = js.native
}

object AccountState {
  @scala.inline
  def apply(cloudwatchRoleArn: Input[String] = null, throttleSettings: Input[AccountThrottleSettings] = null): AccountState = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchRoleArn != null) __obj.updateDynamic("cloudwatchRoleArn")(cloudwatchRoleArn.asInstanceOf[js.Any])
    if (throttleSettings != null) __obj.updateDynamic("throttleSettings")(throttleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountState]
  }
}

