package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSourceMappingDestinationConfigOnFailure extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the destination resource.
    */
  var destinationArn: String = js.native
}
object EventSourceMappingDestinationConfigOnFailure {
  
  @scala.inline
  def apply(destinationArn: String): EventSourceMappingDestinationConfigOnFailure = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceMappingDestinationConfigOnFailure]
  }
  
  @scala.inline
  implicit class EventSourceMappingDestinationConfigOnFailureMutableBuilder[Self <: EventSourceMappingDestinationConfigOnFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationArn(value: String): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
  }
}
