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
  def apply(): AccountState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountState]
  }
  @scala.inline
  implicit class AccountStateOps[Self <: AccountState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCloudwatchRoleArn(value: Input[String]): Self = this.set("cloudwatchRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudwatchRoleArn: Self = this.set("cloudwatchRoleArn", js.undefined)
    @scala.inline
    def setThrottleSettings(value: Input[AccountThrottleSettings]): Self = this.set("throttleSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottleSettings: Self = this.set("throttleSettings", js.undefined)
  }
  
}

