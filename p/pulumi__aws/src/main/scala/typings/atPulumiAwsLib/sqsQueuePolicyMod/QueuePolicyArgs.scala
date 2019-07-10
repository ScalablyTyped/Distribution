package typings
package atPulumiAwsLib.sqsQueuePolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueuePolicyArgs extends js.Object {
  val policy: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The URL of the SQS Queue to which to attach the policy
    */
  val queueUrl: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object QueuePolicyArgs {
  @scala.inline
  def apply(
    policy: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    queueUrl: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): QueuePolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], queueUrl = queueUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueuePolicyArgs]
  }
}

