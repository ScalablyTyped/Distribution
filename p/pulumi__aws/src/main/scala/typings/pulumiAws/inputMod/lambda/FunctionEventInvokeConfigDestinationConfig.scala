package typings.pulumiAws.inputMod.lambda

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def setOnFailure(value: Input[FunctionEventInvokeConfigDestinationConfigOnFailure]): Self = this.set("onFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: Input[FunctionEventInvokeConfigDestinationConfigOnSuccess]): Self = this.set("onSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
  }
}
