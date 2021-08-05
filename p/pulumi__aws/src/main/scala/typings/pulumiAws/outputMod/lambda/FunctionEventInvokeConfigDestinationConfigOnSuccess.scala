package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionEventInvokeConfigDestinationConfigOnSuccess extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the destination resource. See the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations) for acceptable resource types and associated IAM permissions.
    */
  var destination: String
}
object FunctionEventInvokeConfigDestinationConfigOnSuccess {
  
  inline def apply(destination: String): FunctionEventInvokeConfigDestinationConfigOnSuccess = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionEventInvokeConfigDestinationConfigOnSuccess]
  }
  
  extension [Self <: FunctionEventInvokeConfigDestinationConfigOnSuccess](x: Self) {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
  }
}
