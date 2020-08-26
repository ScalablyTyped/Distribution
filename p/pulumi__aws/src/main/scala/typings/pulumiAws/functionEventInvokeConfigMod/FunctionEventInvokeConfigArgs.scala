package typings.pulumiAws.functionEventInvokeConfigMod

import typings.pulumiAws.inputMod.lambda.FunctionEventInvokeConfigDestinationConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionEventInvokeConfigArgs extends js.Object {
  /**
    * Configuration block with destination configuration. See below for details.
    */
  val destinationConfig: js.UndefOr[Input[FunctionEventInvokeConfigDestinationConfig]] = js.native
  /**
    * Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
    */
  val functionName: Input[String] = js.native
  /**
    * Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
    */
  val maximumEventAgeInSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
    */
  val maximumRetryAttempts: js.UndefOr[Input[Double]] = js.native
  /**
    * Lambda Function published version, `$LATEST`, or Lambda Alias name.
    */
  val qualifier: js.UndefOr[Input[String]] = js.native
}

object FunctionEventInvokeConfigArgs {
  @scala.inline
  def apply(functionName: Input[String]): FunctionEventInvokeConfigArgs = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionEventInvokeConfigArgs]
  }
  @scala.inline
  implicit class FunctionEventInvokeConfigArgsOps[Self <: FunctionEventInvokeConfigArgs] (val x: Self) extends AnyVal {
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
    def setFunctionName(value: Input[String]): Self = this.set("functionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationConfig(value: Input[FunctionEventInvokeConfigDestinationConfig]): Self = this.set("destinationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationConfig: Self = this.set("destinationConfig", js.undefined)
    @scala.inline
    def setMaximumEventAgeInSeconds(value: Input[Double]): Self = this.set("maximumEventAgeInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumEventAgeInSeconds: Self = this.set("maximumEventAgeInSeconds", js.undefined)
    @scala.inline
    def setMaximumRetryAttempts(value: Input[Double]): Self = this.set("maximumRetryAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumRetryAttempts: Self = this.set("maximumRetryAttempts", js.undefined)
    @scala.inline
    def setQualifier(value: Input[String]): Self = this.set("qualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualifier: Self = this.set("qualifier", js.undefined)
  }
  
}

