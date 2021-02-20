package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionEventInvokeConfigDestinationConfigOnFailure extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the destination resource. See the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations) for acceptable resource types and associated IAM permissions.
    */
  var destination: String = js.native
}
object FunctionEventInvokeConfigDestinationConfigOnFailure {
  
  @scala.inline
  def apply(destination: String): FunctionEventInvokeConfigDestinationConfigOnFailure = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionEventInvokeConfigDestinationConfigOnFailure]
  }
  
  @scala.inline
  implicit class FunctionEventInvokeConfigDestinationConfigOnFailureMutableBuilder[Self <: FunctionEventInvokeConfigDestinationConfigOnFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
  }
}
