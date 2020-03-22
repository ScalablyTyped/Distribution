package typings.pulumiAws.inputMod.lambda

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSourceMappingDestinationConfig extends js.Object {
  /**
    * The destination configuration for failed invocations. Detailed below.
    */
  var onFailure: js.UndefOr[Input[EventSourceMappingDestinationConfigOnFailure]] = js.native
}

object EventSourceMappingDestinationConfig {
  @scala.inline
  def apply(onFailure: Input[EventSourceMappingDestinationConfigOnFailure] = null): EventSourceMappingDestinationConfig = {
    val __obj = js.Dynamic.literal()
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceMappingDestinationConfig]
  }
}

