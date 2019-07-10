package typings
package atPulumiAwsLib.sqsQueuePolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueuePolicyState extends js.Object {
  val policy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The URL of the SQS Queue to which to attach the policy
    */
  val queueUrl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object QueuePolicyState {
  @scala.inline
  def apply(
    policy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    queueUrl: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): QueuePolicyState = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (queueUrl != null) __obj.updateDynamic("queueUrl")(queueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueuePolicyState]
  }
}

