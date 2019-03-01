package typings
package atPulumiAwsLib.cloudwatchLogDestinationPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogDestinationPolicyState extends js.Object {
  /**
    * The policy document. This is a JSON formatted string.
    */
  val accessPolicy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A name for the subscription filter
    */
  val destinationName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object LogDestinationPolicyState {
  @scala.inline
  def apply(
    accessPolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    destinationName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): LogDestinationPolicyState = {
    val __obj = js.Dynamic.literal()
    if (accessPolicy != null) __obj.updateDynamic("accessPolicy")(accessPolicy.asInstanceOf[js.Any])
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogDestinationPolicyState]
  }
}

