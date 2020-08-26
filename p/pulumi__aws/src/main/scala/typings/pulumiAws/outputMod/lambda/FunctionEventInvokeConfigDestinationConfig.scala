package typings.pulumiAws.outputMod.lambda

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
  def apply(): FunctionEventInvokeConfigDestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionEventInvokeConfigDestinationConfig]
  }
  @scala.inline
  implicit class FunctionEventInvokeConfigDestinationConfigOps[Self <: FunctionEventInvokeConfigDestinationConfig] (val x: Self) extends AnyVal {
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
    def setOnFailure(value: FunctionEventInvokeConfigDestinationConfigOnFailure): Self = this.set("onFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    @scala.inline
    def setOnSuccess(value: FunctionEventInvokeConfigDestinationConfigOnSuccess): Self = this.set("onSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
  }
  
}

