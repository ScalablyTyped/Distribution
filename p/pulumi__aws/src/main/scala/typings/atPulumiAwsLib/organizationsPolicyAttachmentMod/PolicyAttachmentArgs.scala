package typings
package atPulumiAwsLib.organizationsPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyAttachmentArgs extends js.Object {
  /**
    * The unique identifier (ID) of the policy that you want to attach to the target.
    */
  val policyId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
    */
  val targetId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object PolicyAttachmentArgs {
  @scala.inline
  def apply(
    policyId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    targetId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): PolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(policyId = policyId.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PolicyAttachmentArgs]
  }
}

