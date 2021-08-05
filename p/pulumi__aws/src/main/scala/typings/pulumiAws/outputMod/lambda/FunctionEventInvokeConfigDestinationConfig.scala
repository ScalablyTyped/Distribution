package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionEventInvokeConfigDestinationConfig extends StObject {
  
  /**
    * Configuration block with destination configuration for failed asynchronous invocations. See below for details.
    */
  var onFailure: js.UndefOr[FunctionEventInvokeConfigDestinationConfigOnFailure] = js.undefined
  
  /**
    * Configuration block with destination configuration for successful asynchronous invocations. See below for details.
    */
  var onSuccess: js.UndefOr[FunctionEventInvokeConfigDestinationConfigOnSuccess] = js.undefined
}
object FunctionEventInvokeConfigDestinationConfig {
  
  inline def apply(): FunctionEventInvokeConfigDestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionEventInvokeConfigDestinationConfig]
  }
  
  extension [Self <: FunctionEventInvokeConfigDestinationConfig](x: Self) {
    
    inline def setOnFailure(value: FunctionEventInvokeConfigDestinationConfigOnFailure): Self = StObject.set(x, "onFailure", value.asInstanceOf[js.Any])
    
    inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    inline def setOnSuccess(value: FunctionEventInvokeConfigDestinationConfigOnSuccess): Self = StObject.set(x, "onSuccess", value.asInstanceOf[js.Any])
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
  }
}
