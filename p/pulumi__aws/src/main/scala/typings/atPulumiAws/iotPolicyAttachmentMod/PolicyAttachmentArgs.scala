package typings.atPulumiAws.iotPolicyAttachmentMod

import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiAws.iotMod.Policy
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyAttachmentArgs extends js.Object {
  /**
    * The name of the policy to attach.
    */
  val policy: Input[String | Policy]
  /**
    * The identity to which the policy is attached.
    */
  val target: Input[ARN]
}

object PolicyAttachmentArgs {
  @scala.inline
  def apply(policy: Input[String | Policy], target: Input[ARN]): PolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PolicyAttachmentArgs]
  }
}

