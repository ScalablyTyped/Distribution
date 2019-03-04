package typings
package atPulumiAwsLib.iotPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyAttachmentArgs extends js.Object {
  /**
    * The name of the policy to attach.
    */
  val policy: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iotMod.Policy]
  /**
    * The identity to which the policy is attached.
    */
  val target: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]
}

object PolicyAttachmentArgs {
  @scala.inline
  def apply(
    policy: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iotMod.Policy],
    target: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]
  ): PolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PolicyAttachmentArgs]
  }
}

