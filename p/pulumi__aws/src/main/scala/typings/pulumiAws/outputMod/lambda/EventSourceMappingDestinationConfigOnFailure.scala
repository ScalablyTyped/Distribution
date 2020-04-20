package typings.pulumiAws.outputMod.lambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSourceMappingDestinationConfigOnFailure extends js.Object {
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
}

