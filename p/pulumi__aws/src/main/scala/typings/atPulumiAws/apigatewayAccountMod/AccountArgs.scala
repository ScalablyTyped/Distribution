package typings.atPulumiAws.apigatewayAccountMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountArgs extends js.Object {
  /**
    * The ARN of an IAM role for CloudWatch (to allow logging & monitoring).
    * See more [in AWS Docs](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-stage-settings.html#how-to-stage-settings-console).
    * Logging & monitoring can be enabled/disabled and otherwise tuned on the API Gateway Stage level.
    */
  val cloudwatchRoleArn: js.UndefOr[Input[String]] = js.undefined
}

object AccountArgs {
  @scala.inline
  def apply(cloudwatchRoleArn: Input[String] = null): AccountArgs = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchRoleArn != null) __obj.updateDynamic("cloudwatchRoleArn")(cloudwatchRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountArgs]
  }
}

