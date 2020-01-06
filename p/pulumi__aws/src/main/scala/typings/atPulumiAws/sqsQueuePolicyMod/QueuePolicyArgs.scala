package typings.atPulumiAws.sqsQueuePolicyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueuePolicyArgs extends js.Object {
  val policy: Input[String] = js.native
  /**
    * The URL of the SQS Queue to which to attach the policy
    */
  val queueUrl: Input[String] = js.native
}

object QueuePolicyArgs {
  @scala.inline
  def apply(policy: Input[String], queueUrl: Input[String]): QueuePolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], queueUrl = queueUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueuePolicyArgs]
  }
}

