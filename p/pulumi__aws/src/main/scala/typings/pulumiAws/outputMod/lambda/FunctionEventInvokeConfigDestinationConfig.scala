package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionEventInvokeConfigDestinationConfig extends StObject {
  
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
  implicit class FunctionEventInvokeConfigDestinationConfigMutableBuilder[Self <: FunctionEventInvokeConfigDestinationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnFailure(value: FunctionEventInvokeConfigDestinationConfigOnFailure): Self = StObject.set(x, "onFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: FunctionEventInvokeConfigDestinationConfigOnSuccess): Self = StObject.set(x, "onSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
  }
}
