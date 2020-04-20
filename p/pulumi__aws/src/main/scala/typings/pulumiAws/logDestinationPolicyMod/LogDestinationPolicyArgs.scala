package typings.pulumiAws.logDestinationPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogDestinationPolicyArgs extends js.Object {
  /**
    * The policy document. This is a JSON formatted string.
    */
  val accessPolicy: Input[String] = js.native
  /**
    * A name for the subscription filter
    */
  val destinationName: Input[String] = js.native
}

object LogDestinationPolicyArgs {
  @scala.inline
  def apply(accessPolicy: Input[String], destinationName: Input[String]): LogDestinationPolicyArgs = {
    val __obj = js.Dynamic.literal(accessPolicy = accessPolicy.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogDestinationPolicyArgs]
  }
}

