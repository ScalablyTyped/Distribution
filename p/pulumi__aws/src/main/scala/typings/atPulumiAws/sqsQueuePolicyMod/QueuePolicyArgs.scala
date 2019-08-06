package typings.atPulumiAws.sqsQueuePolicyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueuePolicyArgs extends js.Object {
  /**
    * The JSON policy for the SQS queue.
    */
  val policy: Input[String]
  /**
    * The URL of the SQS Queue to which to attach the policy
    */
  val queueUrl: Input[String]
}

object QueuePolicyArgs {
  @scala.inline
  def apply(policy: Input[String], queueUrl: Input[String]): QueuePolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], queueUrl = queueUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueuePolicyArgs]
  }
}

