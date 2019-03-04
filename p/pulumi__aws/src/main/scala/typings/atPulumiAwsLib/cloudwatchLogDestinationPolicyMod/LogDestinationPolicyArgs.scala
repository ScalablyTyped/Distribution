package typings
package atPulumiAwsLib.cloudwatchLogDestinationPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogDestinationPolicyArgs extends js.Object {
  /**
    * The policy document. This is a JSON formatted string.
    */
  val accessPolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A name for the subscription filter
    */
  val destinationName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object LogDestinationPolicyArgs {
  @scala.inline
  def apply(
    accessPolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    destinationName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): LogDestinationPolicyArgs = {
    val __obj = js.Dynamic.literal(accessPolicy = accessPolicy.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogDestinationPolicyArgs]
  }
}

