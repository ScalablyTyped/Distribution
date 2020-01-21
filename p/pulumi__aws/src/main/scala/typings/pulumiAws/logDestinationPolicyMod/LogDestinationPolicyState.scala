package typings.pulumiAws.logDestinationPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogDestinationPolicyState extends js.Object {
  /**
    * The policy document. This is a JSON formatted string.
    */
  val accessPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * A name for the subscription filter
    */
  val destinationName: js.UndefOr[Input[String]] = js.native
}

object LogDestinationPolicyState {
  @scala.inline
  def apply(accessPolicy: Input[String] = null, destinationName: Input[String] = null): LogDestinationPolicyState = {
    val __obj = js.Dynamic.literal()
    if (accessPolicy != null) __obj.updateDynamic("accessPolicy")(accessPolicy.asInstanceOf[js.Any])
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogDestinationPolicyState]
  }
}

