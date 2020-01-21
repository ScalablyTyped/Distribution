package typings.pulumiAws.iotPolicyAttachmentMod

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.iotMod.Policy
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyAttachmentArgs extends js.Object {
  /**
    * The name of the policy to attach.
    */
  val policy: Input[String | Policy] = js.native
  /**
    * The identity to which the policy is attached.
    */
  val target: Input[ARN] = js.native
}

object PolicyAttachmentArgs {
  @scala.inline
  def apply(policy: Input[String | Policy], target: Input[ARN]): PolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PolicyAttachmentArgs]
  }
}

