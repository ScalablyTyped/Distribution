package typings.pulumiAws.inputMod.lambda

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSourceMappingDestinationConfigOnFailure extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the destination resource.
    */
  var destinationArn: Input[String] = js.native
}

object EventSourceMappingDestinationConfigOnFailure {
  @scala.inline
  def apply(destinationArn: Input[String]): EventSourceMappingDestinationConfigOnFailure = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventSourceMappingDestinationConfigOnFailure]
  }
}

