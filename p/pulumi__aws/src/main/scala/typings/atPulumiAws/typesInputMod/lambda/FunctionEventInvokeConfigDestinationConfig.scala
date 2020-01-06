package typings.atPulumiAws.typesInputMod.lambda

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionEventInvokeConfigDestinationConfig extends js.Object {
  /**
    * Configuration block with destination configuration for failed asynchronous invocations. See below for details.
    */
  var onFailure: js.UndefOr[Input[FunctionEventInvokeConfigDestinationConfigOnFailure]] = js.native
  /**
    * Configuration block with destination configuration for successful asynchronous invocations. See below for details.
    */
  var onSuccess: js.UndefOr[Input[FunctionEventInvokeConfigDestinationConfigOnSuccess]] = js.native
}

object FunctionEventInvokeConfigDestinationConfig {
  @scala.inline
  def apply(
    onFailure: Input[FunctionEventInvokeConfigDestinationConfigOnFailure] = null,
    onSuccess: Input[FunctionEventInvokeConfigDestinationConfigOnSuccess] = null
  ): FunctionEventInvokeConfigDestinationConfig = {
    val __obj = js.Dynamic.literal()
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure.asInstanceOf[js.Any])
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionEventInvokeConfigDestinationConfig]
  }
}

