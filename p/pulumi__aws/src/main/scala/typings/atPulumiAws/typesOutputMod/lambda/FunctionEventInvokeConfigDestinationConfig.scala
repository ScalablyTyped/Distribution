package typings.atPulumiAws.typesOutputMod.lambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionEventInvokeConfigDestinationConfig extends js.Object {
  /**
    * Configuration block with destination configuration for failed asynchronous invocations. See below for details.
    */
  var onFailure: js.UndefOr[FunctionEventInvokeConfigDestinationConfigOnFailure] = js.native
  /**
    * Configuration block with destination configuration for successful asynchronous invocations. See below for details.
    */
  var onSuccess: js.UndefOr[FunctionEventInvokeConfigDestinationConfigOnSuccess] = js.native
}

object FunctionEventInvokeConfigDestinationConfig {
  @scala.inline
  def apply(
    onFailure: FunctionEventInvokeConfigDestinationConfigOnFailure = null,
    onSuccess: FunctionEventInvokeConfigDestinationConfigOnSuccess = null
  ): FunctionEventInvokeConfigDestinationConfig = {
    val __obj = js.Dynamic.literal()
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure.asInstanceOf[js.Any])
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionEventInvokeConfigDestinationConfig]
  }
}

